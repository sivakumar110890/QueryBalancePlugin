package com.emagine.querybal.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertiesLoader {

	//private static String PROPERTIES_FILENAME = "/config/aa/query_balance.properties";
	private static String PROPERTIES_FILENAME = "/config/query_balance.properties";

	public static Properties properties = null;

	private static final Logger LOGGER = Logger.getLogger(PropertiesLoader.class);

	// These keys are defined in query_balance.properties file...

	public static void loadProperties() throws Exception {
		String userDir = System.getProperty("user.dir");
		File aFile = new File(userDir + PROPERTIES_FILENAME);
		if (aFile.exists()) {
			InputStream inputStream = null;
			try {
				inputStream = new FileInputStream(aFile);
				properties = new Properties();
				properties.load(inputStream);
				LOGGER.debug("loadProperties method :: loaded the property file");
			} catch (Exception e) {
				e.printStackTrace();
				LOGGER.error(
						"loadProperties method :: Error Loading query_balance Properties From File: " + aFile.getName());
				throw e;
			} finally {
				if (inputStream != null) {
					try {
						inputStream.close();
					} catch (Exception e) {
						e.printStackTrace();
						LOGGER.error("loadProperties method :: Error Closing The Input Stream. Ignore For Now");
						throw e;
					}
				}
			}
		} else {
			throw new FileNotFoundException(aFile.getAbsoluteFile().getName() + " Is NOT Found");
		}
	}

	public static String getValue(String propertyKey) throws Exception {
		try {
			if (properties == null) {
				LOGGER.info(
						"getValue method :: First Call to get a value from query_balance.properties file. Should see this line only once...");
				loadProperties();
			}
		} catch (Exception e) {
			LOGGER.error("getValue :: Mostly query_balance.properties File is NOT there. Error Getting the Value For Key: "
					+ propertyKey);
			e.printStackTrace();
			throw e;
		}
		return properties.getProperty(propertyKey);
	}

	public static int getIntValue(String cmpPropertyKey) throws Exception {
		String stringValue = getValue(cmpPropertyKey);
		if (stringValue != null && stringValue.trim().length() != 0) {
			return (new Integer(stringValue)).intValue();
		}
		return 0;
	}

	public static String reloadProperties() throws Exception {
		try {
			properties = null;
			loadProperties();
			return "SUCCESS";
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw e;
		}
	}
}