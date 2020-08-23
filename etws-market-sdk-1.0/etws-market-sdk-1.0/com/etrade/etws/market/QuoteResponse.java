// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.util.ArrayList;
import java.util.List;

public class QuoteResponse
{
    protected List<QuoteData> quoteData;
    
    public List<QuoteData> getQuoteData() {
        if (this.quoteData == null) {
            this.quoteData = new ArrayList<QuoteData>();
        }
        return this.quoteData;
    }
}
