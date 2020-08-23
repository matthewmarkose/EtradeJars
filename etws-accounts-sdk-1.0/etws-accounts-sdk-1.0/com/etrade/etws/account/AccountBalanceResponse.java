// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public class AccountBalanceResponse
{
    protected String accountId;
    protected MarginLevel accountType;
    protected OptionLevel optionLevel;
    protected Balance accountBalance;
    protected CashAccountBalance cashAccountBalance;
    protected MarginAccountBalance marginAccountBalance;
    
    public String getAccountId() {
        return this.accountId;
    }
    
    public MarginLevel getAccountType() {
        return this.accountType;
    }
    
    public OptionLevel getOptionLevel() {
        return this.optionLevel;
    }
    
    public Balance getAccountBalance() {
        return this.accountBalance;
    }
    
    public CashAccountBalance getCashAccountBalance() {
        return this.cashAccountBalance;
    }
    
    public MarginAccountBalance getMarginAccountBalance() {
        return this.marginAccountBalance;
    }
}
