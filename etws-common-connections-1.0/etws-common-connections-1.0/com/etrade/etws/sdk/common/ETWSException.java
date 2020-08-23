// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.common;

public class ETWSException extends Exception
{
    private static final long serialVersionUID = -6961414633051699089L;
    private int errorCode;
    private String errorMessage;
    private Exception rootException;
    
    public ETWSException() {
    }
    
    public ETWSException(final String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    public ETWSException(final int errorCode, final String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    
    public ETWSException(final Exception e) {
        this.rootException = e;
    }
    
    public ETWSException(final String errorMessage, final Exception e) {
        this.rootException = e;
        this.errorMessage = errorMessage;
    }
    
    public int getErrorCode() {
        return this.errorCode;
    }
    
    public void setErrorCode(final int errorCode) {
        this.errorCode = errorCode;
    }
    
    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    @Override
    public Throwable getCause() {
        return this.rootException;
    }
}
