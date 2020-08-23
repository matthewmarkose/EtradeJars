// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.util.ArrayList;
import java.util.List;

public class AccountPositionsResponse
{
    protected String accountId;
    protected int count;
    protected String marker;
    protected List<AccountPosition> response;
    
    public String getAccountId() {
        return this.accountId;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public String getMarker() {
        return this.marker;
    }
    
    public List<AccountPosition> getResponse() {
        if (this.response == null) {
            this.response = new ArrayList<AccountPosition>();
        }
        return this.response;
    }
}
