// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.oauth.sdk.common;

public class Token
{
    private String token;
    private String secret;
    
    public String getToken() {
        return this.token;
    }
    
    public void setToken(final String token) {
        this.token = token;
    }
    
    public String getSecret() {
        return this.secret;
    }
    
    public void setSecret(final String secret) {
        this.secret = secret;
    }
}
