// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public final class GetTransactionDetailsResponse
{
    private long transactionDate;
    private String transactionType;
    private String userDescription;
    private String transactionDescription;
    private int quantity;
    private BigDecimal amount;
    private BigDecimal price;
    private BigDecimal commission;
    private ProductId productId;
    private String underlyingProductId;
    private String displaySymbol;
    private long accountOrderNo;
    private String settlementCurrency;
    private String paymentCurrency;
    private String category;
    private long settlementDate;
    
    public long getTransactionDate() {
        return this.transactionDate;
    }
    
    public void setTransactionDate(final long transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    public String getTransactionType() {
        return this.transactionType;
    }
    
    public void setTransactionType(final String transactionType) {
        this.transactionType = transactionType;
    }
    
    public String getUserDescription() {
        return this.userDescription;
    }
    
    public void setUserDescription(final String userDescription) {
        this.userDescription = userDescription;
    }
    
    public String getTransactionDescription() {
        return this.transactionDescription;
    }
    
    public void setTransactionDescription(final String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }
    
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }
    
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(final BigDecimal price) {
        this.price = price;
    }
    
    public BigDecimal getCommission() {
        return this.commission;
    }
    
    public void setCommission(final BigDecimal commission) {
        this.commission = commission;
    }
    
    public ProductId getProductId() {
        return this.productId;
    }
    
    public void setProductId(final ProductId productId) {
        this.productId = productId;
    }
    
    public String getUnderlyingProductId() {
        return this.underlyingProductId;
    }
    
    public void setUnderlyingProductId(final String underlyingProductId) {
        this.underlyingProductId = underlyingProductId;
    }
    
    public String getDisplaySymbol() {
        return this.displaySymbol;
    }
    
    public void setDisplaySymbol(final String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }
    
    public long getAccountOrderNo() {
        return this.accountOrderNo;
    }
    
    public void setAccountOrderNo(final long accountOrderNo) {
        this.accountOrderNo = accountOrderNo;
    }
    
    public String getSettlementCurrency() {
        return this.settlementCurrency;
    }
    
    public void setSettlementCurrency(final String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }
    
    public String getPaymentCurrency() {
        return this.paymentCurrency;
    }
    
    public void setPaymentCurrency(final String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }
    
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(final String category) {
        this.category = category;
    }
    
    public long getSettlementDate() {
        return this.settlementDate;
    }
    
    public void setSettlementDate(final long settlementDate) {
        this.settlementDate = settlementDate;
    }
}
