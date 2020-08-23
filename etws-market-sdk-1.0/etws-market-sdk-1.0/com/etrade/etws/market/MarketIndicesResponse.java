// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.util.ArrayList;
import java.util.List;

public class MarketIndicesResponse
{
    protected int indexCount;
    protected List<MarketIndex> marketIndicesList;
    
    public int getIndexCount() {
        return this.indexCount;
    }
    
    public List<MarketIndex> getMarketIndicesList() {
        if (this.marketIndicesList == null) {
            this.marketIndicesList = new ArrayList<MarketIndex>();
        }
        return this.marketIndicesList;
    }
}
