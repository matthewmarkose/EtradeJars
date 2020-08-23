// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public class MarginAccountBalance
{
    protected AccountDTBalance dtBalance;
    protected BigDecimal fedCall;
    protected BigDecimal marginBalance;
    protected BigDecimal marginBalanceWithdrawal;
    protected BigDecimal marginEquity;
    protected BigDecimal marginEquityPct;
    protected BigDecimal marginableSecurities;
    protected BigDecimal maxAvailableForWithdrawal;
    protected BigDecimal minEquityCall;
    protected BigDecimal nonMarginableSecuritiesAndOptions;
    protected BigDecimal totalShortValue;
    protected BigDecimal shortReserve;
    
    public AccountDTBalance getDtBalance() {
        return this.dtBalance;
    }
    
    public BigDecimal getFedCall() {
        return this.fedCall;
    }
    
    public BigDecimal getMarginBalance() {
        return this.marginBalance;
    }
    
    public BigDecimal getMarginBalanceWithdrawal() {
        return this.marginBalanceWithdrawal;
    }
    
    public BigDecimal getMarginEquity() {
        return this.marginEquity;
    }
    
    public BigDecimal getMarginEquityPct() {
        return this.marginEquityPct;
    }
    
    public BigDecimal getMarginableSecurities() {
        return this.marginableSecurities;
    }
    
    public BigDecimal getMaxAvailableForWithdrawal() {
        return this.maxAvailableForWithdrawal;
    }
    
    public BigDecimal getMinEquityCall() {
        return this.minEquityCall;
    }
    
    public BigDecimal getNonMarginableSecuritiesAndOptions() {
        return this.nonMarginableSecuritiesAndOptions;
    }
    
    public BigDecimal getTotalShortValue() {
        return this.totalShortValue;
    }
    
    public BigDecimal getShortReserve() {
        return this.shortReserve;
    }
}
