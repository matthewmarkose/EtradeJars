// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.net.MalformedURLException;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.WebEndpoint;
import javax.xml.namespace.QName;
import java.net.URL;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.Service;

@WebServiceClient(name = "AccountSvcService", wsdlLocation = "file:/C:/etws/etws-account-inf/src/main/resources/wsdl/AccountSvc.wsdl", targetNamespace = "http://account.etws.etrade.com")
public class AccountSvcService extends Service
{
    public static final URL WSDL_LOCATION;
    public static final QName SERVICE;
    public static final QName AccountSvcPort;
    
    public AccountSvcService(final URL wsdlLocation) {
        super(wsdlLocation, AccountSvcService.SERVICE);
    }
    
    public AccountSvcService(final URL wsdlLocation, final QName serviceName) {
        super(wsdlLocation, serviceName);
    }
    
    public AccountSvcService() {
        super(AccountSvcService.WSDL_LOCATION, AccountSvcService.SERVICE);
    }
    
    @WebEndpoint(name = "AccountSvcPort")
    public IAccountSvc getAccountSvcPort() {
        return (IAccountSvc)super.getPort(AccountSvcService.AccountSvcPort, (Class)IAccountSvc.class);
    }
    
    @WebEndpoint(name = "AccountSvcPort")
    public IAccountSvc getAccountSvcPort(final WebServiceFeature... features) {
        return (IAccountSvc)super.getPort(AccountSvcService.AccountSvcPort, (Class)IAccountSvc.class, features);
    }
    
    static {
        SERVICE = new QName("http://account.etws.etrade.com", "AccountSvcService");
        AccountSvcPort = new QName("http://account.etws.etrade.com", "AccountSvcPort");
        URL url = null;
        try {
            url = new URL("file:/C:/etws/etws-account-inf/src/main/resources/wsdl/AccountSvc.wsdl");
        }
        catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/etws/etws-account-inf/src/main/resources/wsdl/AccountSvc.wsdl");
        }
        WSDL_LOCATION = url;
    }
}
