// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum ViewOrderType
{
    EQ, 
    OPTN, 
    ADVANCE_EQ, 
    ADVANCE_OPTN, 
    SPREADS, 
    BUY_WRITES, 
    CONTINGENT, 
    ONE_CANCELS_ALL, 
    ONE_TRIGGERS_ALL, 
    ONE_TRIGGERS_OCO, 
    BRACKETED;
    
    public String value() {
        return this.name();
    }
    
    public static ViewOrderType fromValue(final String v) {
        return valueOf(v);
    }
}
