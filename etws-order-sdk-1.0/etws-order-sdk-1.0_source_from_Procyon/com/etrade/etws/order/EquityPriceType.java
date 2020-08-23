// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum EquityPriceType
{
    MARKET, 
    LIMIT, 
    STOP, 
    STOP_LIMIT, 
    MARKET_ON_CLOSE, 
    TRAILING_STOP_CNST, 
    TRAILING_STOP_PRCT;
    
    public String value() {
        return this.name();
    }
    
    public static EquityPriceType fromValue(final String v) {
        return valueOf(v);
    }
}
