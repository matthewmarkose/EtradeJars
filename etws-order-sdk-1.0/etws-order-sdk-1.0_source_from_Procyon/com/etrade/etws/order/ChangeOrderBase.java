// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ChangeOrderBase
{
    protected String accountId;
    protected BigInteger orderNum;
    protected String clientOrderId;
    protected BigDecimal limitPrice;
    protected BigInteger previewId;
    protected BigDecimal stopPrice;
    protected String allOrNone;
    protected String quantity;
    protected String reserveOrder;
    protected BigInteger reserveQuantity;
    
    public String getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(final String value) {
        this.accountId = value;
    }
    
    public BigInteger getOrderNum() {
        return this.orderNum;
    }
    
    public void setOrderNum(final BigInteger value) {
        this.orderNum = value;
    }
    
    public String getClientOrderId() {
        return this.clientOrderId;
    }
    
    public void setClientOrderId(final String value) {
        this.clientOrderId = value;
    }
    
    public BigDecimal getLimitPrice() {
        return this.limitPrice;
    }
    
    public void setLimitPrice(final BigDecimal value) {
        final BigDecimal tmpValue = value.setScale(6, 4);
        this.limitPrice = tmpValue;
    }
    
    public BigInteger getPreviewId() {
        return this.previewId;
    }
    
    public void setPreviewId(final BigInteger value) {
        this.previewId = value;
    }
    
    public BigDecimal getStopPrice() {
        return this.stopPrice;
    }
    
    public void setStopPrice(final BigDecimal value) {
        final BigDecimal tmpValue = value.setScale(6, 4);
        this.stopPrice = tmpValue;
    }
    
    public String getAllOrNone() {
        return this.allOrNone;
    }
    
    public void setAllOrNone(final String value) {
        this.allOrNone = value;
    }
    
    public String getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(final String value) {
        this.quantity = value;
    }
    
    public String getReserveOrder() {
        return this.reserveOrder;
    }
    
    public void setReserveOrder(final String value) {
        this.reserveOrder = value;
    }
    
    public BigInteger getReserveQuantity() {
        return this.reserveQuantity;
    }
    
    public void setReserveQuantity(final BigInteger value) {
        this.reserveQuantity = value;
    }
}
