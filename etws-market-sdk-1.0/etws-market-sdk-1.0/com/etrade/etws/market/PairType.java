// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public enum PairType
{
    CALLONLY, 
    PUTONLY, 
    SPREADS, 
    CALLPUT;
    
    public String value() {
        return this.name();
    }
    
    public static PairType fromValue(final String v) {
        return valueOf(v);
    }
}
