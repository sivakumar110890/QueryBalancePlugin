
package com.huawei.bme.cbsinterface.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBalanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBalanceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceRecord" type="{http://www.huawei.com/bme/cbsinterface/query}BalanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BalanceValidity" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *         &lt;element name="AvailableCredit" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="BalanceActiveDate" type="{http://www.huawei.com/bme/cbsinterface/common}Date" minOccurs="0"/>
 *         &lt;element name="UnpaidFee" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *         &lt;element name="AvailableQuota" type="{http://www.huawei.com/bme/cbsinterface/common}Balance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBalanceResult", propOrder = {
    "balanceRecord",
    "balanceValidity",
    "availableCredit",
    "balanceActiveDate",
    "unpaidFee",
    "availableQuota"
})
public class QueryBalanceResult {

    @XmlElement(name = "BalanceRecord", nillable = true)
    protected List<BalanceType> balanceRecord;
    @XmlElementRef(name = "BalanceValidity", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balanceValidity;
    @XmlElementRef(name = "AvailableCredit", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> availableCredit;
    @XmlElementRef(name = "BalanceActiveDate", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<String> balanceActiveDate;
    @XmlElementRef(name = "UnpaidFee", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> unpaidFee;
    @XmlElementRef(name = "AvailableQuota", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> availableQuota;

    /**
     * Gets the value of the balanceRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceType }
     * 
     * 
     */
    public List<BalanceType> getBalanceRecord() {
        if (balanceRecord == null) {
            balanceRecord = new ArrayList<BalanceType>();
        }
        return this.balanceRecord;
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
     * Gets the value of the availableQuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAvailableQuota() {
        return availableQuota;
    }

    /**
     * Sets the value of the availableQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAvailableQuota(JAXBElement<Long> value) {
        this.availableQuota = value;
    }

}
