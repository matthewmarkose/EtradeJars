// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public enum DayTraderStatus
{
    NOT_QUALIFIED("NOT_QUALIFIED"), 
    QUALIFIED_4_X("QUALIFIED_4X"), 
    MARGIN_CALL_2_XD("MARGIN_CALL_2XD"), 
    MARGIN_CALL_1_XD("MARGIN_CALL_1XD"), 
    MIN_EQUITY_CALL_1_XK("MIN_EQUITY_CALL_1XK"), 
    QUALIFIED_RESTRICTION("QUALIFIED_RESTRICTION"), 
    CASH_ONLY("CASH_ONLY");
    
    private final String value;
    
    private DayTraderStatus(final String v) {
        this.value = v;
    }
    
    public String value() {
        return this.value;
    }
    
    public static DayTraderStatus fromValue(final String v) {
        for (final DayTraderStatus c : values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
