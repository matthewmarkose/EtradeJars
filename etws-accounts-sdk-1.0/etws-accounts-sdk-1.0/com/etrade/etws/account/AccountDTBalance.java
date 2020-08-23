// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public class AccountDTBalance
{
    protected BigDecimal dtCashBalance;
    protected BigDecimal dtMarginBalance;
    protected BigDecimal dtMarginableSecurities;
    protected BigDecimal dtNonMarginableSecuritiesAndOptions;
    protected DayTraderStatus dtStatus;
    
    public BigDecimal getDtCashBalance() {
        return this.dtCashBalance;
    }
    
    public BigDecimal getDtMarginBalance() {
        return this.dtMarginBalance;
    }
    
    public BigDecimal getDtMarginableSecurities() {
        return this.dtMarginableSecurities;
    }
    
    public BigDecimal getDtNonMarginableSecuritiesAndOptions() {
        return this.dtNonMarginableSecuritiesAndOptions;
    }
    
    public DayTraderStatus getDtStatus() {
        return this.dtStatus;
    }
}
