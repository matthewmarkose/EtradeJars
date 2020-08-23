// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigDecimal;

public class OptionOrderResponse extends BasicOrderResponse
{
    protected BigDecimal stopLimitPrice;
    protected OptionSymbol optionSymbol;
    protected String symbolDescription;
    protected OptionOrderAction orderAction;
    protected OptionPriceType priceType;
    
    public BigDecimal getStopLimitPrice() {
        return this.stopLimitPrice;
    }
    
    public OptionSymbol getOptionSymbol() {
        return this.optionSymbol;
    }
    
    public OptionOrderAction getOrderAction() {
        return this.orderAction;
    }
    
    public OptionPriceType getPriceType() {
        return this.priceType;
    }
    
    public String getSymbolDescription() {
        return this.symbolDescription;
    }
}
