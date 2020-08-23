// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class OptionExpireDateGetRequest
{
    protected String underlier;
    protected String expiryType;
    
    public String getUnderlier() {
        return this.underlier;
    }
    
    public void setUnderlier(final String value) {
        this.underlier = value;
    }
    
    public String getExpiryType() {
        return this.expiryType;
    }
    
    public void setExpiryType(final String value) {
        this.expiryType = value;
    }
}
