// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum OptionOrderTerm
{
    GOOD_UNTIL_CANCEL, 
    GOOD_FOR_DAY, 
    IMMEDIATE_OR_CANCEL, 
    FILL_OR_KILL;
    
    public String value() {
        return this.name();
    }
    
    public static OptionOrderTerm fromValue(final String v) {
        return valueOf(v);
    }
}
