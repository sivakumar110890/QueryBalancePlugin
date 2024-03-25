
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AccountType" type="{http://www.huawei.com/bme/cbsinterface/common}AccountType"/>
 *         &lt;element name="Amount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *         &lt;element name="AccountCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance"/>
 *         &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="RelatedType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelatedObjectID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceObjectType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InitialAmount" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="Consumption" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="ServiceNumber" type="{http://www.huawei.com/bme/cbsinterface/common}SubscriberNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType", propOrder = {
    "balanceId",
    "accountType",
    "amount",
    "accountCredit",
    "applyTime",
    "expireTime",
    "relatedType",
    "relatedObjectID",
    "sourceObjectType",
    "sourceObjectID",
    "initialAmount",
    "consumption",
    "serviceNumber"
})
public class BalanceType {

    @XmlElement(name = "BalanceId")
    protected long balanceId;
    @XmlElement(name = "AccountType", required = true)
    protected String accountType;
    @XmlElement(name = "Amount")
    protected long amount;
    @XmlElement(name = "AccountCredit")
    protected long accountCredit;
    @XmlElementRef(name = "ApplyTime", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applyTime;
    @XmlElementRef(name = "ExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expireTime;
    @XmlElementRef(name = "RelatedType", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> relatedType;
    @XmlElementRef(name = "RelatedObjectID", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> relatedObjectID;
    @XmlElementRef(name = "SourceObjectType", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sourceObjectType;
    @XmlElementRef(name = "SourceObjectID", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceObjectID;
    @XmlElementRef(name = "InitialAmount", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> initialAmount;
    @XmlElementRef(name = "Consumption", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> consumption;
    @XmlElementRef(name = "ServiceNumber", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceNumber;

    /**
     * Gets the value of the balanceId property.
     * 
     */
    public long getBalanceId() {
        return balanceId;
    }

    /**
     * Sets the value of the balanceId property.
     * 
     */
    public void setBalanceId(long value) {
        this.balanceId = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
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

    /**
     * Gets the value of the accountCredit property.
     * 
     */
    public long getAccountCredit() {
        return accountCredit;
    }

    /**
     * Sets the value of the accountCredit property.
     * 
     */
    public void setAccountCredit(long value) {
        this.accountCredit = value;
    }

    /**
     * Gets the value of the applyTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplyTime() {
        return applyTime;
    }

    /**
     * Sets the value of the applyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplyTime(JAXBElement<String> value) {
        this.applyTime = value;
    }

    /**
     * Gets the value of the expireTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpireTime() {
        return expireTime;
    }

    /**
     * Sets the value of the expireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpireTime(JAXBElement<String> value) {
        this.expireTime = value;
    }

    /**
     * Gets the value of the relatedType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRelatedType() {
        return relatedType;
    }

    /**
     * Sets the value of the relatedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRelatedType(JAXBElement<Integer> value) {
        this.relatedType = value;
    }

    /**
     * Gets the value of the relatedObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRelatedObjectID() {
        return relatedObjectID;
    }

    /**
     * Sets the value of the relatedObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRelatedObjectID(JAXBElement<Long> value) {
        this.relatedObjectID = value;
    }

    /**
     * Gets the value of the sourceObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSourceObjectType() {
        return sourceObjectType;
    }

    /**
     * Sets the value of the sourceObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSourceObjectType(JAXBElement<Integer> value) {
        this.sourceObjectType = value;
    }

    /**
     * Gets the value of the sourceObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceObjectID() {
        return sourceObjectID;
    }

    /**
     * Sets the value of the sourceObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceObjectID(JAXBElement<String> value) {
        this.sourceObjectID = value;
    }

    /**
     * Gets the value of the initialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInitialAmount() {
        return initialAmount;
    }

    /**
     * Sets the value of the initialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInitialAmount(JAXBElement<Long> value) {
        this.initialAmount = value;
    }

    /**
     * Gets the value of the consumption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setConsumption(JAXBElement<Long> value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the serviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Sets the value of the serviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceNumber(JAXBElement<String> value) {
        this.serviceNumber = value;
    }

}
