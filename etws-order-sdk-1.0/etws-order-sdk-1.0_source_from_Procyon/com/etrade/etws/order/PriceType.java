// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum PriceType
{
    MARKET, 
    LIMIT, 
    STOP, 
    STOP_LIMIT, 
    TRAILING_STOP_CNST_BY_LOWER_TRIGGER, 
    UPPER_TRIGGER_BY_TRAILING_STOP_CNST, 
    TRAILING_STOP_PRCT_BY_LOWER_TRIGGER, 
    UPPER_TRIGGER_BY_TRAILING_STOP_PRCT, 
    TRAILING_STOP_CNST, 
    TRAILING_STOP_PRCT, 
    HIDDEN_STOP, 
    HIDDEN_STOP_BY_LOWER_TRIGGER, 
    UPPER_TRIGGER_BY_HIDDEN_STOP, 
    NET_DEBIT, 
    NET_CREDIT, 
    NET_EVEN, 
    MARKET_ON_OPEN, 
    MARKET_ON_CLOSE, 
    LIMIT_ON_OPEN, 
    LIMIT_ON_CLOSE;
    
    public String value() {
        return this.name();
    }
    
    public static PriceType fromValue(final String v) {
        return valueOf(v);
    }
}
