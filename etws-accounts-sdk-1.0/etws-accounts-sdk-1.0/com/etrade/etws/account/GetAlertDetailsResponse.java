// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public class GetAlertDetailsResponse
{
    protected long createDate;
    protected long alertId;
    protected String msgText;
    protected long readDate;
    protected String subject;
    
    public long getCreateDate() {
        return this.createDate;
    }
    
    public long getAlertId() {
        return this.alertId;
    }
    
    public String getMsgText() {
        return this.msgText;
    }
    
    public long getReadDate() {
        return this.readDate;
    }
    
    public String getSubject() {
        return this.subject;
    }
}
