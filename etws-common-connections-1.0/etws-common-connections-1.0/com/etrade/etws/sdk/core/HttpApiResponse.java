// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.core;

public class HttpApiResponse
{
    private int statusCode;
    private String responseString;
    private String responseHeader;
    
    public int getStatusCode() {
        return this.statusCode;
    }
    
    public void setStatusCode(final int statusCode) {
        this.statusCode = statusCode;
    }
    
    public String getResponseString() {
        return this.responseString;
    }
    
    public void setResponseString(final String responseString) {
        this.responseString = responseString;
    }
    
    public String getResponseHeader() {
        return this.responseHeader;
    }
    
    public void setResponseHeader(final String responseHeader) {
        this.responseHeader = responseHeader;
    }
}
