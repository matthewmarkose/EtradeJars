// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.util.ArrayList;
import java.util.List;

public final class AccountListResponse
{
    private List<Account> response;
    
    public List<Account> getResponse() {
        if (this.response == null) {
            this.response = new ArrayList<Account>();
        }
        return this.response;
    }
}
