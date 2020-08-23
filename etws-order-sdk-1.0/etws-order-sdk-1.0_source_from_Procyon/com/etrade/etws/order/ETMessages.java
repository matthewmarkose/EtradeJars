// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.order;

import java.util.ArrayList;
import java.util.List;

public class ETMessages
{
    protected List<ETAppMessages> message;
    
    public List<ETAppMessages> getMessage() {
        if (this.message == null) {
            this.message = new ArrayList<ETAppMessages>();
        }
        return this.message;
    }
}
