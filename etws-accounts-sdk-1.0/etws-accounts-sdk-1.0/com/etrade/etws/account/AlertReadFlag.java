// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum AlertReadFlag
{
    UNREAD, 
    READ;
    
    public String value() {
        return this.name();
    }
    
    public static AlertReadFlag fromValue(final String v) {
        return valueOf(v);
    }
}
