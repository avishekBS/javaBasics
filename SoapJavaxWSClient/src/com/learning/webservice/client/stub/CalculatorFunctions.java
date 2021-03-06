
package com.learning.webservice.client.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorFunctions", targetNamespace = "http://exception.handling.ws.javax.learnings.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorFunctions {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws InvalidInputException_Exception
     */
    @WebMethod
    @WebResult(name = "return_power", targetNamespace = "")
    @RequestWrapper(localName = "power", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.Power")
    @ResponseWrapper(localName = "powerResponse", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.PowerResponse")
    @Action(input = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/powerRequest", output = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/powerResponse", fault = {
        @FaultAction(className = InvalidInputException_Exception.class, value = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/power/Fault/InvalidInputException")
    })
    public String power(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1)
        throws InvalidInputException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "return_add", targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.AddResponse")
    @Action(input = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/addRequest", output = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/addResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "return_multiply", targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.MultiplyResponse")
    @Action(input = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/multiplyRequest", output = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/multiplyResponse")
    public int multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "return_subtract", targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.SubtractResponse")
    @Action(input = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/subtractRequest", output = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/subtractResponse")
    public int subtract(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "return_divide", targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://exception.handling.ws.javax.learnings.com/", className = "com.learning.webservice.client.stub.DivideResponse")
    @Action(input = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/divideRequest", output = "http://exception.handling.ws.javax.learnings.com/CalculatorFunctions/divideResponse")
    public int divide(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
