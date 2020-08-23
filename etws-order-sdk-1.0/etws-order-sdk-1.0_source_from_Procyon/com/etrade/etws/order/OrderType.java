// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum OrderType
{
    BASIC_EQUITY, 
    BASIC_OPTION, 
    AO_EQUITY, 
    AO_OPTION;
    
    public String value() {
        return this.name();
    }
    
    public static OrderType fromValue(final String v) {
        return valueOf(v);
    }
}
