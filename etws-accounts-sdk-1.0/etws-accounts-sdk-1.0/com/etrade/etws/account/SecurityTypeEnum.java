// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import org.apache.commons.lang.StringUtils;

public enum SecurityTypeEnum
{
    ALL("ALL"), 
    EQ("EQ"), 
    OPTN("OPTN"), 
    MMF("MMF"), 
    MF("MF"), 
    BONDS("BONDS");
    
    private String name;
    
    private SecurityTypeEnum(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return StringUtils.lowerCase(this.name);
    }
}
