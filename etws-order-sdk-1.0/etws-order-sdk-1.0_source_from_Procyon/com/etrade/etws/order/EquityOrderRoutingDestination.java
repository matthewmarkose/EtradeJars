// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum EquityOrderRoutingDestination
{
    AUTO, 
    ARCA, 
    NSDQ, 
    NYSE;
    
    public String value() {
        return this.name();
    }
    
    public static EquityOrderRoutingDestination fromValue(final String v) {
        return valueOf(v);
    }
}
