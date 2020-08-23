// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigInteger;

public class CancelOrderRequest
{
    protected String accountId;
    protected BigInteger orderNum;
    
    public String getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(final String value) {
        this.accountId = value;
    }
    
    public BigInteger getOrderNum() {
        return this.orderNum;
    }
    
    public void setOrderNum(final BigInteger value) {
        this.orderNum = value;
    }
}
