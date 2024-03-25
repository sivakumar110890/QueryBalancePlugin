package com.emagine.querybal.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.log4j.Logger;
import com.emagine.querybal.config.PropertiesLoader;
import com.emagine.querybal.model.IncomingRequest;
import com.emagine.querybal.utils.QueryBalanceConstant;
import com.emagine.querybal.utils.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class AirtimeAdvanceClient {

	private static final Logger LOGGER = Logger.getLogger(AirtimeAdvanceClient.class);
	private static String requestXmlTemplate = null;
	
	public static void loadReqestXml() {
		FileInputStream fin = null;
		if(requestXmlTemplate == null) {
			try
			{
				String userDir = System.getProperty("user.dir");
				//String requestFile = userDir + "/config/aa/airtimeAdvanceRequest.xml";
				String requestFile = userDir + "/config/airtimeAdvanceRequest.xml";
				fin = new FileInputStream(requestFile);
				ByteArrayOutputStream bout = new ByteArrayOutputStream();
				copy(fin, bout);
				fin.close();
		
				byte[] requestBytes = bout.toByteArray();
				requestXmlTemplate=new String(requestBytes);
				//LOGGER.debug("loadReqestXml - requestXmlTemplate - "+ requestXmlTemplate);
			} catch (Exception ex) {
				LOGGER.error("loadReqestXml - Exception - ", ex);
			}
			finally {
				if (fin != null) {
					try {
						fin.close();
					} catch (Exception e) {
						LOGGER.error("loadReqestXml - File close exception - ", e);
					}
				}
			}
		}
	}
	
	public long callAirtimeAdvanceService(IncomingRequest requestParams) {
		long avaiLoanAmount = 0;
		HttpURLConnection  mConnection ;
		String requestStr;
		String responseStr;
		try {
			String serialNo = Utils.getSerialNumber();
			requestStr = requestXmlTemplate;
			requestStr = requestStr.replaceAll("#SubscriberNo#", requestParams.getSubscriberId());
			requestStr = requestStr.replaceAll("#SerialNo#", serialNo);
			LOGGER.debug("callAirtimeAdvanceService - requestStr - "+ requestStr);
			String endPointUrlStr = PropertiesLoader.getValue(QueryBalanceConstant.OCS_AA_WSDL_LOC);
			URL endPointUrl = new URL(endPointUrlStr);
			mConnection = (HttpURLConnection) endPointUrl.openConnection() ;
			mConnection.setRequestProperty("Content-Type", "application/soap+xml");
			mConnection.setConnectTimeout(PropertiesLoader.getIntValue(QueryBalanceConstant.AA_CONN_TIMEOUT_MILLIS));
			mConnection.setReadTimeout(PropertiesLoader.getIntValue(QueryBalanceConstant.AA_READ_TIMEOUT_MILLIS));
			mConnection.setRequestMethod("POST");
			writePostData(requestStr, mConnection);
			responseStr = readSuccessStream(mConnection);
			LOGGER.debug("callAirtimeAdvanceService - responseStr - "+ responseStr);
			if(responseStr != null) {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				factory.setNamespaceAware(true);
				DocumentBuilder builder = factory.newDocumentBuilder();
				InputSource is = new InputSource();
			    is.setCharacterStream(new StringReader(responseStr));
				Document document = builder.parse(is);
				String loanAmount = "0";
				
				Node loanAmountNode = document.getDocumentElement().getElementsByTagNameNS("*",PropertiesLoader.getValue(QueryBalanceConstant.XML_LOAN_AMOUNT_TAG_NAME)).item(0);
				if(loanAmountNode != null) {
					loanAmount = loanAmountNode.getTextContent();
				}
						
				String maxLoan = document.getDocumentElement().getElementsByTagNameNS("*",PropertiesLoader.getValue(QueryBalanceConstant.XML_MAX_LOAN_TAG_NAME)).item(0).getTextContent();
				avaiLoanAmount = Long.parseLong(maxLoan)*PropertiesLoader.getIntValue(QueryBalanceConstant.CURRENCY_MULTIPLIER_1) - Long.parseLong(loanAmount);
				if(avaiLoanAmount < 0) {
					avaiLoanAmount = 0;
				}
				LOGGER.debug("callAirtimeAdvanceService - avaiLoanAmount - "+ avaiLoanAmount);
			}

		} catch (Exception e) {
			LOGGER.error("callAirtimeAdvanceService - Exception", e);
		}
		return avaiLoanAmount;
	}
	
	public void writePostData(String aStrPostData, HttpURLConnection mConnection) throws javax.net.ssl.SSLHandshakeException {
		mConnection.setDoOutput(true);
		BufferedWriter writer = null ;
		try
		{
			int iPodtDataLen = aStrPostData.length() ;
			mConnection.setRequestProperty("Content-Length", Integer.toString(iPodtDataLen));
			LOGGER.debug("HTTPHandlerImpl::sendRequest - Adding Header - Content-Length: " +Integer.toString(iPodtDataLen));
			writer = new BufferedWriter(new OutputStreamWriter((mConnection.getOutputStream())));
			writer.write(aStrPostData, 0, iPodtDataLen);
			writer.flush();
		}
		catch (javax.net.ssl.SSLHandshakeException ex)
		{
			throw ex;
		}
		catch (IOException ex)
		{
			LOGGER.error("HTTPHandlerImpl::writePostData - Exception ", ex);
		}
		finally
		{
			if  (null != writer)
			{
				try
				{
					writer.close();
				}
				catch (Exception ex)
				{
					LOGGER.error("HTTPHandlerImpl::writePostData Close - Exception ", ex);
				}
			}
		}
	}
	
	public String readSuccessStream(HttpURLConnection mConnection) {
		String strResponse = null ;
		BufferedReader inStream = null ;
		try
		{
			inStream = new BufferedReader(new InputStreamReader(mConnection.getInputStream()));
			String inputLine;
			StringBuilder response = new StringBuilder();
			while ((inputLine = inStream.readLine()) != null) {
				response.append(inputLine);
				response.append("\n") ;
			}
			strResponse = response.toString() ;
		}
		catch (IOException ex)
		{
			LOGGER.error("HTTPHandlerImpl::readSuccessStream - Exception ", ex);
		}
		finally
		{
			if  (null != inStream)
			{
				try
				{
					inStream.close();
				}
				catch (Exception ex)
				{
					LOGGER.error("HTTPHandlerImpl::readSuccessStream Close - Exception ", ex);
				}
			}
		}
		return strResponse;
	}
	
	public static void copy(InputStream in, OutputStream out) throws IOException {

		synchronized (in) {
			synchronized (out) {
				byte[] buffer = new byte[256];
				while (true) {
					int bytesRead = in.read(buffer);
					if (bytesRead == -1)
						break;
					out.write(buffer, 0, bytesRead);
				}
			}
		}
	}
}
