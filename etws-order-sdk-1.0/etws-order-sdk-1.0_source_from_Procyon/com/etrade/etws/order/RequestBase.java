// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigInteger;
import java.math.BigDecimal;

public class RequestBase
{
    protected String accountId;
    protected String clientOrderId;
    protected BigDecimal limitPrice;
    protected BigInteger previewId;
    protected BigDecimal stopPrice;
    
    public String getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(final String value) {
        this.accountId = value;
    }
    
    public String getClientOrderId() {
        return this.clientOrderId;
    }
    
    public void setClientOrderId(final String value) {
        this.clientOrderId = value;
    }
    
    public BigDecimal getLimitPrice() {
        return this.limitPrice;
    }
    
    public void setLimitPrice(final BigDecimal value) {
        final BigDecimal tmpValue = value.setScale(6, 4);
        this.limitPrice = tmpValue;
    }
    
    public BigInteger getPreviewId() {
        return this.previewId;
    }
    
    public void setPreviewId(final BigInteger value) {
        this.previewId = value;
    }
    
    public BigDecimal getStopPrice() {
        return this.stopPrice;
    }
    
    public void setStopPrice(final BigDecimal value) {
        final BigDecimal tmpValue = value.setScale(6, 4);
        this.stopPrice = tmpValue;
    }
}
