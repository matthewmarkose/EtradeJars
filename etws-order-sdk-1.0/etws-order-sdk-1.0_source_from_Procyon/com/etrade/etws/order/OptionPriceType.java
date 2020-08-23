// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum OptionPriceType
{
    MARKET, 
    LIMIT, 
    STOP, 
    STOP_LIMIT, 
    TRAILING_STOP_CNST;
    
    public String value() {
        return this.name();
    }
    
    public static OptionPriceType fromValue(final String v) {
        return valueOf(v);
    }
}
