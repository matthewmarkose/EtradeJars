// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class IntradayQuote
{
    protected double ask;
    protected double bid;
    protected double chgClose;
    protected double chgClosePrcn;
    protected String companyName;
    protected double high;
    protected double lastTrade;
    protected double low;
    protected long totalVolume;
    
    public double getAsk() {
        return this.ask;
    }
    
    public double getBid() {
        return this.bid;
    }
    
    public double getChgClose() {
        return this.chgClose;
    }
    
    public double getChgClosePrcn() {
        return this.chgClosePrcn;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public double getHigh() {
        return this.high;
    }
    
    public double getLastTrade() {
        return this.lastTrade;
    }
    
    public double getLow() {
        return this.low;
    }
    
    public long getTotalVolume() {
        return this.totalVolume;
    }
}
