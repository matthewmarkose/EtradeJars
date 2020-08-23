// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.math.BigDecimal;

public class DetailProduct
{
    protected String symbol;
    protected String type;
    protected String exchange;
    protected String optionType;
    protected BigDecimal strikePrice;
    protected Integer expirationYear;
    protected Integer expirationMonth;
    protected Integer expirationDay;
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getExchange() {
        return this.exchange;
    }
    
    public String getOptionType() {
        return this.optionType;
    }
    
    public BigDecimal getStrikePrice() {
        return this.strikePrice;
    }
    
    public Integer getExpirationYear() {
        return this.expirationYear;
    }
    
    public Integer getExpirationMonth() {
        return this.expirationMonth;
    }
    
    public Integer getExpirationDay() {
        return this.expirationDay;
    }
}
