// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.net.MalformedURLException;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.WebEndpoint;
import javax.xml.namespace.QName;
import java.net.URL;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.Service;

@WebServiceClient(name = "MarketSvcService", wsdlLocation = "file:/C:/etws/etws-market-inf/src/main/resources/wsdl/MarketSvc.wsdl", targetNamespace = "http://market.etws.etrade.com")
public class MarketSvcService extends Service
{
    public static final URL WSDL_LOCATION;
    public static final QName SERVICE;
    public static final QName MarketSvcPort;
    
    public MarketSvcService(final URL wsdlLocation) {
        super(wsdlLocation, MarketSvcService.SERVICE);
    }
    
    public MarketSvcService(final URL wsdlLocation, final QName serviceName) {
        super(wsdlLocation, serviceName);
    }
    
    public MarketSvcService() {
        super(MarketSvcService.WSDL_LOCATION, MarketSvcService.SERVICE);
    }
    
    @WebEndpoint(name = "MarketSvcPort")
    public MarketSvc getMarketSvcPort() {
        return (MarketSvc)super.getPort(MarketSvcService.MarketSvcPort, (Class)MarketSvc.class);
    }
    
    @WebEndpoint(name = "MarketSvcPort")
    public MarketSvc getMarketSvcPort(final WebServiceFeature... features) {
        return (MarketSvc)super.getPort(MarketSvcService.MarketSvcPort, (Class)MarketSvc.class, features);
    }
    
    static {
        SERVICE = new QName("http://market.etws.etrade.com", "MarketSvcService");
        MarketSvcPort = new QName("http://market.etws.etrade.com", "MarketSvcPort");
        URL url = null;
        try {
            url = new URL("file:/C:/etws/etws-market-inf/src/main/resources/wsdl/MarketSvc.wsdl");
        }
        catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/etws/etws-market-inf/src/main/resources/wsdl/MarketSvc.wsdl");
        }
        WSDL_LOCATION = url;
    }
}
