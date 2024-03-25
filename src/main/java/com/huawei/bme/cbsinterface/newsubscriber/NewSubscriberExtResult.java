
package com.huawei.bme.cbsinterface.newsubscriber;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.huawei.bme.cbsinterface.subscribe.OfferOrderInfo;


/**
 * <p>Java class for NewSubscriberExtResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewSubscriberExtResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OfferOrderInfo" type="{http://www.huawei.com/bme/cbsinterface/subscribe}OfferOrderInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewSubscriberExtResult", propOrder = {
    "subscriberKey",
    "offerOrderInfo"
})
public class NewSubscriberExtResult {

    @XmlElementRef(name = "SubscriberKey", namespace = "http://www.huawei.com/bme/cbsinterface/newsubscriber", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> subscriberKey;
    @XmlElement(name = "OfferOrderInfo", nillable = true)
    protected List<OfferOrderInfo> offerOrderInfo;

    /**
     * Gets the value of the subscriberKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubscriberKey() {
        return subscriberKey;
    }

    /**
     * Sets the value of the subscriberKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubscriberKey(JAXBElement<Integer> value) {
        this.subscriberKey = value;
    }

    /**
     * Gets the value of the offerOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerOrderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferOrderInfo }
     * 
     * 
     */
    public List<OfferOrderInfo> getOfferOrderInfo() {
        if (offerOrderInfo == null) {
            offerOrderInfo = new ArrayList<OfferOrderInfo>();
        }
        return this.offerOrderInfo;
    }

}
