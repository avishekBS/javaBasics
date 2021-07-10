
package com.learning.webservice.client.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="powerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return_power" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "powerResponse", propOrder = {
    "returnPower"
})
public class PowerResponse {

    @XmlElement(name = "return_power")
    protected String returnPower;

    /**
     * Gets the value of the returnPower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPower() {
        return returnPower;
    }

    /**
     * Sets the value of the returnPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPower(String value) {
        this.returnPower = value;
    }

}
