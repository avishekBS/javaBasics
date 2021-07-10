
package com.learning.webservice.client.stub;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidInputException", targetNamespace = "http://exception.handling.ws.javax.learnings.com/")
public class InvalidInputException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidInputException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidInputException_Exception(String message, InvalidInputException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidInputException_Exception(String message, InvalidInputException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.learning.webservice.client.stub.InvalidInputException
     */
    public InvalidInputException getFaultInfo() {
        return faultInfo;
    }

}
