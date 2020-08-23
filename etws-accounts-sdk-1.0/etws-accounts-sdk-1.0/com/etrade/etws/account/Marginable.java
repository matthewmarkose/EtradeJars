// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum Marginable
{
    MARGINABLE, 
    NON_MARGINABLE;
    
    public String value() {
        return this.name();
    }
    
    public static Marginable fromValue(final String v) {
        return valueOf(v);
    }
}
