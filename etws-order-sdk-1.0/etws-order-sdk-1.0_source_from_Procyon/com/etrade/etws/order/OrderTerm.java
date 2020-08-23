// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum OrderTerm
{
    GOOD_UNTIL_CANCEL, 
    GOOD_FOR_DAY, 
    GOOD_TILL_DATE, 
    IMMEDIATE_OR_CANCEL, 
    FILL_OR_KILL;
    
    public String value() {
        return this.name();
    }
    
    public static OrderTerm fromValue(final String v) {
        return valueOf(v);
    }
}
