// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum TransactionRequestEnum
{
    COUNT("count"), 
    MARKER("marker"), 
    START_DATE("startDate"), 
    END_DATE("endDate");
    
    private String name;
    
    private TransactionRequestEnum(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
