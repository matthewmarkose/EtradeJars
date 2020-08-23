// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.util.ArrayList;
import java.util.List;

public class OrderListResponse
{
    protected long count;
    protected String marker;
    protected List<OrderDetails> orderDetails;
    
    public long getCount() {
        return this.count;
    }
    
    public String getMarker() {
        return this.marker;
    }
    
    public List<OrderDetails> getOrderDetails() {
        if (this.orderDetails == null) {
            this.orderDetails = new ArrayList<OrderDetails>();
        }
        return this.orderDetails;
    }
}
