
package team.t.course.web;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MyServiceImplService", targetNamespace = "pers.liam.countManager.MyService", wsdlLocation = "http://localhost:8060/MyService?wsdl")
public class MyServiceImplService_Service
    extends Service
{

    private final static URL MYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MYSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName MYSERVICEIMPLSERVICE_QNAME = new QName("pers.liam.countManager.MyService", "MyServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8060/MyService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        MYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public MyServiceImplService_Service() {
        super(__getWsdlLocation(), MYSERVICEIMPLSERVICE_QNAME);
    }

    public MyServiceImplService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYSERVICEIMPLSERVICE_QNAME, features);
    }

    public MyServiceImplService_Service(URL wsdlLocation) {
        super(wsdlLocation, MYSERVICEIMPLSERVICE_QNAME);
    }

    public MyServiceImplService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYSERVICEIMPLSERVICE_QNAME, features);
    }

    public MyServiceImplService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyServiceImplService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MyServiceImplService
     */
    @WebEndpoint(name = "MyServiceImplServicePort")
    public MyServiceImplService getMyServiceImplServicePort() {
        return super.getPort(new QName("pers.liam.countManager.MyService", "MyServiceImplServicePort"), MyServiceImplService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyServiceImplService
     */
    @WebEndpoint(name = "MyServiceImplServicePort")
    public MyServiceImplService getMyServiceImplServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("pers.liam.countManager.MyService", "MyServiceImplServicePort"), MyServiceImplService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw MYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return MYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
