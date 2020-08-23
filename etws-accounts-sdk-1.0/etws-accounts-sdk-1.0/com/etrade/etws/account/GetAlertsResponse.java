// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.util.ArrayList;
import java.util.List;

public class GetAlertsResponse
{
    protected List<Alert> response;
    
    public List<Alert> getResponse() {
        if (this.response == null) {
            this.response = new ArrayList<Alert>();
        }
        return this.response;
    }
}
