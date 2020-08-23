// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

public class EquityOrderResponse extends BasicOrderResponse
{
    protected String symbolDesc;
    protected String symbol;
    protected EquityOrderAction orderAction;
    protected EquityPriceType priceType;
    
    public String getSymbolDesc() {
        return this.symbolDesc;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public EquityOrderAction getOrderAction() {
        return this.orderAction;
    }
    
    public EquityPriceType getPriceType() {
        return this.priceType;
    }
}
