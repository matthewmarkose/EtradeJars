// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.math.BigDecimal;

public class MarketIndex
{
    protected BigDecimal currentPrice;
    protected String description;
    protected BigDecimal percentChange;
    protected BigDecimal priceChange;
    protected String symbol;
    
    public BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public BigDecimal getPercentChange() {
        return this.percentChange;
    }
    
    public BigDecimal getPriceChange() {
        return this.priceChange;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
}
