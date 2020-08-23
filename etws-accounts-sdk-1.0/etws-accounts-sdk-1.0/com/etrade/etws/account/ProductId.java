// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public class ProductId
{
    protected String symbol;
    protected String typeCode;
    protected CallPut callPut;
    protected BigDecimal strikePrice;
    protected Integer expYear;
    protected Integer expMonth;
    protected Integer expDay;
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public String getTypeCode() {
        return this.typeCode;
    }
    
    public CallPut getCallPut() {
        return this.callPut;
    }
    
    public BigDecimal getStrikePrice() {
        return this.strikePrice;
    }
    
    public Integer getExpYear() {
        return this.expYear;
    }
    
    public Integer getExpMonth() {
        return this.expMonth;
    }
    
    public Integer getExpDay() {
        return this.expDay;
    }
}
