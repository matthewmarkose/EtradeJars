// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum TransactionGroupingEnum
{
    DEPOSITS("DEPOSITS"), 
    SWEEP("SWEEP"), 
    TRADES("TRADES"), 
    WITHDRAWALS("WITHDRAWALS"), 
    CASH("CASH");
    
    private String name;
    
    private TransactionGroupingEnum(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
