// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigDecimal;

public class SymbolInfo
{
    protected String symbol;
    protected CallOrPut callPut;
    protected Integer expYear;
    protected Integer expMonth;
    protected Integer expDay;
    protected BigDecimal strikePrice;
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(final String value) {
        this.symbol = value;
    }
    
    public CallOrPut getCallPut() {
        return this.callPut;
    }
    
    public void setCallPut(final CallOrPut value) {
        this.callPut = value;
    }
    
    public Integer getExpYear() {
        return this.expYear;
    }
    
    public void setExpYear(final Integer value) {
        this.expYear = value;
    }
    
    public Integer getExpMonth() {
        return this.expMonth;
    }
    
    public void setExpMonth(final Integer value) {
        this.expMonth = value;
    }
    
    public Integer getExpDay() {
        return this.expDay;
    }
    
    public void setExpDay(final Integer value) {
        this.expDay = value;
    }
    
    public BigDecimal getStrikePrice() {
        return this.strikePrice;
    }
    
    public void setStrikePrice(final BigDecimal value) {
        this.strikePrice = value;
    }
}
