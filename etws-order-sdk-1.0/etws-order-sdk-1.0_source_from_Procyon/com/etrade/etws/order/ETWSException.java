// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public class ETWSException
{
    protected int errorCode;
    protected String errorMessage;
    protected Integer httpCode;
    
    public int getErrorCode() {
        return this.errorCode;
    }
    
    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public Integer getHttpCode() {
        return this.httpCode;
    }
}
