// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum OrderStatus
{
    OPEN, 
    EXECUTED, 
    CANCELLED, 
    CANCEL_REQUESTED, 
    EXPIRED, 
    REJECTED;
    
    public String value() {
        return this.name();
    }
    
    public static OrderStatus fromValue(final String v) {
        return valueOf(v);
    }
}
