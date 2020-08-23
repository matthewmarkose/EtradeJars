// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.math.BigInteger;

public class CancelResponse
{
    protected String accountId;
    protected BigInteger orderNum;
    protected long cancelTime;
    protected ETMessages messageList;
    protected String resultMessage;
    
    public String getAccountId() {
        return this.accountId;
    }
    
    public BigInteger getOrderNum() {
        return this.orderNum;
    }
    
    public long getCancelTime() {
        return this.cancelTime;
    }
    
    public ETMessages getMessageList() {
        return this.messageList;
    }
    
    public String getResultMessage() {
        return this.resultMessage;
    }
}
