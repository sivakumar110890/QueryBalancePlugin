
package com.huawei.bme.cbsinterface.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 该参数仅在CBS方案中有效
 * 
 * <p>Java class for OneTimeCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OneTimeCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToCredit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OneTimeFee" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="SubTradeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="MainProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
 *                             &lt;element name="AccessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="ProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
 *                             &lt;element name="ChargeAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
 *                             &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ToBilling" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubFeeList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SubFeeValue" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
 *                                       &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
 *                                       &lt;element name="ItemList">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ItemValue" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ItemId">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="32"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Bsno" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Remark" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="128"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TradeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ToAR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fee2arRequestValue" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
 *                             &lt;element name="AcctCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *                             &lt;element name="CustId" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerID"/>
 *                             &lt;element name="CustCode" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerCode" minOccurs="0"/>
 *                             &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
 *                             &lt;element name="Msisdn" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
 *                             &lt;element name="TeleType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="InvoiceDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                             &lt;element name="DueDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                             &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Bsno">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="isCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ChannelId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="32"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Remark" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="128"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Fee2arRequestDetailList">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Fee2arRequestDetailValue" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                 &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                 &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                 &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                                                 &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                                                 &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *                                                 &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                                                 &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
 *                                                 &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                                                 &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                                                 &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneTimeCharge", propOrder = {
    "toCredit",
    "toBilling",
    "toAR"
})
public class OneTimeCharge {

