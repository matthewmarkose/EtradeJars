// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public class EquityOrderRequest extends BasicOrderRequest
{
    protected String symbol;
    protected EquityOrderAction orderAction;
    protected EquityPriceType priceType;
    protected String routingDestination;
    protected MarketSession marketSession;
    protected EquityOrderTerm orderTerm;
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(final String value) {
        this.symbol = value;
    }
    
    public EquityOrderAction getOrderAction() {
        return this.orderAction;
    }
    
    public void setOrderAction(final EquityOrderAction value) {
        this.orderAction = value;
    }
    
    public EquityPriceType getPriceType() {
        return this.priceType;
    }
    
    public void setPriceType(final EquityPriceType value) {
        this.priceType = value;
    }
    
    public String getRoutingDestination() {
        return this.routingDestination;
    }
    
    public void setRoutingDestination(final String value) {
        this.routingDestination = value;
    }
    
    public MarketSession getMarketSession() {
        return this.marketSession;
    }
    
    public void setMarketSession(final MarketSession value) {
        this.marketSession = value;
    }
    
    public EquityOrderTerm getOrderTerm() {
        return this.orderTerm;
    }
    
    public void setOrderTerm(final EquityOrderTerm value) {
        this.orderTerm = value;
    }
}
