// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum ConditionType
{
    CONTINGENT_GTE, 
    CONTINGENT_LTE;
    
    public String value() {
        return this.name();
    }
    
    public static ConditionType fromValue(final String v) {
        return valueOf(v);
    }
}
