
package com.huawei.bme.cbsinterface.subscribe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeOptionalOfferResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOptionalOfferResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "ChangeOptionalOfferResult", propOrder = {
    "offerOrderInfo"
})
public class ChangeOptionalOfferResult {

    @XmlElement(name = "OfferOrderInfo", nillable = true)
    protected List<OfferOrderInfo> offerOrderInfo;

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
