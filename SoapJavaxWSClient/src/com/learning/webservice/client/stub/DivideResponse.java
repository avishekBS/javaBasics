
package com.learning.webservice.client.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for divideResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="divideResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return_divide" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divideResponse", propOrder = {
    "returnDivide"
})
public class DivideResponse {

    @XmlElement(name = "return_divide")
    protected int returnDivide;

    /**
     * Gets the value of the returnDivide property.
     * 
     */
    public int getReturnDivide() {
        return returnDivide;
    }

    /**
     * Sets the value of the returnDivide property.
     * 
     */
    public void setReturnDivide(int value) {
        this.returnDivide = value;
    }

}
