// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.util.Date;

public final class TransactionRequest
{
    private int count;
    private int marker;
    private Date startDate;
    private Date endDate;
    
    public int getCount() {
        return this.count;
    }
    
    public void setCount(final int count) {
        this.count = count;
    }
    
    public int getMarker() {
        return this.marker;
    }
    
    public void setMarker(final int marker) {
        this.marker = marker;
    }
    
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }
    
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }
    
    public boolean isParamPresent() {
        return this.count != 0 || this.marker != 0 || this.startDate != null || this.endDate != null;
    }
}
