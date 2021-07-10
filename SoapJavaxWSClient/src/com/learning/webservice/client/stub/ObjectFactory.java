
package com.learning.webservice.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.learning.webservice.client.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Multiply_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "multiply");
    private final static QName _DivideResponse_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "divideResponse");
    private final static QName _Power_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "power");
    private final static QName _PowerResponse_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "powerResponse");
    private final static QName _Divide_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "divide");
    private final static QName _Subtract_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "subtract");
    private final static QName _SubtractResponse_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "subtractResponse");
    private final static QName _AddResponse_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "addResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "multiplyResponse");
    private final static QName _InvalidInputException_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "InvalidInputException");
    private final static QName _Add_QNAME = new QName("http://exception.handling.ws.javax.learnings.com/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.learning.webservice.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link InvalidInputException }
     * 
     */
    public InvalidInputException createInvalidInputException() {
        return new InvalidInputException();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link Subtract }
     * 
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     * 
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link Power }
     * 
     */
    public Power createPower() {
        return new Power();
    }

    /**
     * Create an instance of {@link PowerResponse }
     * 
     */
    public PowerResponse createPowerResponse() {
        return new PowerResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Power }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "power")
    public JAXBElement<Power> createPower(Power value) {
        return new JAXBElement<Power>(_Power_QNAME, Power.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "powerResponse")
    public JAXBElement<PowerResponse> createPowerResponse(PowerResponse value) {
        return new JAXBElement<PowerResponse>(_PowerResponse_QNAME, PowerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidInputException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "InvalidInputException")
    public JAXBElement<InvalidInputException> createInvalidInputException(InvalidInputException value) {
        return new JAXBElement<InvalidInputException>(_InvalidInputException_QNAME, InvalidInputException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exception.handling.ws.javax.learnings.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
