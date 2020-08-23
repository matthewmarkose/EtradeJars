// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.math.BigDecimal;

public class CallOptionChain
{
    protected String rootSymbol;
    protected ExpirationDate expireDate;
    protected ProductId product;
    protected BigDecimal strikePrice;
    
    public String getRootSymbol() {
        return this.rootSymbol;
    }
    
    public ExpirationDate getExpireDate() {
        return this.expireDate;
    }
    
    public ProductId getProduct() {
        return this.product;
    }
    
    public BigDecimal getStrikePrice() {
        return this.strikePrice;
    }
}
