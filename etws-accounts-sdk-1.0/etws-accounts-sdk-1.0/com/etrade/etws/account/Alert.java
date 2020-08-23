// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public class Alert
{
    protected long dateTime;
    protected long alertId;
    protected String subject;
    protected AlertCategory category;
    protected AlertReadFlag readFlag;
    protected String symbol;
    
    public long getDateTime() {
        return this.dateTime;
    }
    
    public long getAlertId() {
        return this.alertId;
    }
    
    public String getSubject() {
        return this.subject;
    }
    
    public AlertCategory getCategory() {
        return this.category;
    }
    
    public AlertReadFlag getReadFlag() {
        return this.readFlag;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
}
