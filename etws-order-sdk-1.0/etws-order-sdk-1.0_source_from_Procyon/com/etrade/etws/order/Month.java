// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public enum Month
{
    JAN, 
    FEB, 
    MAR, 
    APR, 
    MAY, 
    JUN, 
    JUL, 
    AUG, 
    SEP, 
    OCT, 
    NOV, 
    DEC;
    
    public String value() {
        return this.name();
    }
    
    public static Month fromValue(final String v) {
        return valueOf(v);
    }
}
