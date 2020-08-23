// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class Week52Quote
{
    protected double annualDividend;
    protected String companyName;
    protected double high52;
    protected double lastTrade;
    protected double low52;
    protected double perf12Months;
    protected double prevClose;
    protected String symbolDesc;
    protected long totalVolume;
    
    public double getAnnualDividend() {
        return this.annualDividend;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public double getHigh52() {
        return this.high52;
    }
    
    public double getLastTrade() {
        return this.lastTrade;
    }
    
    public double getLow52() {
        return this.low52;
    }
    
    public double getPerf12Months() {
        return this.perf12Months;
    }
    
    public double getPrevClose() {
        return this.prevClose;
    }
    
    public String getSymbolDesc() {
        return this.symbolDesc;
    }
    
    public long getTotalVolume() {
        return this.totalVolume;
    }
}
