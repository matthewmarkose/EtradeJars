// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class QuoteData
{
    protected AllQuote all;
    protected String dateTime;
    protected String errorMessage;
    protected FundamentalQuote fundamental;
    protected IntradayQuote intraday;
    protected OptionQuote option;
    protected DetailProduct product;
    protected Week52Quote week52;
    
    public AllQuote getAll() {
        return this.all;
    }
    
    public String getDateTime() {
        return this.dateTime;
    }
    
    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public FundamentalQuote getFundamental() {
        return this.fundamental;
    }
    
    public IntradayQuote getIntraday() {
        return this.intraday;
    }
    
    public OptionQuote getOption() {
        return this.option;
    }
    
    public DetailProduct getProduct() {
        return this.product;
    }
    
    public Week52Quote getWeek52() {
        return this.week52;
    }
}
