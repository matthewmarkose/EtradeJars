// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class OptionChainRequest
{
    protected String expirationMonth;
    protected String expirationYear;
    protected String chainType;
    protected String skipAdjusted;
    protected String underlier;
    
    public String getExpirationMonth() {
        return this.expirationMonth;
    }
    
    public void setExpirationMonth(final String value) {
        this.expirationMonth = value;
    }
    
    public String getExpirationYear() {
        return this.expirationYear;
    }
    
    public void setExpirationYear(final String value) {
        this.expirationYear = value;
    }
    
    public String getChainType() {
        return this.chainType;
    }
    
    public void setChainType(final String value) {
        this.chainType = value;
    }
    
    public String getSkipAdjusted() {
        return this.skipAdjusted;
    }
    
    public void setSkipAdjusted(final String value) {
        this.skipAdjusted = value;
    }
    
    public String getUnderlier() {
        return this.underlier;
    }
    
    public void setUnderlier(final String value) {
        this.underlier = value;
    }
}
