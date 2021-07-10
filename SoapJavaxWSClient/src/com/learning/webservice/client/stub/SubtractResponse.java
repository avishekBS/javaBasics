
package com.learning.webservice.client.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subtractResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subtractResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return_subtract" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtractResponse", propOrder = {
    "returnSubtract"
})
public class SubtractResponse {

    @XmlElement(name = "return_subtract")
    protected int returnSubtract;

    /**
     * Gets the value of the returnSubtract property.
     * 
     */
    public int getReturnSubtract() {
        return returnSubtract;
    }

    /**
     * Sets the value of the returnSubtract property.
     * 
     */
    public void setReturnSubtract(int value) {
        this.returnSubtract = value;
    }

}
