// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.util.ArrayList;
import java.math.BigInteger;
import java.util.List;
import java.math.BigDecimal;

public class BasicOrderResponse extends ResultBase
{
    protected Boolean allOrNone;
    protected BigDecimal estimatedCommission;
    protected BigDecimal estimatedTotalAmount;
    protected List<ETAppMessages> messageList;
    protected BigInteger orderNum;
    protected Long orderTime;
    protected Long previewTime;
    protected BigInteger previewId;
    protected BigInteger quantity;
    protected Boolean reserveOrder;
    protected BigInteger reserveQuantity;
    protected OrderTerm orderTerm;
    protected BigDecimal limitPrice;
    protected BigDecimal stopPrice;
    protected OrderRoutingDestination routingDestination;
    
    public Boolean isAllOrNone() {
        return this.allOrNone;
    }
    
    public BigDecimal getEstimatedCommission() {
        return this.estimatedCommission;
    }
    
    public BigDecimal getEstimatedTotalAmount() {
        return this.estimatedTotalAmount;
    }
    
    public List<ETAppMessages> getMessageList() {
        if (this.messageList == null) {
            this.messageList = new ArrayList<ETAppMessages>();
        }
        return this.messageList;
    }
    
    public BigInteger getOrderNum() {
        return this.orderNum;
    }
    
    public Long getOrderTime() {
        return this.orderTime;
    }
    
    public Long getPreviewTime() {
        return this.previewTime;
    }
    
    public BigInteger getPreviewId() {
        return this.previewId;
    }
    
    public BigInteger getQuantity() {
        return this.quantity;
    }
    
    public Boolean isReserveOrder() {
        return this.reserveOrder;
    }
    
    public BigInteger getReserveQuantity() {
        return this.reserveQuantity;
    }
    
    public OrderTerm getOrderTerm() {
        return this.orderTerm;
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
}
