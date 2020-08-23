// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class ProductLookupRequest
{
    protected String company;
    protected String type;
    
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(final String value) {
        this.company = value;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String value) {
        this.type = value;
    }
}
