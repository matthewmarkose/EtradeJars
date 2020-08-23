// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum EquityOrderAction
{
    BUY, 
    SELL, 
    BUY_TO_COVER, 
    SELL_SHORT;
    
    public String value() {
        return this.name();
    }
    
    public static EquityOrderAction fromValue(final String v) {
        return valueOf(v);
    }
}
