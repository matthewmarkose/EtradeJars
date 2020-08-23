// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigDecimal;

public class ChangeOptionOrderRequest extends ChangeOrderBase
{
    protected BigDecimal stopLimitPrice;
    protected String priceType;
    protected String orderTerm;
    
    public BigDecimal getStopLimitPrice() {
        return this.stopLimitPrice;
    }
    
    public void setStopLimitPrice(final BigDecimal value) {
        this.stopLimitPrice = value;
    }
    
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
