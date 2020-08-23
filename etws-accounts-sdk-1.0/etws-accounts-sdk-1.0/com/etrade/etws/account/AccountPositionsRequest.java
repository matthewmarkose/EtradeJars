// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public class AccountPositionsRequest
{
    protected String accountId;
    protected String count;
    protected String marker;
    protected String symbol;
    protected String typeCode;
    protected String callPut;
    protected BigDecimal strikePrice;
    protected String expYear;
    protected String expMonth;
    protected String expDay;
    
    public String getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(final String value) {
        this.accountId = value;
    }
    
    public String getCount() {
        return this.count;
    }
    
    public void setCount(final String value) {
        this.count = value;
    }
    
    public String getMarker() {
        return this.marker;
    }
    
    public void setMarker(final String value) {
        this.marker = value;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(final String value) {
        this.symbol = value;
    }
    
    public String getTypeCode() {
        return this.typeCode;
    }
    
    public void setTypeCode(final String value) {
        this.typeCode = value;
    }
    
    public String getCallPut() {
        return this.callPut;
    }
    
    public void setCallPut(final String value) {
        this.callPut = value;
    }
    
    public BigDecimal getStrikePrice() {
        return this.strikePrice;
    }
    
    public void setStrikePrice(final BigDecimal value) {
        this.strikePrice = value;
    }
    
    public String getExpYear() {
        return this.expYear;
    }
    
    public void setExpYear(final String value) {
        this.expYear = value;
    }
    
    public String getExpMonth() {
        return this.expMonth;
    }
    
    public void setExpMonth(final String value) {
        this.expMonth = value;
    }
    
    public String getExpDay() {
        return this.expDay;
    }
    
    public void setExpDay(final String value) {
        this.expDay = value;
    }
}
