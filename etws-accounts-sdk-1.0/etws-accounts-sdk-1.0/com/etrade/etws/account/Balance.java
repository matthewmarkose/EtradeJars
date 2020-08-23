// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public class Balance
{
    protected BigDecimal cashAvailableForWithdrawal;
    protected BigDecimal cashCall;
    protected BigDecimal fundsWithheldFromPurchasePower;
    protected BigDecimal fundsWithheldFromWithdrawal;
    protected BigDecimal netAccountValue;
    protected BigDecimal netCash;
    protected BigDecimal sweepDepositAmount;
    protected BigDecimal totalLongValue;
    protected BigDecimal totalSecuritiesMktValue;
    protected BigDecimal totalCash;
    
    public BigDecimal getCashAvailableForWithdrawal() {
        return this.cashAvailableForWithdrawal;
    }
    
    public BigDecimal getCashCall() {
        return this.cashCall;
    }
    
    public BigDecimal getFundsWithheldFromPurchasePower() {
        return this.fundsWithheldFromPurchasePower;
    }
    
    public BigDecimal getFundsWithheldFromWithdrawal() {
        return this.fundsWithheldFromWithdrawal;
    }
    
    public BigDecimal getNetAccountValue() {
        return this.netAccountValue;
    }
    
    public BigDecimal getNetCash() {
        return this.netCash;
    }
    
    public BigDecimal getSweepDepositAmount() {
        return this.sweepDepositAmount;
    }
    
    public BigDecimal getTotalLongValue() {
        return this.totalLongValue;
    }
    
    public BigDecimal getTotalSecuritiesMktValue() {
        return this.totalSecuritiesMktValue;
    }
    
    public BigDecimal getTotalCash() {
        return this.totalCash;
    }
    
    public void setTotalCash(final BigDecimal totalCash) {
        this.totalCash = totalCash;
    }
}
