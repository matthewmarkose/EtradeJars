// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum LongOrShort
{
    LONG, 
    SHORT;
    
    public String value() {
        return this.name();
    }
    
    public static LongOrShort fromValue(final String v) {
        return valueOf(v);
    }
}
