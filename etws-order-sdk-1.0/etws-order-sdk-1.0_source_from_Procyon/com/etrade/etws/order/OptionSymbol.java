// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigInteger;
import java.math.BigDecimal;

public class OptionSymbol
{
    protected String symbol;
    protected CallOrPut callOrPut;
    protected BigDecimal strikePrice;
    protected BigInteger expirationYear;
    protected BigInteger expirationMonth;
    protected BigInteger expirationDay;
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(final String value) {
        this.symbol = value;
    }
    
    public CallOrPut getCallOrPut() {
        return this.callOrPut;
    }
    
    public void setCallOrPut(final CallOrPut value) {
        this.callOrPut = value;
    }
    
    public BigDecimal getStrikePrice() {
        return this.strikePrice;
    }
    
    public void setStrikePrice(final BigDecimal value) {
        this.strikePrice = value;
    }
    
    public BigInteger getExpirationYear() {
        return this.expirationYear;
    }
    
    public void setExpirationYear(final BigInteger value) {
        this.expirationYear = value;
    }
    
    public BigInteger getExpirationMonth() {
        return this.expirationMonth;
    }
    
    public void setExpirationMonth(final BigInteger value) {
        this.expirationMonth = value;
    }
    
    public BigInteger getExpirationDay() {
        return this.expirationDay;
    }
    
    public void setExpirationDay(final BigInteger value) {
        this.expirationDay = value;
    }
}
