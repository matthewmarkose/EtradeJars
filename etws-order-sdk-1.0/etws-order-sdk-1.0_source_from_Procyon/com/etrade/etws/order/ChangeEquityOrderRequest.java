// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public class ChangeEquityOrderRequest extends ChangeOrderBase
{
    protected String priceType;
    protected String orderTerm;
    
    public String getPriceType() {
        return this.priceType;
    }
    
    public void setPriceType(final String value) {
        this.priceType = value;
    }
    
    public String getOrderTerm() {
        return this.orderTerm;
    }
    
    public void setOrderTerm(final String value) {
        this.orderTerm = value;
    }
}
