
package br.com.sw2.comercial.service.pedidoservice;

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
@WebServiceClient(name = "PedidoService", targetNamespace = "http://www.sw2.com.br/comercial/service/PedidoService", wsdlLocation = "file:/D:/SW2/OdonTO-DO/fontes/Comercial/src/WEB-INF/contracts/PedidoService.wsdl")
public class PedidoService_Service
    extends Service
{

    private final static URL PEDIDOSERVICE_WSDL_LOCATION;
    private final static WebServiceException PEDIDOSERVICE_EXCEPTION;
    private final static QName PEDIDOSERVICE_QNAME = new QName("http://www.sw2.com.br/comercial/service/PedidoService", "PedidoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/SW2/OdonTO-DO/fontes/Comercial/src/WEB-INF/contracts/PedidoService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PEDIDOSERVICE_WSDL_LOCATION = url;
        PEDIDOSERVICE_EXCEPTION = e;
    }

    public PedidoService_Service() {
        super(__getWsdlLocation(), PEDIDOSERVICE_QNAME);
    }

    public PedidoService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PEDIDOSERVICE_QNAME, features);
    }

    public PedidoService_Service(URL wsdlLocation) {
        super(wsdlLocation, PEDIDOSERVICE_QNAME);
    }

    public PedidoService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PEDIDOSERVICE_QNAME, features);
    }

    public PedidoService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PedidoService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PedidoService
     */
    @WebEndpoint(name = "PedidoServiceSOAP")
    public PedidoService getPedidoServiceSOAP() {
        return super.getPort(new QName("http://www.sw2.com.br/comercial/service/PedidoService", "PedidoServiceSOAP"), PedidoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PedidoService
     */
    @WebEndpoint(name = "PedidoServiceSOAP")
    public PedidoService getPedidoServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.sw2.com.br/comercial/service/PedidoService", "PedidoServiceSOAP"), PedidoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PEDIDOSERVICE_EXCEPTION!= null) {
            throw PEDIDOSERVICE_EXCEPTION;
        }
        return PEDIDOSERVICE_WSDL_LOCATION;
    }

}
