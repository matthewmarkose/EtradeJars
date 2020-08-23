// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum OptionLevel
{
    LEVEL_1, 
    LEVEL_2, 
    LEVEL_3, 
    LEVEL_4;
    
    public String value() {
        return this.name();
    }
    
    public static OptionLevel fromValue(final String v) {
        return valueOf(v);
    }
}
