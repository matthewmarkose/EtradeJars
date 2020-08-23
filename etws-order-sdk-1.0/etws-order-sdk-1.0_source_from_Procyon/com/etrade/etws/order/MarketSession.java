// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum MarketSession
{
    REGULAR, 
    EXTENDED;
    
    public String value() {
        return this.name();
    }
    
    public static MarketSession fromValue(final String v) {
        return valueOf(v);
    }
}
