// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum OrderRoutingDestination
{
    AUTO, 
    ATIN, 
    SELN, 
    MKXT, 
    REDI, 
    INCA, 
    ARCA, 
    ISLD, 
    BETA, 
    SOES, 
    ADP, 
    RTEX, 
    INST, 
    BRUT, 
    INET, 
    NSDQ, 
    NYSE, 
    AMEX, 
    BOX, 
    CBOE, 
    ISE, 
    NOM, 
    PHX;
    
    public String value() {
        return this.name();
    }
    
    public static OrderRoutingDestination fromValue(final String v) {
        return valueOf(v);
    }
}
