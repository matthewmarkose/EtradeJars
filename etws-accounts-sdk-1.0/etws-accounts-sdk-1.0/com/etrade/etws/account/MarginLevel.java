// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum MarginLevel
{
    MARGIN, 
    CASH, 
    PM;
    
    public String value() {
        return this.name();
    }
    
    public static MarginLevel fromValue(final String v) {
        return valueOf(v);
    }
}
