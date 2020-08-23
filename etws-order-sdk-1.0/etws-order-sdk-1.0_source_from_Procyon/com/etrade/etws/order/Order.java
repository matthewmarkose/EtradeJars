// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Order
{
    protected BigInteger orderId;
    protected long orderPlacedTime;
    protected Long orderExecutedTime;
    protected BigDecimal orderValue;
    protected OrderStatus orderStatus;
    protected ViewOrderType orderType;
    protected OrderTerm orderTerm;
    protected PriceType priceType;
    protected BigDecimal limitPrice;
    protected BigDecimal stopPrice;
    protected OrderRoutingDestination routingDestination;
    protected List<LegDetails> legDetails;
    protected BigDecimal bracketLimitPrice;
    protected BigDecimal initialStopPrice;
    protected BigDecimal trailPrice;
    protected BigDecimal triggerPrice;
    protected BigDecimal conditionPrice;
    protected String conditionSymbol;
    protected ConditionType conditionType;
    protected ConditionFollowPrice conditionFollowPrice;
    protected BigInteger replacedByOrderId;
    protected BigInteger replacesOrderId;
    protected Boolean allOrNone;
    
    public BigInteger getOrderId() {
        return this.orderId;
    }
    
    public long getOrderPlacedTime() {
        return this.orderPlacedTime;
    }
    
    public Long getOrderExecutedTime() {
        return this.orderExecutedTime;
    }
    
    public BigDecimal getOrderValue() {
        return this.orderValue;
    }
    
    public OrderStatus getOrderStatus() {
        return this.orderStatus;
    }
    
    public ViewOrderType getOrderType() {
        return this.orderType;
    }
    
    public OrderTerm getOrderTerm() {
        return this.orderTerm;
    }
    
    public PriceType getPriceType() {
        return this.priceType;
    }
    
    public BigDecimal getLimitPrice() {
        return this.limitPrice;
    }
    
    public BigDecimal getStopPrice() {
        return this.stopPrice;
    }
    
    public OrderRoutingDestination getRoutingDestination() {
        return this.routingDestination;
    }
    
    public List<LegDetails> getLegDetails() {
        if (this.legDetails == null) {
            this.legDetails = new ArrayList<LegDetails>();
        }
        return this.legDetails;
    }
    
    public BigDecimal getBracketLimitPrice() {
        return this.bracketLimitPrice;
    }
    
    public BigDecimal getInitialStopPrice() {
        return this.initialStopPrice;
    }
    
    public BigDecimal getTrailPrice() {
        return this.trailPrice;
    }
    
    public BigDecimal getTriggerPrice() {
        return this.triggerPrice;
    }
    
    public BigDecimal getConditionPrice() {
        return this.conditionPrice;
    }
    
    public String getConditionSymbol() {
        return this.conditionSymbol;
    }
    
    public ConditionType getConditionType() {
        return this.conditionType;
    }
    
    public ConditionFollowPrice getConditionFollowPrice() {
        return this.conditionFollowPrice;
    }
    
    public BigInteger getReplacedByOrderId() {
        return this.replacedByOrderId;
    }
    
    public BigInteger getReplacesOrderId() {
        return this.replacesOrderId;
    }
    
    public Boolean isAllOrNone() {
        return this.allOrNone;
    }
}
