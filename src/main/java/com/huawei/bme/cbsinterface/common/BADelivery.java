
package com.huawei.bme.cbsinterface.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BADelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BADelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediumID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BillLang" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PayAccountCode" type="{http://www.huawei.com/bme/cbsinterface/common}AccountCode" minOccurs="0"/>
 *         &lt;element name="ApplyTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *         &lt;element name="ExpireTime" type="{http://www.huawei.com/bme/cbsinterface/common}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BADelivery", propOrder = {
    "mediumID",
    "billLang",
    "payAccountCode",
    "applyTime",
    "expireTime"
})
public class BADelivery {

    @XmlElement(name = "MediumID")
    protected int mediumID;
    @XmlElementRef(name = "BillLang", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billLang;
    @XmlElementRef(name = "PayAccountCode", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payAccountCode;
    @XmlElementRef(name = "ApplyTime", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applyTime;
    @XmlElementRef(name = "ExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expireTime;

    /**
     * Gets the value of the mediumID property.
     * 
     */
    public int getMediumID() {
        return mediumID;
    }

    /**
     * Sets the value of the mediumID property.
     * 
     */
    public void setMediumID(int value) {
        this.mediumID = value;
    }

    /**
     * Gets the value of the billLang property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillLang() {
        return billLang;
    }

    /**
     * Sets the value of the billLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillLang(JAXBElement<String> value) {
        this.billLang = value;
    }

    /**
     * Gets the value of the payAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayAccountCode() {
        return payAccountCode;
    }

    /**
     * Sets the value of the payAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayAccountCode(JAXBElement<String> value) {
        this.payAccountCode = value;
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

}
