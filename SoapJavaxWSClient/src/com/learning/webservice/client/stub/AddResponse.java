
package com.learning.webservice.client.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return_add" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addResponse", propOrder = {
    "returnAdd"
})
public class AddResponse {

    @XmlElement(name = "return_add")
    protected int returnAdd;

    /**
     * Gets the value of the returnAdd property.
     * 
     */
    public int getReturnAdd() {
        return returnAdd;
    }

    /**
     * Sets the value of the returnAdd property.
     * 
     */
    public void setReturnAdd(int value) {
        this.returnAdd = value;
    }

}
