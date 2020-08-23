// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.util.ArrayList;
import java.util.List;

public class OptionChainPair
{
    protected List<CallOptionChain> call;
    protected int callCount;
    protected PairType pairType;
    protected List<PutOptionChain> put;
    protected int putCount;
    
    public List<CallOptionChain> getCall() {
        if (this.call == null) {
            this.call = new ArrayList<CallOptionChain>();
        }
        return this.call;
    }
    
    public int getCallCount() {
        return this.callCount;
    }
    
    public PairType getPairType() {
        return this.pairType;
    }
    
    public List<PutOptionChain> getPut() {
        if (this.put == null) {
            this.put = new ArrayList<PutOptionChain>();
        }
        return this.put;
    }
    
    public int getPutCount() {
        return this.putCount;
    }
}
