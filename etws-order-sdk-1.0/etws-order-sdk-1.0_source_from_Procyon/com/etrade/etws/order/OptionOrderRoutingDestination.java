// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum OptionOrderRoutingDestination
{
    AUTO, 
    AMEX, 
    BOX, 
    CBOE, 
    ISE, 
    NOM, 
    NYSE, 
    PHX;
    
    public String value() {
        return this.name();
    }
    
    public static OptionOrderRoutingDestination fromValue(final String v) {
        return valueOf(v);
    }
}
