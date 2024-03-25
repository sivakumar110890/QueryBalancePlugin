
package com.huawei.bme.cbsinterface.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingCycleDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingCycleDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillCycleOpenDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="BillCycleEndDate" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="BillCycleType" type="{http://www.huawei.com/bme/cbsinterface/common}BillCycleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingCycleDate", propOrder = {
    "billCycleOpenDate",
    "billCycleEndDate",
    "billCycleType"
})
public class BillingCycleDate {

    @XmlElementRef(name = "BillCycleOpenDate", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billCycleOpenDate;
    @XmlElementRef(name = "BillCycleEndDate", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billCycleEndDate;
    @XmlElementRef(name = "BillCycleType", namespace = "http://www.huawei.com/bme/cbsinterface/query", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> billCycleType;

    /**
     * Gets the value of the billCycleOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillCycleOpenDate() {
        return billCycleOpenDate;
    }

    /**
     * Sets the value of the billCycleOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillCycleOpenDate(JAXBElement<String> value) {
        this.billCycleOpenDate = value;
    }

    /**
     * Gets the value of the billCycleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillCycleEndDate() {
        return billCycleEndDate;
    }

    /**
     * Sets the value of the billCycleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillCycleEndDate(JAXBElement<String> value) {
        this.billCycleEndDate = value;
    }

    /**
     * Gets the value of the billCycleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBillCycleType() {
        return billCycleType;
    }

    /**
     * Sets the value of the billCycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBillCycleType(JAXBElement<Integer> value) {
        this.billCycleType = value;
    }

}
