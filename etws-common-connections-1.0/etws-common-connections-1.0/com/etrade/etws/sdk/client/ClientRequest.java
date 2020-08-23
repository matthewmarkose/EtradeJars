// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.client;

public class ClientRequest
{
    private Environment env;
    private String liveHost;
    private String sandboxHost;
    private String baseAuthorizeUrl;
    private String consumerKey;
    private String consumerSecret;
    private String token;
    private String tokenSecret;
    private String verifierCode;
    
    public ClientRequest() {
        this.liveHost = "https://etws.etrade.com";
        this.sandboxHost = "https://etwssandbox.etrade.com";
        this.baseAuthorizeUrl = "https://us.etrade.com/e/t/etws/authorize";
    }
    
    public String getLiveHost() {
        return this.liveHost;
    }
    
    public void setLiveHost(final String liveHost) {
        this.liveHost = liveHost;
    }
    
    public String getSandboxHost() {
        return this.sandboxHost;
    }
    
    public void setSandboxHost(final String sandboxHost) {
        this.sandboxHost = sandboxHost;
    }
    
    public Environment getEnv() {
        return this.env;
    }
    
    public void setEnv(final Environment env) {
        this.env = env;
    }
    
    public String getConsumerKey() {
        return this.consumerKey;
    }
    
    public void setConsumerKey(final String consumerKey) {
        this.consumerKey = consumerKey;
    }
    
    public String getConsumerSecret() {
        return this.consumerSecret;
    }
    
    public void setConsumerSecret(final String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }
    
    public String getToken() {
        return this.token;
    }
    
    public void setToken(final String token) {
        this.token = token;
    }
    
    public String getTokenSecret() {
        return this.tokenSecret;
    }
    
    public void setTokenSecret(final String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }
    
    public String getVerifierCode() {
        return this.verifierCode;
    }
    
    public void setVerifierCode(final String verifierCode) {
        this.verifierCode = verifierCode;
    }
    
    public String getBaseAuthorizeUrl() {
        return this.baseAuthorizeUrl;
    }
    
    public void setBaseAuthorizeUrl(final String baseAuthorizeUrl) {
        this.baseAuthorizeUrl = baseAuthorizeUrl;
    }
}
