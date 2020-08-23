// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.math.BigDecimal;

public class Transaction
{
    private long transactionId;
    protected long transactionDate;
    protected String transactionShortDesc;
    protected String description;
    protected BigDecimal amount;
    protected String details;
    
    public long getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(final long transactionId) {
        this.transactionId = transactionId;
    }
    
    public long getTransactionDate() {
        return this.transactionDate;
    }
    
    public void setTransactionDate(final long transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    public String getTransactionShortDesc() {
        return this.transactionShortDesc;
    }
    
    public void setTransactionShortDesc(final String transactionShortDesc) {
        this.transactionShortDesc = transactionShortDesc;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }
    
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(final String details) {
        this.details = details;
    }
}
