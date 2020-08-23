// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.util.ArrayList;
import java.util.List;

public class GetTransactionHistoryResponse
{
    protected String next;
    protected int count;
    protected List<Transaction> transactionList;
    private long accountId;
    
    public List<Transaction> getResponse() {
        if (this.transactionList == null) {
            this.transactionList = new ArrayList<Transaction>();
        }
        return this.transactionList;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public void setCount(final int count) {
        this.count = count;
    }
    
    public String getNext() {
        return this.next;
    }
    
    public void setNext(final String next) {
        this.next = next;
    }
    
    public long getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(final long accountId) {
        this.accountId = accountId;
    }
}
