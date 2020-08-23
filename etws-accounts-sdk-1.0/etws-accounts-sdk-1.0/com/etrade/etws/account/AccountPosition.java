// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public class AccountPosition
{
    protected BigDecimal costBasis;
    protected String description;
    protected LongOrShort longOrShort;
    protected Boolean marginable;
    protected ProductId productId;
    protected BigDecimal qty;
    protected BigDecimal marketValue;
    protected BigDecimal currentPrice;
    
    public BigDecimal getCostBasis() {
        return this.costBasis;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
    
    public LongOrShort getLongOrShort() {
        return this.longOrShort;
    }
    
    public void setLongOrShort(final LongOrShort value) {
        this.longOrShort = value;
    }
    
    public Boolean isMarginable() {
        return this.marginable;
    }
    
    public void setMarginable(final Boolean value) {
        this.marginable = value;
    }
    
    public ProductId getProductId() {
        return this.productId;
    }
    
    public void setProductId(final ProductId value) {
        this.productId = value;
    }
    
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(final BigDecimal value) {
        this.qty = value;
    }
    
    public BigDecimal getMarketValue() {
        return this.marketValue;
    }
    
    public void setMarketValue(final BigDecimal value) {
        this.marketValue = value;
    }
    
    public BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }
    
    public void setCurrentPrice(final BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }
}
