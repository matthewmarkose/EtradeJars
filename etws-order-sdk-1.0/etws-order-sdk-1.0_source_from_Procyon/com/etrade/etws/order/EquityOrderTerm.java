// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum EquityOrderTerm
{
    GOOD_UNTIL_CANCEL, 
    GOOD_FOR_DAY, 
    IMMEDIATE_OR_CANCEL, 
    FILL_OR_KILL;
    
    public String value() {
        return this.name();
    }
    
    public static EquityOrderTerm fromValue(final String v) {
        return valueOf(v);
    }
}
