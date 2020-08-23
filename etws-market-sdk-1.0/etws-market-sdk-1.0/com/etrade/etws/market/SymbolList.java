// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.util.ArrayList;
import java.util.List;

public class SymbolList
{
    protected List<String> symbol;
    
    public List<String> getSymbol() {
        if (this.symbol == null) {
            this.symbol = new ArrayList<String>();
        }
        return this.symbol;
    }
}
