// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum CallPut
{
    CALL, 
    PUT;
    
    public String value() {
        return this.name();
    }
    
    public static CallPut fromValue(final String v) {
        return valueOf(v);
    }
}
