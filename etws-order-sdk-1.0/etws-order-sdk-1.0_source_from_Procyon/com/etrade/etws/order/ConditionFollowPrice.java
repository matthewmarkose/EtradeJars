// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum ConditionFollowPrice
{
    ASK, 
    BID, 
    LAST;
    
    public String value() {
        return this.name();
    }
    
    public static ConditionFollowPrice fromValue(final String v) {
        return valueOf(v);
    }
}
