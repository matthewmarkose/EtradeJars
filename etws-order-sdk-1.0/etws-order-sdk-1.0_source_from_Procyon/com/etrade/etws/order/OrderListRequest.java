// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public class OrderListRequest
{
    protected String accountId;
    protected String marker;
    protected String count;
    
    public String getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(final String value) {
        this.accountId = value;
    }
    
    public String getMarker() {
        return this.marker;
    }
    
    public void setMarker(final String value) {
        this.marker = value;
    }
    
    public String getCount() {
        return this.count;
    }
    
    public void setCount(final String value) {
        this.count = value;
    }
}
