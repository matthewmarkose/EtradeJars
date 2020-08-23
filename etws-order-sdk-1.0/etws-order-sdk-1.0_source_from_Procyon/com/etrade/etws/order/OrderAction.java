// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum OrderAction
{
    BUY, 
    SELL, 
    BUY_TO_COVER, 
    SELL_SHORT, 
    BUY_OPEN, 
    SELL_OPEN, 
    BUY_CLOSE, 
    SELL_CLOSE;
    
    public String value() {
        return this.name();
    }
    
    public static OrderAction fromValue(final String v) {
        return valueOf(v);
    }
}
