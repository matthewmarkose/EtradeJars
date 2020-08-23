// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public final class Account
{
    private final String accountDesc;
    private final String accountId;
    private final MarginLevel marginLevel;
    private final BigDecimal netAccountValue;
    private final String registrationType;
    
    public Account() {
        this.accountDesc = null;
        this.accountId = null;
        this.marginLevel = null;
        this.netAccountValue = null;
        this.registrationType = null;
    }
    
    public String getAccountDesc() {
        return this.accountDesc;
    }
    
    public String getAccountId() {
        return this.accountId;
    }
    
    public MarginLevel getMarginLevel() {
        return this.marginLevel;
    }
    
    public BigDecimal getNetAccountValue() {
        return this.netAccountValue;
    }
    
    public String getRegistrationType() {
        return this.registrationType;
    }
}
