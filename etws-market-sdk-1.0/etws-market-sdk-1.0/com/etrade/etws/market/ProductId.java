// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class ProductId
{
    protected String exchangeCode;
    protected String symbol;
    protected String typeCode;
    
    public String getExchangeCode() {
        return this.exchangeCode;
    }
    
    public void setExchangeCode(final String value) {
        this.exchangeCode = value;
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
}
