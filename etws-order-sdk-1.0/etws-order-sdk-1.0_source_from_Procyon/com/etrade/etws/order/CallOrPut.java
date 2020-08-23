// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum CallOrPut
{
    CALL, 
    PUT;
    
    public String value() {
        return this.name();
    }
    
    public static CallOrPut fromValue(final String v) {
        return valueOf(v);
    }
}
