// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.util.ArrayList;
import java.util.List;

public class OptionChainResponse
{
    protected int optionPairCount;
    protected List<OptionChainPair> optionPairs;
    protected String symbol;
    
    public int getOptionPairCount() {
        return this.optionPairCount;
    }
    
    public List<OptionChainPair> getOptionPairs() {
        if (this.optionPairs == null) {
            this.optionPairs = new ArrayList<OptionChainPair>();
        }
        return this.optionPairs;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
}
