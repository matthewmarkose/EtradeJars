// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.math.BigInteger;

public class GroupOrder
{
    protected BigInteger groupOrderId;
    protected ViewOrderType groupOrderType;
    protected BigDecimal totalOrderValue;
    protected double cumulativeEstimatedCommission;
    protected double cumulativeEstimatedFees;
    protected List<Order> order;
    
    public BigInteger getGroupOrderId() {
        return this.groupOrderId;
    }
    
    public ViewOrderType getGroupOrderType() {
        return this.groupOrderType;
    }
    
    public BigDecimal getTotalOrderValue() {
        return this.totalOrderValue;
    }
    
    public double getCumulativeEstimatedCommission() {
        return this.cumulativeEstimatedCommission;
    }
    
    public double getCumulativeEstimatedFees() {
        return this.cumulativeEstimatedFees;
    }
    
    public List<Order> getOrder() {
        if (this.order == null) {
            this.order = new ArrayList<Order>();
        }
        return this.order;
    }
}
