// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

public class ExpirationDate
{
    protected int day;
    protected String month;
    protected int year;
    protected String expiryType;
    
    public int getDay() {
        return this.day;
    }
    
    public String getMonth() {
        return this.month;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getExpiryType() {
        return this.expiryType;
    }
}
