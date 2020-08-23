// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.util.ArrayList;
import java.util.List;

public class AccountIdList
{
    protected List<String> accountId;
    
    public List<String> getAccountId() {
        if (this.accountId == null) {
            this.accountId = new ArrayList<String>();
        }
        return this.accountId;
    }
}
