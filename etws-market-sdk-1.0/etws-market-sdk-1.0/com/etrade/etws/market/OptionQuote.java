// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class OptionQuote
{
    protected double ask;
    protected long askSize;
    protected double bid;
    protected long bidSize;
    protected String companyName;
    protected long daysToExpiration;
    protected double lastTrade;
    protected long openInterest;
    
    public double getAsk() {
        return this.ask;
    }
    
    public long getAskSize() {
        return this.askSize;
    }
    
    public double getBid() {
        return this.bid;
    }
    
    public long getBidSize() {
        return this.bidSize;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public long getDaysToExpiration() {
        return this.daysToExpiration;
    }
    
    public double getLastTrade() {
        return this.lastTrade;
    }
    
    public long getOpenInterest() {
        return this.openInterest;
    }
}
