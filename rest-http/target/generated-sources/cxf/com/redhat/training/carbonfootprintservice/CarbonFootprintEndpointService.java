package com.redhat.training.carbonfootprintservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2022-12-01T11:00:45.746-05:00
 * Generated source version: 3.4.4
 *
 */
@WebServiceClient(name = "CarbonFootprintEndpointService",
                  wsdlLocation = "file:/home/student/AD221/rest-http/src/main/resources/wsdl/Footprint.wsdl",
                  targetNamespace = "http://training.redhat.com/CarbonFootprintService/")
public class CarbonFootprintEndpointService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://training.redhat.com/CarbonFootprintService/", "CarbonFootprintEndpointService");
    public final static QName CarbonFootprintEndpointPort = new QName("http://training.redhat.com/CarbonFootprintService/", "CarbonFootprintEndpointPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/student/AD221/rest-http/src/main/resources/wsdl/Footprint.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CarbonFootprintEndpointService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/student/AD221/rest-http/src/main/resources/wsdl/Footprint.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CarbonFootprintEndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CarbonFootprintEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CarbonFootprintEndpointService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns CarbonFootprintEndpoint
     */
    @WebEndpoint(name = "CarbonFootprintEndpointPort")
    public CarbonFootprintEndpoint getCarbonFootprintEndpointPort() {
        return super.getPort(CarbonFootprintEndpointPort, CarbonFootprintEndpoint.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CarbonFootprintEndpoint
     */
    @WebEndpoint(name = "CarbonFootprintEndpointPort")
    public CarbonFootprintEndpoint getCarbonFootprintEndpointPort(WebServiceFeature... features) {
        return super.getPort(CarbonFootprintEndpointPort, CarbonFootprintEndpoint.class, features);
    }

}
