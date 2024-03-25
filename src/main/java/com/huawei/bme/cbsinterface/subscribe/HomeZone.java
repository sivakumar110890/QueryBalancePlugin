
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HomeZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HomeZone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HomeZoneChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HomeZonePromptMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HomeZoneList" type="{http://www.huawei.com/bme/cbsinterface/subscribe}HomeZoneInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HomeZone", propOrder = {
    "homeZoneChange",
    "homeZonePromptMode",
    "homeZoneList"
})
public class HomeZone {

    @XmlElementRef(name = "HomeZoneChange", namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> homeZoneChange;
    @XmlElementRef(name = "HomeZonePromptMode", namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> homeZonePromptMode;
    @XmlElement(name = "HomeZoneList", nillable = true)
    protected List<HomeZoneInfo> homeZoneList;

    /**
     * Gets the value of the homeZoneChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHomeZoneChange() {
        return homeZoneChange;
    }

    /**
     * Sets the value of the homeZoneChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHomeZoneChange(JAXBElement<Integer> value) {
        this.homeZoneChange = value;
    }

    /**
     * Gets the value of the homeZonePromptMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHomeZonePromptMode() {
        return homeZonePromptMode;
    }

    /**
     * Sets the value of the homeZonePromptMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHomeZonePromptMode(JAXBElement<Integer> value) {
        this.homeZonePromptMode = value;
    }

    /**
     * Gets the value of the homeZoneList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homeZoneList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomeZoneList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HomeZoneInfo }
     * 
     * 
     */
    public List<HomeZoneInfo> getHomeZoneList() {
        if (homeZoneList == null) {
            homeZoneList = new ArrayList<HomeZoneInfo>();
        }
        return this.homeZoneList;
    }

}
