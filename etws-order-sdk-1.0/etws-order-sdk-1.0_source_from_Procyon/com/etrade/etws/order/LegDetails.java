// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LegDetails
{
    protected long legNumber;
    protected SymbolInfo symbolInfo;
    protected String symbolDescription;
    protected OrderAction orderAction;
    protected BigInteger orderedQuantity;
    protected BigInteger filledQuantity;
    protected BigDecimal executedPrice;
    protected BigDecimal estimatedCommission;
    protected BigDecimal estimatedFees;
    protected BigInteger reserveQuantity;
    
    public long getLegNumber() {
        return this.legNumber;
    }
    
    public SymbolInfo getSymbolInfo() {
        return this.symbolInfo;
    }
    
    public String getSymbolDescription() {
        return this.symbolDescription;
    }
    
    public OrderAction getOrderAction() {
        return this.orderAction;
    }
    
    public BigInteger getOrderedQuantity() {
        return this.orderedQuantity;
    }
    
    public BigInteger getFilledQuantity() {
        return this.filledQuantity;
    }
    
    public BigDecimal getExecutedPrice() {
        return this.executedPrice;
    }
    
    public BigDecimal getEstimatedCommission() {
        return this.estimatedCommission;
    }
    
    public BigDecimal getEstimatedFees() {
        return this.estimatedFees;
    }
    
    public BigInteger getReserveQuantity() {
        return this.reserveQuantity;
    }
}
