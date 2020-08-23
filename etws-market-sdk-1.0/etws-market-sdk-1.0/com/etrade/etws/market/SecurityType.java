// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public enum SecurityType
{
    EQ, 
    ETF, 
    MF, 
    INDX;
    
    public String value() {
        return this.name();
    }
    
    public static SecurityType fromValue(final String v) {
        return valueOf(v);
    }
}
