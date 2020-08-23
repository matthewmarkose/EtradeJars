// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public class ETWSException
{
    protected Integer errorCode;
    protected String errorMessage;
    protected Integer httpCode;
    
    public Integer getErrorCode() {
        return this.errorCode;
    }
    
    public void setErrorCode(final Integer value) {
        this.errorCode = value;
    }
    
    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(final String value) {
        this.errorMessage = value;
    }
    
    public Integer getHttpCode() {
        return this.httpCode;
    }
    
    public void setHttpCode(final Integer value) {
        this.httpCode = value;
    }
}
