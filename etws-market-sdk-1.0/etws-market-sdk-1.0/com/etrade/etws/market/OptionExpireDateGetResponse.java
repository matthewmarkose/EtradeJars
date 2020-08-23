// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.util.ArrayList;
import java.util.List;

public class OptionExpireDateGetResponse
{
    protected List<ExpirationDate> expireDates;
    protected String symbol;
    
    public List<ExpirationDate> getExpireDates() {
        if (this.expireDates == null) {
            this.expireDates = new ArrayList<ExpirationDate>();
        }
        return this.expireDates;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
}
