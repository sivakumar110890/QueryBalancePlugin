
package com.huawei.bme.cbsinterface.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.acctcredit.CreditType;
import com.huawei.bme.cbsinterface.common.SimpleProperty;
import com.huawei.bme.cbsinterface.subscribe.OfferOrderInfo;


/**
 * <p>Java class for QueryCustomerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerInfo" type="{http://www.huawei.com/bme/cbsinterface/common}Customer" minOccurs="0"/>
 *                   &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo">
 *                           &lt;sequence>
 *                             &lt;element name="LevelCode" type="{http://www.huawei.com/bme/cbsinterface/common}OfferLevel"/>
 *                             &lt;element name="OfferType" type="{http://www.huawei.com/bme/cbsinterface/common}OfferType"/>
 *                             &lt;element name="BundleSubscriber" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PrimaryOfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccumulatorList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
 *         &lt;element name="Account" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="AccountInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Account">
 *                           &lt;sequence>
 *                             &lt;element name="IsCustShareAcct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BillingCycleDate" type="{http://www.huawei.com/bme/cbsinterface/query}BillingCycleDate" minOccurs="0"/>
 *                   &lt;element name="NewBillingCycleDate" type="{http://www.huawei.com/bme/cbsinterface/query}BillingCycleDate" minOccurs="0"/>
 *                   &lt;element name="BalanceRecordList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Balance" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded"/>
 *                             &lt;element name="BalanceValidity" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="AvailableCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="BalanceActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccountState" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OfferList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Offer" type="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProductList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccountCredit" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InitialCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="BillCycleCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="TempCreditList" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="Subscriber" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
 *                   &lt;element name="SubscriberInfo" type="{http://www.huawei.com/bme/cbsinterface/query}SubscriberInfo" minOccurs="0"/>
 *                   &lt;element name="SubscriberState" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="FirstActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                             &lt;element name="LastRechargeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                             &lt;element name="ActiveCAC" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="DPFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="FraudState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="LossFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="DPEndDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                             &lt;element name="DPFlag1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="DPFlag2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="LastActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *                             &lt;element name="POSUserState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="ETUFraudState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UserGroupList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UserGroup" type="{http://www.huawei.com/bme/cbsinterface/query}UserGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccumulatorList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ServiceId"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProductList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SubAttachedInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="ChgMainProductTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="ChgMainPackageTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="LoanAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="LoanPoundage" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="ETUReceiveAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="ETUGracePeriod" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                             &lt;element name="UnpaidFee" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *                             &lt;element name="ETUReceivedTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ConsumeAccumuList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
@XmlType(name = "QueryCustomerResult", propOrder = {
    "customer",
    "account",
    "subscriber"
})
public class QueryCustomerResult {

    @XmlElementRef(name = "Customer", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryCustomerResult.Customer> customer;
    @XmlElement(name = "Account", nillable = true)
    protected List<QueryCustomerResult.Account> account;
    @XmlElement(name = "Subscriber", nillable = true)
    protected List<QueryCustomerResult.Subscriber> subscriber;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Customer }{@code >}
     *     
     */
    public JAXBElement<QueryCustomerResult.Customer> getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Customer }{@code >}
     *     
     */
    public void setCustomer(JAXBElement<QueryCustomerResult.Customer> value) {
        this.customer = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCustomerResult.Account }
     * 
     * 
     */
    public List<QueryCustomerResult.Account> getAccount() {
        if (account == null) {
            account = new ArrayList<QueryCustomerResult.Account>();
        }
        return this.account;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCustomerResult.Subscriber }
     * 
     * 
     */
    public List<QueryCustomerResult.Subscriber> getSubscriber() {
        if (subscriber == null) {
            subscriber = new ArrayList<QueryCustomerResult.Subscriber>();
        }
        return this.subscriber;
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
     *         &lt;element name="AccountKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="AccountInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Account">
     *                 &lt;sequence>
     *                   &lt;element name="IsCustShareAcct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BillingCycleDate" type="{http://www.huawei.com/bme/cbsinterface/query}BillingCycleDate" minOccurs="0"/>
     *         &lt;element name="NewBillingCycleDate" type="{http://www.huawei.com/bme/cbsinterface/query}BillingCycleDate" minOccurs="0"/>
     *         &lt;element name="BalanceRecordList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Balance" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded"/>
     *                   &lt;element name="BalanceValidity" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="AvailableCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="BalanceActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccountState" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OfferList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Offer" type="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProductList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccountCredit" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InitialCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="BillCycleCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TempCreditList" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
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
        "accountKey",
        "accountInfo",
        "billingCycleDate",
        "newBillingCycleDate",
        "balanceRecordList",
        "accountState",
        "offerList",
        "productList",
        "accountCredit"
    })
    public static class Account {

        @XmlElement(name = "AccountKey")
        protected long accountKey;
        @XmlElementRef(name = "AccountInfo", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Account.AccountInfo> accountInfo;
        @XmlElementRef(name = "BillingCycleDate", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<BillingCycleDate> billingCycleDate;
        @XmlElementRef(name = "NewBillingCycleDate", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<BillingCycleDate> newBillingCycleDate;
        @XmlElementRef(name = "BalanceRecordList", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Account.BalanceRecordList> balanceRecordList;
        @XmlElementRef(name = "AccountState", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Account.AccountState> accountState;
        @XmlElementRef(name = "OfferList", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Account.OfferList> offerList;
        @XmlElementRef(name = "ProductList", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Account.ProductList> productList;
        @XmlElementRef(name = "AccountCredit", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Account.AccountCredit> accountCredit;

        /**
         * Gets the value of the accountKey property.
         * 
         */
        public long getAccountKey() {
            return accountKey;
        }

        /**
         * Sets the value of the accountKey property.
         * 
         */
        public void setAccountKey(long value) {
            this.accountKey = value;
        }

        /**
         * Gets the value of the accountInfo property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.AccountInfo }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Account.AccountInfo> getAccountInfo() {
            return accountInfo;
        }

        /**
         * Sets the value of the accountInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.AccountInfo }{@code >}
         *     
         */
        public void setAccountInfo(JAXBElement<QueryCustomerResult.Account.AccountInfo> value) {
            this.accountInfo = value;
        }

        /**
         * Gets the value of the billingCycleDate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BillingCycleDate }{@code >}
         *     
         */
        public JAXBElement<BillingCycleDate> getBillingCycleDate() {
            return billingCycleDate;
        }

        /**
         * Sets the value of the billingCycleDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BillingCycleDate }{@code >}
         *     
         */
        public void setBillingCycleDate(JAXBElement<BillingCycleDate> value) {
            this.billingCycleDate = value;
        }

        /**
         * Gets the value of the newBillingCycleDate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BillingCycleDate }{@code >}
         *     
         */
        public JAXBElement<BillingCycleDate> getNewBillingCycleDate() {
            return newBillingCycleDate;
        }

        /**
         * Sets the value of the newBillingCycleDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BillingCycleDate }{@code >}
         *     
         */
        public void setNewBillingCycleDate(JAXBElement<BillingCycleDate> value) {
            this.newBillingCycleDate = value;
        }

        /**
         * Gets the value of the balanceRecordList property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.BalanceRecordList }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Account.BalanceRecordList> getBalanceRecordList() {
            return balanceRecordList;
        }

        /**
         * Sets the value of the balanceRecordList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.BalanceRecordList }{@code >}
         *     
         */
        public void setBalanceRecordList(JAXBElement<QueryCustomerResult.Account.BalanceRecordList> value) {
            this.balanceRecordList = value;
        }

        /**
         * Gets the value of the accountState property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.AccountState }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Account.AccountState> getAccountState() {
            return accountState;
        }

        /**
         * Sets the value of the accountState property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.AccountState }{@code >}
         *     
         */
        public void setAccountState(JAXBElement<QueryCustomerResult.Account.AccountState> value) {
            this.accountState = value;
        }

        /**
         * Gets the value of the offerList property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.OfferList }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Account.OfferList> getOfferList() {
            return offerList;
        }

        /**
         * Sets the value of the offerList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.OfferList }{@code >}
         *     
         */
        public void setOfferList(JAXBElement<QueryCustomerResult.Account.OfferList> value) {
            this.offerList = value;
        }

        /**
         * Gets the value of the productList property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.ProductList }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Account.ProductList> getProductList() {
            return productList;
        }

        /**
         * Sets the value of the productList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.ProductList }{@code >}
         *     
         */
        public void setProductList(JAXBElement<QueryCustomerResult.Account.ProductList> value) {
            this.productList = value;
        }

        /**
         * Gets the value of the accountCredit property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.AccountCredit }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Account.AccountCredit> getAccountCredit() {
            return accountCredit;
        }

        /**
         * Sets the value of the accountCredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Account.AccountCredit }{@code >}
         *     
         */
        public void setAccountCredit(JAXBElement<QueryCustomerResult.Account.AccountCredit> value) {
            this.accountCredit = value;
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
         *         &lt;element name="InitialCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="BillCycleCredit" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TempCreditList" type="{http://www.huawei.com/bme/cbsinterface/acctcredit}CreditType" maxOccurs="unbounded" minOccurs="0"/>
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
            "initialCredit",
            "billCycleCredit",
            "tempCreditList"
        })
        public static class AccountCredit {

            @XmlElement(name = "InitialCredit", nillable = true)
            protected List<CreditType> initialCredit;
            @XmlElement(name = "BillCycleCredit", nillable = true)
            protected List<CreditType> billCycleCredit;
            @XmlElement(name = "TempCreditList", nillable = true)
            protected List<CreditType> tempCreditList;

            /**
             * Gets the value of the initialCredit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the initialCredit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInitialCredit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CreditType }
             * 
             * 
             */
            public List<CreditType> getInitialCredit() {
                if (initialCredit == null) {
                    initialCredit = new ArrayList<CreditType>();
                }
                return this.initialCredit;
            }

            /**
             * Gets the value of the billCycleCredit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the billCycleCredit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBillCycleCredit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CreditType }
             * 
             * 
             */
            public List<CreditType> getBillCycleCredit() {
                if (billCycleCredit == null) {
                    billCycleCredit = new ArrayList<CreditType>();
                }
                return this.billCycleCredit;
            }

            /**
             * Gets the value of the tempCreditList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tempCreditList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTempCreditList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CreditType }
             * 
             * 
             */
            public List<CreditType> getTempCreditList() {
                if (tempCreditList == null) {
                    tempCreditList = new ArrayList<CreditType>();
                }
                return this.tempCreditList;
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/common}Account">
         *       &lt;sequence>
         *         &lt;element name="IsCustShareAcct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "isCustShareAcct"
        })
        public static class AccountInfo
            extends com.huawei.bme.cbsinterface.common.Account
        {

            @XmlElementRef(name = "IsCustShareAcct", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> isCustShareAcct;

            /**
             * Gets the value of the isCustShareAcct property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getIsCustShareAcct() {
                return isCustShareAcct;
            }

            /**
             * Sets the value of the isCustShareAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setIsCustShareAcct(JAXBElement<Boolean> value) {
                this.isCustShareAcct = value;
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
         *         &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
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
            "activeStop",
            "suspendStop",
            "disableStop"
        })
        public static class AccountState {

            @XmlElementRef(name = "ActiveStop", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> activeStop;
            @XmlElementRef(name = "SuspendStop", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> suspendStop;
            @XmlElementRef(name = "DisableStop", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> disableStop;

            /**
             * Gets the value of the activeStop property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getActiveStop() {
                return activeStop;
            }

            /**
             * Sets the value of the activeStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setActiveStop(JAXBElement<String> value) {
                this.activeStop = value;
            }

            /**
             * Gets the value of the suspendStop property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSuspendStop() {
                return suspendStop;
            }

            /**
             * Sets the value of the suspendStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSuspendStop(JAXBElement<String> value) {
                this.suspendStop = value;
            }

            /**
             * Gets the value of the disableStop property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getDisableStop() {
                return disableStop;
            }

            /**
             * Sets the value of the disableStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setDisableStop(JAXBElement<String> value) {
                this.disableStop = value;
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
         *         &lt;element name="Balance" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded"/>
         *         &lt;element name="BalanceValidity" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="AvailableCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="BalanceActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
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
            "balance",
            "balanceValidity",
            "availableCredit",
            "balanceActiveDate"
        })
        public static class BalanceRecordList {

            @XmlElement(name = "Balance", required = true)
            protected List<BalanceType> balance;
            @XmlElementRef(name = "BalanceValidity", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> balanceValidity;
            @XmlElementRef(name = "AvailableCredit", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> availableCredit;
            @XmlElementRef(name = "BalanceActiveDate", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> balanceActiveDate;

            /**
             * Gets the value of the balance property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the balance property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBalance().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BalanceType }
             * 
             * 
             */
            public List<BalanceType> getBalance() {
                if (balance == null) {
                    balance = new ArrayList<BalanceType>();
                }
                return this.balance;
            }

            /**
             * Gets the value of the balanceValidity property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getBalanceValidity() {
                return balanceValidity;
            }

            /**
             * Sets the value of the balanceValidity property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setBalanceValidity(JAXBElement<String> value) {
                this.balanceValidity = value;
            }

            /**
             * Gets the value of the availableCredit property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getAvailableCredit() {
                return availableCredit;
            }

            /**
             * Sets the value of the availableCredit property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setAvailableCredit(JAXBElement<Long> value) {
                this.availableCredit = value;
            }

            /**
             * Gets the value of the balanceActiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getBalanceActiveDate() {
                return balanceActiveDate;
            }

            /**
             * Sets the value of the balanceActiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setBalanceActiveDate(JAXBElement<String> value) {
                this.balanceActiveDate = value;
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
         *         &lt;element name="Offer" type="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo" maxOccurs="unbounded"/>
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
            "offer"
        })
        public static class OfferList {

            @XmlElement(name = "Offer", required = true)
            protected List<OfferOrderInfo> offer;

            /**
             * Gets the value of the offer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOffer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OfferOrderInfo }
             * 
             * 
             */
            public List<OfferOrderInfo> getOffer() {
                if (offer == null) {
                    offer = new ArrayList<OfferOrderInfo>();
                }
                return this.offer;
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
         *         &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
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
            "product"
        })
        public static class ProductList {

            @XmlElement(name = "Product", required = true)
            protected List<ProductOrderInfo> product;

            /**
             * Gets the value of the product property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the product property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProduct().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProductOrderInfo }
             * 
             * 
             */
            public List<ProductOrderInfo> getProduct() {
                if (product == null) {
                    product = new ArrayList<ProductOrderInfo>();
                }
                return this.product;
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
     *         &lt;element name="CustomerInfo" type="{http://www.huawei.com/bme/cbsinterface/common}Customer" minOccurs="0"/>
     *         &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo">
     *                 &lt;sequence>
     *                   &lt;element name="LevelCode" type="{http://www.huawei.com/bme/cbsinterface/common}OfferLevel"/>
     *                   &lt;element name="OfferType" type="{http://www.huawei.com/bme/cbsinterface/common}OfferType"/>
     *                   &lt;element name="BundleSubscriber" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PrimaryOfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccumulatorList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
        "customerInfo",
        "offer",
        "accumulatorList"
    })
    public static class Customer {

        @XmlElementRef(name = "CustomerInfo", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<com.huawei.bme.cbsinterface.common.Customer> customerInfo;
        @XmlElement(name = "Offer", nillable = true)
        protected List<QueryCustomerResult.Customer.Offer> offer;
        @XmlElementRef(name = "AccumulatorList", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Customer.AccumulatorList> accumulatorList;

        /**
         * Gets the value of the customerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link com.huawei.bme.cbsinterface.common.Customer }{@code >}
         *     
         */
        public JAXBElement<com.huawei.bme.cbsinterface.common.Customer> getCustomerInfo() {
            return customerInfo;
        }

        /**
         * Sets the value of the customerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link com.huawei.bme.cbsinterface.common.Customer }{@code >}
         *     
         */
        public void setCustomerInfo(JAXBElement<com.huawei.bme.cbsinterface.common.Customer> value) {
            this.customerInfo = value;
        }

        /**
         * Gets the value of the offer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryCustomerResult.Customer.Offer }
         * 
         * 
         */
        public List<QueryCustomerResult.Customer.Offer> getOffer() {
            if (offer == null) {
                offer = new ArrayList<QueryCustomerResult.Customer.Offer>();
            }
            return this.offer;
        }

        /**
         * Gets the value of the accumulatorList property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Customer.AccumulatorList }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Customer.AccumulatorList> getAccumulatorList() {
            return accumulatorList;
        }

        /**
         * Sets the value of the accumulatorList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Customer.AccumulatorList }{@code >}
         *     
         */
        public void setAccumulatorList(JAXBElement<QueryCustomerResult.Customer.AccumulatorList> value) {
            this.accumulatorList = value;
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
         *         &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
            "accumulator"
        })
        public static class AccumulatorList {

            @XmlElement(name = "Accumulator", required = true)
            protected List<Accumulator> accumulator;

            /**
             * Gets the value of the accumulator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accumulator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccumulator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Accumulator }
             * 
             * 
             */
            public List<Accumulator> getAccumulator() {
                if (accumulator == null) {
                    accumulator = new ArrayList<Accumulator>();
                }
                return this.accumulator;
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
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo">
         *       &lt;sequence>
         *         &lt;element name="LevelCode" type="{http://www.huawei.com/bme/cbsinterface/common}OfferLevel"/>
         *         &lt;element name="OfferType" type="{http://www.huawei.com/bme/cbsinterface/common}OfferType"/>
         *         &lt;element name="BundleSubscriber" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PrimaryOfferOrderKey" type="{http://www.huawei.com/bme/cbsinterface/common}OfferOrderKey" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "levelCode",
            "offerType",
            "bundleSubscriber",
            "primaryOfferOrderKey"
        })
        public static class Offer
            extends OfferOrderInfo
        {

            @XmlElement(name = "LevelCode")
            protected int levelCode;
            @XmlElement(name = "OfferType")
            protected int offerType;
            @XmlElement(name = "BundleSubscriber", nillable = true)
            protected List<QueryCustomerResult.Customer.Offer.BundleSubscriber> bundleSubscriber;
            @XmlElementRef(name = "PrimaryOfferOrderKey", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> primaryOfferOrderKey;

            /**
             * Gets the value of the levelCode property.
             * 
             */
            public int getLevelCode() {
                return levelCode;
            }

            /**
             * Sets the value of the levelCode property.
             * 
             */
            public void setLevelCode(int value) {
                this.levelCode = value;
            }

            /**
             * Gets the value of the offerType property.
             * 
             */
            public int getOfferType() {
                return offerType;
            }

            /**
             * Sets the value of the offerType property.
             * 
             */
            public void setOfferType(int value) {
                this.offerType = value;
            }

            /**
             * Gets the value of the bundleSubscriber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bundleSubscriber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBundleSubscriber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueryCustomerResult.Customer.Offer.BundleSubscriber }
             * 
             * 
             */
            public List<QueryCustomerResult.Customer.Offer.BundleSubscriber> getBundleSubscriber() {
                if (bundleSubscriber == null) {
                    bundleSubscriber = new ArrayList<QueryCustomerResult.Customer.Offer.BundleSubscriber>();
                }
                return this.bundleSubscriber;
            }

            /**
             * Gets the value of the primaryOfferOrderKey property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getPrimaryOfferOrderKey() {
                return primaryOfferOrderKey;
            }

            /**
             * Sets the value of the primaryOfferOrderKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setPrimaryOfferOrderKey(JAXBElement<Long> value) {
                this.primaryOfferOrderKey = value;
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
             *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
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
                "subscriberNo"
            })
            public static class BundleSubscriber {

                @XmlElement(name = "SubscriberNo", required = true)
                protected String subscriberNo;

                /**
                 * Gets the value of the subscriberNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubscriberNo() {
                    return subscriberNo;
                }

                /**
                 * Sets the value of the subscriberNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubscriberNo(String value) {
                    this.subscriberNo = value;
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
     *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo"/>
     *         &lt;element name="SubscriberInfo" type="{http://www.huawei.com/bme/cbsinterface/query}SubscriberInfo" minOccurs="0"/>
     *         &lt;element name="SubscriberState" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="FirstActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *                   &lt;element name="LastRechargeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *                   &lt;element name="ActiveCAC" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="DPFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="FraudState" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="LossFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="DPEndDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *                   &lt;element name="DPFlag1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="DPFlag2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="LastActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
     *                   &lt;element name="POSUserState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="ETUFraudState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UserGroupList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UserGroup" type="{http://www.huawei.com/bme/cbsinterface/query}UserGroup" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccumulatorList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ServiceId"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProductList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SubAttachedInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ChgMainProductTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="ChgMainPackageTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="LoanAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="LoanPoundage" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="ETUReceiveAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="ETUGracePeriod" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *                   &lt;element name="UnpaidFee" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
     *                   &lt;element name="ETUReceivedTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ConsumeAccumuList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
        "subscriberNo",
        "subscriberInfo",
        "subscriberState",
        "userGroupList",
        "accumulatorList",
        "service",
        "productList",
        "subAttachedInfo",
        "consumeAccumuList"
    })
    public static class Subscriber {

        @XmlElement(name = "SubscriberNo", required = true)
        protected String subscriberNo;
        @XmlElementRef(name = "SubscriberInfo", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<SubscriberInfo> subscriberInfo;
        @XmlElementRef(name = "SubscriberState", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Subscriber.SubscriberState> subscriberState;
        @XmlElementRef(name = "UserGroupList", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Subscriber.UserGroupList> userGroupList;
        @XmlElementRef(name = "AccumulatorList", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Subscriber.AccumulatorList> accumulatorList;
        @XmlElement(name = "Service", nillable = true)
        protected List<QueryCustomerResult.Subscriber.Service> service;
        @XmlElementRef(name = "ProductList", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Subscriber.ProductList> productList;
        @XmlElementRef(name = "SubAttachedInfo", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Subscriber.SubAttachedInfo> subAttachedInfo;
        @XmlElementRef(name = "ConsumeAccumuList", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
        protected JAXBElement<QueryCustomerResult.Subscriber.ConsumeAccumuList> consumeAccumuList;

        /**
         * Gets the value of the subscriberNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriberNo() {
            return subscriberNo;
        }

        /**
         * Sets the value of the subscriberNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriberNo(String value) {
            this.subscriberNo = value;
        }

        /**
         * Gets the value of the subscriberInfo property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SubscriberInfo }{@code >}
         *     
         */
        public JAXBElement<SubscriberInfo> getSubscriberInfo() {
            return subscriberInfo;
        }

        /**
         * Sets the value of the subscriberInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SubscriberInfo }{@code >}
         *     
         */
        public void setSubscriberInfo(JAXBElement<SubscriberInfo> value) {
            this.subscriberInfo = value;
        }

        /**
         * Gets the value of the subscriberState property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.SubscriberState }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Subscriber.SubscriberState> getSubscriberState() {
            return subscriberState;
        }

        /**
         * Sets the value of the subscriberState property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.SubscriberState }{@code >}
         *     
         */
        public void setSubscriberState(JAXBElement<QueryCustomerResult.Subscriber.SubscriberState> value) {
            this.subscriberState = value;
        }

        /**
         * Gets the value of the userGroupList property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.UserGroupList }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Subscriber.UserGroupList> getUserGroupList() {
            return userGroupList;
        }

        /**
         * Sets the value of the userGroupList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.UserGroupList }{@code >}
         *     
         */
        public void setUserGroupList(JAXBElement<QueryCustomerResult.Subscriber.UserGroupList> value) {
            this.userGroupList = value;
        }

        /**
         * Gets the value of the accumulatorList property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.AccumulatorList }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Subscriber.AccumulatorList> getAccumulatorList() {
            return accumulatorList;
        }

        /**
         * Sets the value of the accumulatorList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.AccumulatorList }{@code >}
         *     
         */
        public void setAccumulatorList(JAXBElement<QueryCustomerResult.Subscriber.AccumulatorList> value) {
            this.accumulatorList = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryCustomerResult.Subscriber.Service }
         * 
         * 
         */
        public List<QueryCustomerResult.Subscriber.Service> getService() {
            if (service == null) {
                service = new ArrayList<QueryCustomerResult.Subscriber.Service>();
            }
            return this.service;
        }

        /**
         * Gets the value of the productList property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.ProductList }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Subscriber.ProductList> getProductList() {
            return productList;
        }

        /**
         * Sets the value of the productList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.ProductList }{@code >}
         *     
         */
        public void setProductList(JAXBElement<QueryCustomerResult.Subscriber.ProductList> value) {
            this.productList = value;
        }

        /**
         * Gets the value of the subAttachedInfo property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.SubAttachedInfo }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Subscriber.SubAttachedInfo> getSubAttachedInfo() {
            return subAttachedInfo;
        }

        /**
         * Sets the value of the subAttachedInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.SubAttachedInfo }{@code >}
         *     
         */
        public void setSubAttachedInfo(JAXBElement<QueryCustomerResult.Subscriber.SubAttachedInfo> value) {
            this.subAttachedInfo = value;
        }

        /**
         * Gets the value of the consumeAccumuList property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.ConsumeAccumuList }{@code >}
         *     
         */
        public JAXBElement<QueryCustomerResult.Subscriber.ConsumeAccumuList> getConsumeAccumuList() {
            return consumeAccumuList;
        }

        /**
         * Sets the value of the consumeAccumuList property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QueryCustomerResult.Subscriber.ConsumeAccumuList }{@code >}
         *     
         */
        public void setConsumeAccumuList(JAXBElement<QueryCustomerResult.Subscriber.ConsumeAccumuList> value) {
            this.consumeAccumuList = value;
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
         *         &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
            "accumulator"
        })
        public static class AccumulatorList {

            @XmlElement(name = "Accumulator", required = true)
            protected List<Accumulator> accumulator;

            /**
             * Gets the value of the accumulator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accumulator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccumulator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Accumulator }
             * 
             * 
             */
            public List<Accumulator> getAccumulator() {
                if (accumulator == null) {
                    accumulator = new ArrayList<Accumulator>();
                }
                return this.accumulator;
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
         *         &lt;element name="Accumulator" type="{http://www.huawei.com/bme/cbsinterface/query}Accumulator" maxOccurs="unbounded"/>
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
            "accumulator"
        })
        public static class ConsumeAccumuList {

            @XmlElement(name = "Accumulator", required = true)
            protected List<Accumulator> accumulator;

            /**
             * Gets the value of the accumulator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accumulator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccumulator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Accumulator }
             * 
             * 
             */
            public List<Accumulator> getAccumulator() {
                if (accumulator == null) {
                    accumulator = new ArrayList<Accumulator>();
                }
                return this.accumulator;
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
         *         &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/query}ProductOrderInfo" maxOccurs="unbounded"/>
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
            "product"
        })
        public static class ProductList {

            @XmlElement(name = "Product", required = true)
            protected List<ProductOrderInfo> product;

            /**
             * Gets the value of the product property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the product property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProduct().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProductOrderInfo }
             * 
             * 
             */
            public List<ProductOrderInfo> getProduct() {
                if (product == null) {
                    product = new ArrayList<ProductOrderInfo>();
                }
                return this.product;
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
         *         &lt;element name="Id" type="{http://www.huawei.com/bme/cbsinterface/common}ServiceId"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/common}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
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
            "id",
            "status",
            "simpleProperty"
        })
        public static class Service {

            @XmlElement(name = "Id")
            protected int id;
            @XmlElementRef(name = "Status", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> status;
            @XmlElement(name = "SimpleProperty", nillable = true)
            protected List<SimpleProperty> simpleProperty;

            /**
             * Gets the value of the id property.
             * 
             */
            public int getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             */
            public void setId(int value) {
                this.id = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setStatus(JAXBElement<Integer> value) {
                this.status = value;
            }

            /**
             * Gets the value of the simpleProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSimpleProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SimpleProperty }
             * 
             * 
             */
            public List<SimpleProperty> getSimpleProperty() {
                if (simpleProperty == null) {
                    simpleProperty = new ArrayList<SimpleProperty>();
                }
                return this.simpleProperty;
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
         *       &lt;all>
         *         &lt;element name="ChgMainProductTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="ChgMainPackageTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="LoanAmout" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="LoanPoundage" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="ETUReceiveAmt" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="ETUGracePeriod" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
         *         &lt;element name="UnpaidFee" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
         *         &lt;element name="ETUReceivedTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
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
        public static class SubAttachedInfo {

            @XmlElementRef(name = "ChgMainProductTimes", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> chgMainProductTimes;
            @XmlElementRef(name = "ChgMainPackageTimes", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> chgMainPackageTimes;
            @XmlElementRef(name = "LoanAmout", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> loanAmout;
            @XmlElementRef(name = "LoanPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> loanPoundage;
            @XmlElementRef(name = "ETUReceiveAmt", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> etuReceiveAmt;
            @XmlElementRef(name = "ETUGracePeriod", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> etuGracePeriod;
            @XmlElementRef(name = "UnpaidFee", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Long> unpaidFee;
            @XmlElementRef(name = "ETUReceivedTime", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> etuReceivedTime;

            /**
             * Gets the value of the chgMainProductTimes property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getChgMainProductTimes() {
                return chgMainProductTimes;
            }

            /**
             * Sets the value of the chgMainProductTimes property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setChgMainProductTimes(JAXBElement<Integer> value) {
                this.chgMainProductTimes = value;
            }

            /**
             * Gets the value of the chgMainPackageTimes property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getChgMainPackageTimes() {
                return chgMainPackageTimes;
            }

            /**
             * Sets the value of the chgMainPackageTimes property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setChgMainPackageTimes(JAXBElement<Integer> value) {
                this.chgMainPackageTimes = value;
            }

            /**
             * Gets the value of the loanAmout property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getLoanAmout() {
                return loanAmout;
            }

            /**
             * Sets the value of the loanAmout property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setLoanAmout(JAXBElement<Long> value) {
                this.loanAmout = value;
            }

            /**
             * Gets the value of the loanPoundage property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getLoanPoundage() {
                return loanPoundage;
            }

            /**
             * Sets the value of the loanPoundage property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setLoanPoundage(JAXBElement<Long> value) {
                this.loanPoundage = value;
            }

            /**
             * Gets the value of the etuReceiveAmt property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getETUReceiveAmt() {
                return etuReceiveAmt;
            }

            /**
             * Sets the value of the etuReceiveAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setETUReceiveAmt(JAXBElement<Long> value) {
                this.etuReceiveAmt = value;
            }

            /**
             * Gets the value of the etuGracePeriod property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getETUGracePeriod() {
                return etuGracePeriod;
            }

            /**
             * Sets the value of the etuGracePeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setETUGracePeriod(JAXBElement<String> value) {
                this.etuGracePeriod = value;
            }

            /**
             * Gets the value of the unpaidFee property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public JAXBElement<Long> getUnpaidFee() {
                return unpaidFee;
            }

            /**
             * Sets the value of the unpaidFee property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Long }{@code >}
             *     
             */
            public void setUnpaidFee(JAXBElement<Long> value) {
                this.unpaidFee = value;
            }

            /**
             * Gets the value of the etuReceivedTime property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getETUReceivedTime() {
                return etuReceivedTime;
            }

            /**
             * Sets the value of the etuReceivedTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setETUReceivedTime(JAXBElement<String> value) {
                this.etuReceivedTime = value;
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
         *       &lt;all>
         *         &lt;element name="FirstActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
         *         &lt;element name="LastRechargeTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
         *         &lt;element name="ActiveCAC" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ActiveStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="SuspendStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="DisableStop" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="DPFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="FraudState" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="LossFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="DPEndDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
         *         &lt;element name="DPFlag1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="DPFlag2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="LastActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
         *         &lt;element name="POSUserState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="ETUFraudState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        public static class SubscriberState {

            @XmlElementRef(name = "FirstActiveDate", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> firstActiveDate;
            @XmlElementRef(name = "LastRechargeTime", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> lastRechargeTime;
            @XmlElementRef(name = "ActiveCAC", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> activeCAC;
            @XmlElementRef(name = "ActiveStop", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> activeStop;
            @XmlElementRef(name = "SuspendStop", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> suspendStop;
            @XmlElementRef(name = "DisableStop", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> disableStop;
            @XmlElementRef(name = "LifeCycleState", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> lifeCycleState;
            @XmlElement(name = "DPFlag", required = true, type = Integer.class, nillable = true)
            protected Integer dpFlag;
            @XmlElement(name = "FraudState", required = true, type = Integer.class, nillable = true)
            protected Integer fraudState;
            @XmlElementRef(name = "LossFlag", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> lossFlag;
            @XmlElementRef(name = "DPEndDate", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> dpEndDate;
            @XmlElementRef(name = "DPFlag1", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> dpFlag1;
            @XmlElementRef(name = "DPFlag2", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> dpFlag2;
            @XmlElementRef(name = "LastActiveDate", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<String> lastActiveDate;
            @XmlElementRef(name = "POSUserState", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> posUserState;
            @XmlElementRef(name = "ETUFraudState", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> etuFraudState;

            /**
             * Gets the value of the firstActiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getFirstActiveDate() {
                return firstActiveDate;
            }

            /**
             * Sets the value of the firstActiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setFirstActiveDate(JAXBElement<String> value) {
                this.firstActiveDate = value;
            }

            /**
             * Gets the value of the lastRechargeTime property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getLastRechargeTime() {
                return lastRechargeTime;
            }

            /**
             * Sets the value of the lastRechargeTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setLastRechargeTime(JAXBElement<String> value) {
                this.lastRechargeTime = value;
            }

            /**
             * Gets the value of the activeCAC property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getActiveCAC() {
                return activeCAC;
            }

            /**
             * Sets the value of the activeCAC property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setActiveCAC(JAXBElement<String> value) {
                this.activeCAC = value;
            }

            /**
             * Gets the value of the activeStop property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getActiveStop() {
                return activeStop;
            }

            /**
             * Sets the value of the activeStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setActiveStop(JAXBElement<String> value) {
                this.activeStop = value;
            }

            /**
             * Gets the value of the suspendStop property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSuspendStop() {
                return suspendStop;
            }

            /**
             * Sets the value of the suspendStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSuspendStop(JAXBElement<String> value) {
                this.suspendStop = value;
            }

            /**
             * Gets the value of the disableStop property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getDisableStop() {
                return disableStop;
            }

            /**
             * Sets the value of the disableStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setDisableStop(JAXBElement<String> value) {
                this.disableStop = value;
            }

            /**
             * Gets the value of the lifeCycleState property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getLifeCycleState() {
                return lifeCycleState;
            }

            /**
             * Sets the value of the lifeCycleState property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setLifeCycleState(JAXBElement<Integer> value) {
                this.lifeCycleState = value;
            }

            /**
             * Gets the value of the dpFlag property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDPFlag() {
                return dpFlag;
            }

            /**
             * Sets the value of the dpFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDPFlag(Integer value) {
                this.dpFlag = value;
            }

            /**
             * Gets the value of the fraudState property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFraudState() {
                return fraudState;
            }

            /**
             * Sets the value of the fraudState property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFraudState(Integer value) {
                this.fraudState = value;
            }

            /**
             * Gets the value of the lossFlag property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getLossFlag() {
                return lossFlag;
            }

            /**
             * Sets the value of the lossFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setLossFlag(JAXBElement<Integer> value) {
                this.lossFlag = value;
            }

            /**
             * Gets the value of the dpEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getDPEndDate() {
                return dpEndDate;
            }

            /**
             * Sets the value of the dpEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setDPEndDate(JAXBElement<String> value) {
                this.dpEndDate = value;
            }

            /**
             * Gets the value of the dpFlag1 property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getDPFlag1() {
                return dpFlag1;
            }

            /**
             * Sets the value of the dpFlag1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setDPFlag1(JAXBElement<Integer> value) {
                this.dpFlag1 = value;
            }

            /**
             * Gets the value of the dpFlag2 property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getDPFlag2() {
                return dpFlag2;
            }

            /**
             * Sets the value of the dpFlag2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setDPFlag2(JAXBElement<Integer> value) {
                this.dpFlag2 = value;
            }

            /**
             * Gets the value of the lastActiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getLastActiveDate() {
                return lastActiveDate;
            }

            /**
             * Sets the value of the lastActiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setLastActiveDate(JAXBElement<String> value) {
                this.lastActiveDate = value;
            }

            /**
             * Gets the value of the posUserState property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getPOSUserState() {
                return posUserState;
            }

            /**
             * Sets the value of the posUserState property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setPOSUserState(JAXBElement<Integer> value) {
                this.posUserState = value;
            }

            /**
             * Gets the value of the etuFraudState property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getETUFraudState() {
                return etuFraudState;
            }

            /**
             * Sets the value of the etuFraudState property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setETUFraudState(JAXBElement<Integer> value) {
                this.etuFraudState = value;
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
         *         &lt;element name="UserGroup" type="{http://www.huawei.com/bme/cbsinterface/query}UserGroup" maxOccurs="unbounded" minOccurs="0"/>
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
            "userGroup"
        })
        public static class UserGroupList {

            @XmlElement(name = "UserGroup", nillable = true)
            protected List<UserGroup> userGroup;

            /**
             * Gets the value of the userGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the userGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUserGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UserGroup }
             * 
             * 
             */
            public List<UserGroup> getUserGroup() {
                if (userGroup == null) {
                    userGroup = new ArrayList<UserGroup>();
                }
                return this.userGroup;
            }

        }

    }

}
