// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class QuoteRequest
{
    protected SymbolList symbolList;
    protected String detailFlag;
    
    public SymbolList getSymbolList() {
        return this.symbolList;
    }
    
    public void setSymbolList(final SymbolList value) {
        this.symbolList = value;
    }
    
    public String getDetailFlag() {
        return this.detailFlag;
    }
    
    public void setDetailFlag(final String value) {
        this.detailFlag = value;
    }
}
