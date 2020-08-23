// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum AlertCategory
{
    ACCOUNTS, 
    TRADING;
    
    public String value() {
        return this.name();
    }
    
    public static AlertCategory fromValue(final String v) {
        return valueOf(v);
    }
}