    @XmlElementRef(name = "ToCredit", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
    protected JAXBElement<OneTimeCharge.ToCredit> toCredit;
    @XmlElementRef(name = "ToBilling", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
    protected JAXBElement<OneTimeCharge.ToBilling> toBilling;
    @XmlElementRef(name = "ToAR", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
    protected JAXBElement<OneTimeCharge.ToAR> toAR;

    /**
     * Gets the value of the toCredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OneTimeCharge.ToCredit }{@code >}
     *     
     */
    public JAXBElement<OneTimeCharge.ToCredit> getToCredit() {
        return toCredit;
    }

    /**
     * Sets the value of the toCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OneTimeCharge.ToCredit }{@code >}
     *     
     */
    public void setToCredit(JAXBElement<OneTimeCharge.ToCredit> value) {
        this.toCredit = value;
    }

    /**
     * Gets the value of the toBilling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OneTimeCharge.ToBilling }{@code >}
     *     
     */
    public JAXBElement<OneTimeCharge.ToBilling> getToBilling() {
        return toBilling;
    }

    /**
     * Sets the value of the toBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OneTimeCharge.ToBilling }{@code >}
     *     
     */
    public void setToBilling(JAXBElement<OneTimeCharge.ToBilling> value) {
        this.toBilling = value;
    }

    /**
     * Gets the value of the toAR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OneTimeCharge.ToAR }{@code >}
     *     
     */
    public JAXBElement<OneTimeCharge.ToAR> getToAR() {
        return toAR;
    }

    /**
     * Sets the value of the toAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OneTimeCharge.ToAR }{@code >}
     *     
     */
    public void setToAR(JAXBElement<OneTimeCharge.ToAR> value) {
        this.toAR = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Fee2arRequestValue" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
     *                   &lt;element name="AcctCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
     *                   &lt;element name="CustId" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerID"/>
     *                   &lt;element name="CustCode" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerCode" minOccurs="0"/>
     *                   &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
     *                   &lt;element name="Msisdn" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
     *                   &lt;element name="TeleType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="InvoiceDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *                   &lt;element name="DueDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *                   &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Bsno">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="isCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ChannelId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="32"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Remark" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="128"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Fee2arRequestDetailList">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Fee2arRequestDetailValue" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                       &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                       &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                       &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *                                       &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *                                       &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *                                       &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *                                       &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
     *                                       &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                                       &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                                       &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fee2ArRequestValue"
    })
    public static class ToAR {

        @XmlElement(name = "Fee2arRequestValue", required = true)
        protected List<OneTimeCharge.ToAR.Fee2ArRequestValue> fee2ArRequestValue;

        /**
         * Gets the value of the fee2ArRequestValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee2ArRequestValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee2ArRequestValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneTimeCharge.ToAR.Fee2ArRequestValue }
         * 
         * 
         */
        public List<OneTimeCharge.ToAR.Fee2ArRequestValue> getFee2ArRequestValue() {
            if (fee2ArRequestValue == null) {
                fee2ArRequestValue = new ArrayList<OneTimeCharge.ToAR.Fee2ArRequestValue>();
            }
            return this.fee2ArRequestValue;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
         *         &lt;element name="AcctCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
         *         &lt;element name="CustId" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerID"/>
         *         &lt;element name="CustCode" type="{http://www.huawei.com/bme/cbsinterface/common}CustomerCode" minOccurs="0"/>
         *         &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
         *         &lt;element name="Msisdn" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
         *         &lt;element name="TeleType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="InvoiceDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
         *         &lt;element name="DueDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
         *         &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Bsno">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="isCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ChannelId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="32"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Remark" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="128"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Fee2arRequestDetailList">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Fee2arRequestDetailValue" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                             &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                             &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                             &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
         *                             &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
         *                             &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
         *                             &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
         *                             &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
         *                             &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *                             &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *                             &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "acctId",
            "acctCode",
            "custId",
            "custCode",
            "subId",
            "msisdn",
            "teleType",
            "invoiceDate",
            "dueDate",
            "busiType",
            "bsno",
            "isCustomer",
            "channelId",
            "remark",
            "fee2ArRequestDetailList"
        })
        public static class Fee2ArRequestValue {

            @XmlElement(name = "AcctId", required = true)
            protected String acctId;
            @XmlElementRef(name = "AcctCode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<String> acctCode;
            @XmlElement(name = "CustId", required = true)
            protected String custId;
            @XmlElementRef(name = "CustCode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<String> custCode;
            @XmlElementRef(name = "SubId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<String> subId;
            @XmlElementRef(name = "Msisdn", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<String> msisdn;
            @XmlElementRef(name = "TeleType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<String> teleType;
            @XmlElement(name = "InvoiceDate", required = true)
            protected String invoiceDate;
            @XmlElement(name = "DueDate", required = true)
            protected String dueDate;
            @XmlElement(name = "BusiType", required = true)
            protected String busiType;
            @XmlElement(name = "Bsno", required = true)
            protected String bsno;
            @XmlElement(required = true)
            protected String isCustomer;
            @XmlElementRef(name = "ChannelId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<String> channelId;
            @XmlElementRef(name = "Remark", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<String> remark;
            @XmlElement(name = "Fee2arRequestDetailList", required = true)
            protected OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList fee2ArRequestDetailList;

            /**
             * Gets the value of the acctId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctId() {
                return acctId;
            }

            /**
             * Sets the value of the acctId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctId(String value) {
                this.acctId = value;
            }

            /**
             * Gets the value of the acctCode property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getAcctCode() {
                return acctCode;
            }

            /**
             * Sets the value of the acctCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setAcctCode(JAXBElement<String> value) {
                this.acctCode = value;
            }

            /**
             * Gets the value of the custId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustId() {
                return custId;
            }

            /**
             * Sets the value of the custId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustId(String value) {
                this.custId = value;
            }

            /**
             * Gets the value of the custCode property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCustCode() {
                return custCode;
            }

            /**
             * Sets the value of the custCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCustCode(JAXBElement<String> value) {
                this.custCode = value;
            }

            /**
             * Gets the value of the subId property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSubId() {
                return subId;
            }

            /**
             * Sets the value of the subId property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSubId(JAXBElement<String> value) {
                this.subId = value;
            }

            /**
             * Gets the value of the msisdn property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getMsisdn() {
                return msisdn;
            }

            /**
             * Sets the value of the msisdn property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setMsisdn(JAXBElement<String> value) {
                this.msisdn = value;
            }

            /**
             * Gets the value of the teleType property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTeleType() {
                return teleType;
            }

            /**
             * Sets the value of the teleType property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTeleType(JAXBElement<String> value) {
                this.teleType = value;
            }

            /**
             * Gets the value of the invoiceDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvoiceDate() {
                return invoiceDate;
            }

            /**
             * Sets the value of the invoiceDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvoiceDate(String value) {
                this.invoiceDate = value;
            }

            /**
             * Gets the value of the dueDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDueDate() {
                return dueDate;
            }

            /**
             * Sets the value of the dueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDueDate(String value) {
                this.dueDate = value;
            }

            /**
             * Gets the value of the busiType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusiType() {
                return busiType;
            }

            /**
             * Sets the value of the busiType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusiType(String value) {
                this.busiType = value;
            }

            /**
             * Gets the value of the bsno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBsno() {
                return bsno;
            }

            /**
             * Sets the value of the bsno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBsno(String value) {
                this.bsno = value;
            }

            /**
             * Gets the value of the isCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsCustomer() {
                return isCustomer;
            }

            /**
             * Sets the value of the isCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsCustomer(String value) {
                this.isCustomer = value;
            }

            /**
             * Gets the value of the channelId property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getChannelId() {
                return channelId;
            }

            /**
             * Sets the value of the channelId property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setChannelId(JAXBElement<String> value) {
                this.channelId = value;
            }

            /**
             * Gets the value of the remark property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getRemark() {
                return remark;
            }

            /**
             * Sets the value of the remark property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setRemark(JAXBElement<String> value) {
                this.remark = value;
            }

            /**
             * Gets the value of the fee2ArRequestDetailList property.
             * 
             * @return
             *     possible object is
             *     {@link OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList }
             *     
             */
            public OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList getFee2ArRequestDetailList() {
                return fee2ArRequestDetailList;
            }

            /**
             * Sets the value of the fee2ArRequestDetailList property.
             * 
             * @param value
             *     allowed object is
             *     {@link OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList }
             *     
             */
            public void setFee2ArRequestDetailList(OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList value) {
                this.fee2ArRequestDetailList = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Fee2arRequestDetailValue" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                   &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                   &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                   &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
             *                   &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
             *                   &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
             *                   &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
             *                   &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
             *                   &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
             *                   &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
             *                   &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fee2ArRequestDetailValue"
            })
            public static class Fee2ArRequestDetailList {

                @XmlElement(name = "Fee2arRequestDetailValue", nillable = true)
                protected List<OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue> fee2ArRequestDetailValue;

                /**
                 * Gets the value of the fee2ArRequestDetailValue property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fee2ArRequestDetailValue property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFee2ArRequestDetailValue().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue }
                 * 
                 * 
                 */
                public List<OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue> getFee2ArRequestDetailValue() {
                    if (fee2ArRequestDetailValue == null) {
                        fee2ArRequestDetailValue = new ArrayList<OneTimeCharge.ToAR.Fee2ArRequestValue.Fee2ArRequestDetailList.Fee2ArRequestDetailValue>();
                    }
                    return this.fee2ArRequestDetailValue;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *         &lt;element name="backQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *         &lt;element name="salesQty" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *         &lt;element name="unitPrice" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                 *         &lt;element name="charge" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                 *         &lt;element name="discountAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                 *         &lt;element name="transDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
                 *         &lt;element name="salesDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime"/>
                 *         &lt;element name="feeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="billCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="taxInclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="glacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="waiveGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="rebateGlcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="rebateAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
                 *         &lt;element name="resTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="resModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="resId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="resAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
                 *         &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="spCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="prmFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="feeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class Fee2ArRequestDetailValue {

                    @XmlElement(required = true)
                    protected String transType;
                    @XmlElement(required = true)
                    protected String productName;
                    protected long orderQty;
                    protected long backQty;
                    protected long salesQty;
                    protected long unitPrice;
                    protected long charge;
                    protected long discountAmt;
                    @XmlElement(required = true)
                    protected String transDate;
                    @XmlElement(required = true)
                    protected String salesDate;
                    @XmlElement(required = true)
                    protected String feeItemCode;
                    @XmlElementRef(name = "billCycleId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> billCycleId;
                    @XmlElementRef(name = "taxInclusive", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> taxInclusive;
                    @XmlElementRef(name = "glacode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> glacode;
                    @XmlElementRef(name = "waiveGlCode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> waiveGlCode;
                    @XmlElementRef(name = "rebateGlcode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> rebateGlcode;
                    @XmlElementRef(name = "rebateAmt", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<Long> rebateAmt;
                    @XmlElementRef(name = "resTypeId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> resTypeId;
                    @XmlElementRef(name = "resModelId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> resModelId;
                    @XmlElementRef(name = "resId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> resId;
                    @XmlElementRef(name = "resCode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> resCode;
                    @XmlElementRef(name = "resAmout", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<Long> resAmout;
                    @XmlElementRef(name = "refNo", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> refNo;
                    @XmlElementRef(name = "feeType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> feeType;
                    @XmlElementRef(name = "productId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> productId;
                    @XmlElementRef(name = "spCpId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> spCpId;
                    @XmlElementRef(name = "serviceId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> serviceId;
                    @XmlElementRef(name = "prmFlag", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> prmFlag;
                    @XmlElementRef(name = "serviceType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> serviceType;
                    @XmlElementRef(name = "serviceCategory", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> serviceCategory;
                    @XmlElementRef(name = "reasonCode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> reasonCode;
                    @XmlElementRef(name = "feeSubType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> feeSubType;
                    @XmlElementRef(name = "invoiceType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> invoiceType;
                    @XmlElementRef(name = "remark", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> remark;

                    /**
                     * Gets the value of the transType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTransType() {
                        return transType;
                    }

                    /**
                     * Sets the value of the transType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTransType(String value) {
                        this.transType = value;
                    }

                    /**
                     * Gets the value of the productName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductName() {
                        return productName;
                    }

                    /**
                     * Sets the value of the productName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductName(String value) {
                        this.productName = value;
                    }

                    /**
                     * Gets the value of the orderQty property.
                     * 
                     */
                    public long getOrderQty() {
                        return orderQty;
                    }

                    /**
                     * Sets the value of the orderQty property.
                     * 
                     */
                    public void setOrderQty(long value) {
                        this.orderQty = value;
                    }

                    /**
                     * Gets the value of the backQty property.
                     * 
                     */
                    public long getBackQty() {
                        return backQty;
                    }

                    /**
                     * Sets the value of the backQty property.
                     * 
                     */
                    public void setBackQty(long value) {
                        this.backQty = value;
                    }

                    /**
                     * Gets the value of the salesQty property.
                     * 
                     */
                    public long getSalesQty() {
                        return salesQty;
                    }

                    /**
                     * Sets the value of the salesQty property.
                     * 
                     */
                    public void setSalesQty(long value) {
                        this.salesQty = value;
                    }

                    /**
                     * Gets the value of the unitPrice property.
                     * 
                     */
                    public long getUnitPrice() {
                        return unitPrice;
                    }

                    /**
                     * Sets the value of the unitPrice property.
                     * 
                     */
                    public void setUnitPrice(long value) {
                        this.unitPrice = value;
                    }

                    /**
                     * Gets the value of the charge property.
                     * 
                     */
                    public long getCharge() {
                        return charge;
                    }

                    /**
                     * Sets the value of the charge property.
                     * 
                     */
                    public void setCharge(long value) {
                        this.charge = value;
                    }

                    /**
                     * Gets the value of the discountAmt property.
                     * 
                     */
                    public long getDiscountAmt() {
                        return discountAmt;
                    }

                    /**
                     * Sets the value of the discountAmt property.
                     * 
                     */
                    public void setDiscountAmt(long value) {
                        this.discountAmt = value;
                    }

                    /**
                     * Gets the value of the transDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTransDate() {
                        return transDate;
                    }

                    /**
                     * Sets the value of the transDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTransDate(String value) {
                        this.transDate = value;
                    }

                    /**
                     * Gets the value of the salesDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSalesDate() {
                        return salesDate;
                    }

                    /**
                     * Sets the value of the salesDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSalesDate(String value) {
                        this.salesDate = value;
                    }

                    /**
                     * Gets the value of the feeItemCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFeeItemCode() {
                        return feeItemCode;
                    }

                    /**
                     * Sets the value of the feeItemCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFeeItemCode(String value) {
                        this.feeItemCode = value;
                    }

                    /**
                     * Gets the value of the billCycleId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getBillCycleId() {
                        return billCycleId;
                    }

                    /**
                     * Sets the value of the billCycleId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setBillCycleId(JAXBElement<String> value) {
                        this.billCycleId = value;
                    }

                    /**
                     * Gets the value of the taxInclusive property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getTaxInclusive() {
                        return taxInclusive;
                    }

                    /**
                     * Sets the value of the taxInclusive property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setTaxInclusive(JAXBElement<String> value) {
                        this.taxInclusive = value;
                    }

                    /**
                     * Gets the value of the glacode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getGlacode() {
                        return glacode;
                    }

                    /**
                     * Sets the value of the glacode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setGlacode(JAXBElement<String> value) {
                        this.glacode = value;
                    }

                    /**
                     * Gets the value of the waiveGlCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getWaiveGlCode() {
                        return waiveGlCode;
                    }

                    /**
                     * Sets the value of the waiveGlCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setWaiveGlCode(JAXBElement<String> value) {
                        this.waiveGlCode = value;
                    }

                    /**
                     * Gets the value of the rebateGlcode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getRebateGlcode() {
                        return rebateGlcode;
                    }

                    /**
                     * Sets the value of the rebateGlcode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setRebateGlcode(JAXBElement<String> value) {
                        this.rebateGlcode = value;
                    }

                    /**
                     * Gets the value of the rebateAmt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
                     *     
                     */
                    public JAXBElement<Long> getRebateAmt() {
                        return rebateAmt;
                    }

                    /**
                     * Sets the value of the rebateAmt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
                     *     
                     */
                    public void setRebateAmt(JAXBElement<Long> value) {
                        this.rebateAmt = value;
                    }

                    /**
                     * Gets the value of the resTypeId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getResTypeId() {
                        return resTypeId;
                    }

                    /**
                     * Sets the value of the resTypeId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setResTypeId(JAXBElement<String> value) {
                        this.resTypeId = value;
                    }

                    /**
                     * Gets the value of the resModelId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getResModelId() {
                        return resModelId;
                    }

                    /**
                     * Sets the value of the resModelId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setResModelId(JAXBElement<String> value) {
                        this.resModelId = value;
                    }

                    /**
                     * Gets the value of the resId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getResId() {
                        return resId;
                    }

                    /**
                     * Sets the value of the resId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setResId(JAXBElement<String> value) {
                        this.resId = value;
                    }

                    /**
                     * Gets the value of the resCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getResCode() {
                        return resCode;
                    }

                    /**
                     * Sets the value of the resCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setResCode(JAXBElement<String> value) {
                        this.resCode = value;
                    }

                    /**
                     * Gets the value of the resAmout property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
                     *     
                     */
                    public JAXBElement<Long> getResAmout() {
                        return resAmout;
                    }

                    /**
                     * Sets the value of the resAmout property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
                     *     
                     */
                    public void setResAmout(JAXBElement<Long> value) {
                        this.resAmout = value;
                    }

                    /**
                     * Gets the value of the refNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getRefNo() {
                        return refNo;
                    }

                    /**
                     * Sets the value of the refNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setRefNo(JAXBElement<String> value) {
                        this.refNo = value;
                    }

                    /**
                     * Gets the value of the feeType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getFeeType() {
                        return feeType;
                    }

                    /**
                     * Sets the value of the feeType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setFeeType(JAXBElement<String> value) {
                        this.feeType = value;
                    }

                    /**
                     * Gets the value of the productId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getProductId() {
                        return productId;
                    }

                    /**
                     * Sets the value of the productId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setProductId(JAXBElement<String> value) {
                        this.productId = value;
                    }

                    /**
                     * Gets the value of the spCpId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getSpCpId() {
                        return spCpId;
                    }

                    /**
                     * Sets the value of the spCpId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setSpCpId(JAXBElement<String> value) {
                        this.spCpId = value;
                    }

                    /**
                     * Gets the value of the serviceId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getServiceId() {
                        return serviceId;
                    }

                    /**
                     * Sets the value of the serviceId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setServiceId(JAXBElement<String> value) {
                        this.serviceId = value;
                    }

                    /**
                     * Gets the value of the prmFlag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getPrmFlag() {
                        return prmFlag;
                    }

                    /**
                     * Sets the value of the prmFlag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setPrmFlag(JAXBElement<String> value) {
                        this.prmFlag = value;
                    }

                    /**
                     * Gets the value of the serviceType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getServiceType() {
                        return serviceType;
                    }

                    /**
                     * Sets the value of the serviceType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setServiceType(JAXBElement<String> value) {
                        this.serviceType = value;
                    }

                    /**
                     * Gets the value of the serviceCategory property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getServiceCategory() {
                        return serviceCategory;
                    }

                    /**
                     * Sets the value of the serviceCategory property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setServiceCategory(JAXBElement<String> value) {
                        this.serviceCategory = value;
                    }

                    /**
                     * Gets the value of the reasonCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getReasonCode() {
                        return reasonCode;
                    }

                    /**
                     * Sets the value of the reasonCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setReasonCode(JAXBElement<String> value) {
                        this.reasonCode = value;
                    }

                    /**
                     * Gets the value of the feeSubType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getFeeSubType() {
                        return feeSubType;
                    }

                    /**
                     * Sets the value of the feeSubType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setFeeSubType(JAXBElement<String> value) {
                        this.feeSubType = value;
                    }

                    /**
                     * Gets the value of the invoiceType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getInvoiceType() {
                        return invoiceType;
                    }

                    /**
                     * Sets the value of the invoiceType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setInvoiceType(JAXBElement<String> value) {
                        this.invoiceType = value;
                    }

                    /**
                     * Gets the value of the remark property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getRemark() {
                        return remark;
                    }

                    /**
                     * Sets the value of the remark property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setRemark(JAXBElement<String> value) {
                        this.remark = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SubFeeList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SubFeeValue" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
     *                             &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
     *                             &lt;element name="ItemList">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ItemValue" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ItemId">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;maxLength value="32"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BusiType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Bsno" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Remark" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="128"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TradeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subFeeList",
        "busiType",
        "bsno",
        "channelId",
        "remark",
        "tradeTime"
    })
    public static class ToBilling {

        @XmlElement(name = "SubFeeList", required = true)
        protected OneTimeCharge.ToBilling.SubFeeList subFeeList;
        @XmlElementRef(name = "BusiType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
        protected JAXBElement<String> busiType;
        @XmlElementRef(name = "Bsno", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
        protected JAXBElement<String> bsno;
        @XmlElementRef(name = "ChannelId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
        protected JAXBElement<String> channelId;
        @XmlElementRef(name = "Remark", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
        protected JAXBElement<String> remark;
        @XmlElementRef(name = "TradeTime", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
        protected JAXBElement<String> tradeTime;

        /**
         * Gets the value of the subFeeList property.
         * 
         * @return
         *     possible object is
         *     {@link OneTimeCharge.ToBilling.SubFeeList }
         *     
         */
        public OneTimeCharge.ToBilling.SubFeeList getSubFeeList() {
            return subFeeList;
        }

        /**
         * Sets the value of the subFeeList property.
         * 
         * @param value
         *     allowed object is
         *     {@link OneTimeCharge.ToBilling.SubFeeList }
         *     
         */
        public void setSubFeeList(OneTimeCharge.ToBilling.SubFeeList value) {
            this.subFeeList = value;
        }

        /**
         * Gets the value of the busiType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBusiType() {
            return busiType;
        }

        /**
         * Sets the value of the busiType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBusiType(JAXBElement<String> value) {
            this.busiType = value;
        }

        /**
         * Gets the value of the bsno property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBsno() {
            return bsno;
        }

        /**
         * Sets the value of the bsno property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBsno(JAXBElement<String> value) {
            this.bsno = value;
        }

        /**
         * Gets the value of the channelId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getChannelId() {
            return channelId;
        }

        /**
         * Sets the value of the channelId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setChannelId(JAXBElement<String> value) {
            this.channelId = value;
        }

        /**
         * Gets the value of the remark property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRemark() {
            return remark;
        }

        /**
         * Sets the value of the remark property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRemark(JAXBElement<String> value) {
            this.remark = value;
        }

        /**
         * Gets the value of the tradeTime property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTradeTime() {
            return tradeTime;
        }

        /**
         * Sets the value of the tradeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTradeTime(JAXBElement<String> value) {
            this.tradeTime = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SubFeeValue" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
         *                   &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
         *                   &lt;element name="ItemList">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ItemValue" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ItemId">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;maxLength value="32"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "subFeeValue"
        })
        public static class SubFeeList {

            @XmlElement(name = "SubFeeValue", required = true)
            protected List<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue> subFeeValue;

            /**
             * Gets the value of the subFeeValue property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subFeeValue property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubFeeValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue }
             * 
             * 
             */
            public List<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue> getSubFeeValue() {
                if (subFeeValue == null) {
                    subFeeValue = new ArrayList<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue>();
                }
                return this.subFeeValue;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="AcctId" type="{http://www.huawei.com/bme/cbsinterface/common}AccountID"/>
             *         &lt;element name="SubId" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberCode" minOccurs="0"/>
             *         &lt;element name="ItemList">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ItemValue" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ItemId">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;maxLength value="32"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "acctId",
                "subId",
                "itemList"
            })
            public static class SubFeeValue {

                @XmlElement(name = "AcctId", required = true)
                protected String acctId;
                @XmlElementRef(name = "SubId", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
                protected JAXBElement<String> subId;
                @XmlElement(name = "ItemList", required = true)
                protected OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList itemList;

                /**
                 * Gets the value of the acctId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAcctId() {
                    return acctId;
                }

                /**
                 * Sets the value of the acctId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAcctId(String value) {
                    this.acctId = value;
                }

                /**
                 * Gets the value of the subId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getSubId() {
                    return subId;
                }

                /**
                 * Sets the value of the subId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setSubId(JAXBElement<String> value) {
                    this.subId = value;
                }

                /**
                 * Gets the value of the itemList property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList }
                 *     
                 */
                public OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList getItemList() {
                    return itemList;
                }

                /**
                 * Sets the value of the itemList property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList }
                 *     
                 */
                public void setItemList(OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList value) {
                    this.itemList = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="ItemValue" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ItemId">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;maxLength value="32"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "itemValue"
                })
                public static class ItemList {

                    @XmlElement(name = "ItemValue", required = true)
                    protected List<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue> itemValue;

                    /**
                     * Gets the value of the itemValue property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the itemValue property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getItemValue().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue }
                     * 
                     * 
                     */
                    public List<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue> getItemValue() {
                        if (itemValue == null) {
                            itemValue = new ArrayList<OneTimeCharge.ToBilling.SubFeeList.SubFeeValue.ItemList.ItemValue>();
                        }
                        return this.itemValue;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="ItemId">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;maxLength value="32"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "itemId",
                        "amount"
                    })
                    public static class ItemValue {

                        @XmlElement(name = "ItemId", required = true)
                        protected String itemId;
                        @XmlElement(name = "Amount")
                        protected long amount;

                        /**
                         * Gets the value of the itemId property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getItemId() {
                            return itemId;
                        }

                        /**
                         * Sets the value of the itemId property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setItemId(String value) {
                            this.itemId = value;
                        }

                        /**
                         * Gets the value of the amount property.
                         * 
                         */
                        public long getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         */
                        public void setAmount(long value) {
                            this.amount = value;
                        }

                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OneTimeFee" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="SubTradeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="MainProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
     *                   &lt;element name="AccessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="ProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
     *                   &lt;element name="ChargeAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
     *                   &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oneTimeFee"
    })
    public static class ToCredit {

        @XmlElement(name = "OneTimeFee", required = true)
        protected List<OneTimeCharge.ToCredit.OneTimeFee> oneTimeFee;

        /**
         * Gets the value of the oneTimeFee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneTimeFee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneTimeFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneTimeCharge.ToCredit.OneTimeFee }
         * 
         * 
         */
        public List<OneTimeCharge.ToCredit.OneTimeFee> getOneTimeFee() {
            if (oneTimeFee == null) {
                oneTimeFee = new ArrayList<OneTimeCharge.ToCredit.OneTimeFee>();
            }
            return this.oneTimeFee;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="SubTradeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="MainProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
         *         &lt;element name="AccessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="ProductKey" type="{http://www.huawei.com/bme/cbsinterface/common}ProductId" minOccurs="0"/>
         *         &lt;element name="ChargeAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
         *         &lt;element name="AccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "operationID",
            "subTradeType",
            "mainProductKey",
            "accessMode",
            "productKey",
            "chargeAmount",
            "subscriberNo",
            "accountCode"
        })
        public static class OneTimeFee {

            @XmlElementRef(name = "OperationID", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> operationID;
            @XmlElementRef(name = "SubTradeType", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> subTradeType;
            @XmlElementRef(name = "MainProductKey", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> mainProductKey;
            @XmlElementRef(name = "AccessMode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> accessMode;
            @XmlElementRef(name = "ProductKey", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> productKey;
            @XmlElementRef(name = "ChargeAmount", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> chargeAmount;
            @XmlElementRef(name = "SubscriberNo", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<String> subscriberNo;
            @XmlElementRef(name = "AccountCode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
            protected JAXBElement<String> accountCode;

            /**
             * Gets the value of the operationID property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getOperationID() {
                return operationID;
            }

            /**
             * Sets the value of the operationID property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setOperationID(JAXBElement<Integer> value) {
                this.operationID = value;
            }

            /**
             * Gets the value of the subTradeType property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getSubTradeType() {
                return subTradeType;
            }

            /**
             * Sets the value of the subTradeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setSubTradeType(JAXBElement<Integer> value) {
                this.subTradeType = value;
            }

            /**
             * Gets the value of the mainProductKey property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getMainProductKey() {
                return mainProductKey;
            }

            /**
             * Sets the value of the mainProductKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setMainProductKey(JAXBElement<Integer> value) {
                this.mainProductKey = value;
            }

            /**
             * Gets the value of the accessMode property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getAccessMode() {
                return accessMode;
            }

            /**
             * Sets the value of the accessMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setAccessMode(JAXBElement<Integer> value) {
                this.accessMode = value;
            }

            /**
             * Gets the value of the productKey property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getProductKey() {
                return productKey;
            }

            /**
             * Sets the value of the productKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setProductKey(JAXBElement<Integer> value) {
                this.productKey = value;
            }

            /**
             * Gets the value of the chargeAmount property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getChargeAmount() {
                return chargeAmount;
            }

            /**
             * Sets the value of the chargeAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setChargeAmount(JAXBElement<Long> value) {
                this.chargeAmount = value;
            }

            /**
             * Gets the value of the subscriberNo property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSubscriberNo() {
                return subscriberNo;
            }

            /**
             * Sets the value of the subscriberNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSubscriberNo(JAXBElement<String> value) {
                this.subscriberNo = value;
            }

            /**
             * Gets the value of the accountCode property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getAccountCode() {
                return accountCode;
            }

            /**
             * Sets the value of the accountCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setAccountCode(JAXBElement<String> value) {
                this.accountCode = value;
            }

        }

    }

}
