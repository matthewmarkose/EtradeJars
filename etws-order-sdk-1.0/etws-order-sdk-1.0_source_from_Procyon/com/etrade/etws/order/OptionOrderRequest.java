// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigDecimal;

public class OptionOrderRequest extends BasicOrderRequest
{
    protected BigDecimal stopLimitPrice;
    protected OptionSymbol symbolInfo;
    protected OptionOrderAction orderAction;
    protected OptionPriceType priceType;
    protected String routingDestination;
    protected OptionOrderTerm orderTerm;
    
    public BigDecimal getStopLimitPrice() {
        return this.stopLimitPrice;
    }
    
    public void setStopLimitPrice(final BigDecimal value) {
        this.stopLimitPrice = value;
    }
    
    public OptionSymbol getSymbolInfo() {
        return this.symbolInfo;
    }
    
    public void setSymbolInfo(final OptionSymbol value) {
        this.symbolInfo = value;
    }
    
    public OptionOrderAction getOrderAction() {
        return this.orderAction;
    }
    
    public void setOrderAction(final OptionOrderAction value) {
        this.orderAction = value;
    }
    
    public OptionPriceType getPriceType() {
        return this.priceType;
    }
    
    public void setPriceType(final OptionPriceType value) {
        this.priceType = value;
    }
    
    public String getRoutingDestination() {
        return this.routingDestination;
    }
    
    public void setRoutingDestination(final String value) {
        this.routingDestination = value;
    }
    
    public OptionOrderTerm getOrderTerm() {
        return this.orderTerm;
    }
    
    public void setOrderTerm(final OptionOrderTerm value) {
        this.orderTerm = value;
    }
}
