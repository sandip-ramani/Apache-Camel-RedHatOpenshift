
package com.redhat.training.carbonfootprintservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redhat.training.carbonfootprintservice package. 
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

    private final static QName _CarbonFootprintRequest_QNAME = new QName("http://training.redhat.com/CarbonFootprintService/", "CarbonFootprintRequest");
    private final static QName _CarbonFootprintResponse_QNAME = new QName("http://training.redhat.com/CarbonFootprintService/", "CarbonFootprintResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redhat.training.carbonfootprintservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarbonFootprintRequest }
     * 
     */
    public CarbonFootprintRequest createCarbonFootprintRequest() {
        return new CarbonFootprintRequest();
    }

    /**
     * Create an instance of {@link CarbonFootprintResponse }
     * 
     */
    public CarbonFootprintResponse createCarbonFootprintResponse() {
        return new CarbonFootprintResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarbonFootprintRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CarbonFootprintRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://training.redhat.com/CarbonFootprintService/", name = "CarbonFootprintRequest")
    public JAXBElement<CarbonFootprintRequest> createCarbonFootprintRequest(CarbonFootprintRequest value) {
        return new JAXBElement<CarbonFootprintRequest>(_CarbonFootprintRequest_QNAME, CarbonFootprintRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarbonFootprintResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CarbonFootprintResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://training.redhat.com/CarbonFootprintService/", name = "CarbonFootprintResponse")
    public JAXBElement<CarbonFootprintResponse> createCarbonFootprintResponse(CarbonFootprintResponse value) {
        return new JAXBElement<CarbonFootprintResponse>(_CarbonFootprintResponse_QNAME, CarbonFootprintResponse.class, null, value);
    }

}
