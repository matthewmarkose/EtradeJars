// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class FundamentalQuote
{
    protected String companyName;
    protected double eps;
    protected double estEarnings;
    protected double high52;
    protected double lastTrade;
    protected double low52;
    protected String symbolDesc;
    protected long volume10Day;
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public double getEps() {
        return this.eps;
    }
    
    public double getEstEarnings() {
        return this.estEarnings;
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
    
    public String getSymbolDesc() {
        return this.symbolDesc;
    }
    
    public long getVolume10Day() {
        return this.volume10Day;
    }
}
