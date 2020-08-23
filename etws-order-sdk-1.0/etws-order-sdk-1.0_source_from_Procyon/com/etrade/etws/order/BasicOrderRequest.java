// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigInteger;

public class BasicOrderRequest extends RequestBase
{
    protected String allOrNone;
    protected BigInteger quantity;
    protected String reserveOrder;
    protected BigInteger reserveQuantity;
    
    public String getAllOrNone() {
        return this.allOrNone;
    }
    
    public void setAllOrNone(final String value) {
        this.allOrNone = value;
    }
    
    public BigInteger getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(final BigInteger value) {
        this.quantity = value;
    }
    
    public String getReserveOrder() {
        return this.reserveOrder;
    }
    
    public void setReserveOrder(final String value) {
        this.reserveOrder = value;
    }
    
    public BigInteger getReserveQuantity() {
        return this.reserveQuantity;
    }
    
    public void setReserveQuantity(final BigInteger value) {
        this.reserveQuantity = value;
    }
}
