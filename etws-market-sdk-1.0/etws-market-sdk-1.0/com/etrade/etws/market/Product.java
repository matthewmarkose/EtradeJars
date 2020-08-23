// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class Product
{
    protected String companyName;
    protected String exchange;
    protected SecurityType securityType;
    protected String symbol;
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(final String value) {
        this.companyName = value;
    }
    
    public String getExchange() {
        return this.exchange;
    }
    
    public void setExchange(final String value) {
        this.exchange = value;
    }
    
    public SecurityType getSecurityType() {
        return this.securityType;
    }
    
    public void setSecurityType(final SecurityType value) {
        this.securityType = value;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(final String value) {
        this.symbol = value;
    }
}
