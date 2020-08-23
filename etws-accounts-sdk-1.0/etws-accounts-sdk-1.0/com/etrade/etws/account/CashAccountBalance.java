// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public class CashAccountBalance
{
    protected BigDecimal cashAvailableForInvestment;
    protected BigDecimal cashBalance;
    protected BigDecimal settledCashForInvestment;
    protected BigDecimal unSettledCashForInvestment;
    
    public BigDecimal getCashAvailableForInvestment() {
        return this.cashAvailableForInvestment;
    }
    
    public BigDecimal getCashBalance() {
        return this.cashBalance;
    }
    
    public BigDecimal getSettledCashForInvestment() {
        return this.settledCashForInvestment;
    }
    
    public BigDecimal getUnSettledCashForInvestment() {
        return this.unSettledCashForInvestment;
    }
}
