// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum OptionOrderAction
{
    BUY_OPEN, 
    SELL_OPEN, 
    BUY_CLOSE, 
    SELL_CLOSE;
    
    public String value() {
        return this.name();
    }
    
    public static OptionOrderAction fromValue(final String v) {
        return valueOf(v);
    }
}
