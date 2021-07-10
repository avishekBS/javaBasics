
package com.learning.webservice.client.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multiplyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiplyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return_multiply" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplyResponse", propOrder = {
    "returnMultiply"
})
public class MultiplyResponse {

    @XmlElement(name = "return_multiply")
    protected int returnMultiply;

    /**
     * Gets the value of the returnMultiply property.
     * 
     */
    public int getReturnMultiply() {
        return returnMultiply;
    }

    /**
     * Sets the value of the returnMultiply property.
     * 
     */
    public void setReturnMultiply(int value) {
        this.returnMultiply = value;
    }

}
