// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import javax.xml.ws.WebFault;

@WebFault(name = "ETWSException", targetNamespace = "http://market.etws.etrade.com")
public class ETWSException_Exception extends Exception
{
    public static final long serialVersionUID = 20101015134621L;
    private ETWSException etwsException;
    
    public ETWSException_Exception() {
    }
    
    public ETWSException_Exception(final String message) {
        super(message);
    }
    
    public ETWSException_Exception(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public ETWSException_Exception(final String message, final ETWSException etwsException) {
        super(message);
        this.etwsException = etwsException;
    }
    
    public ETWSException_Exception(final String message, final ETWSException etwsException, final Throwable cause) {
        super(message, cause);
        this.etwsException = etwsException;
    }
    
    public ETWSException getFaultInfo() {
        return this.etwsException;
    }
}
