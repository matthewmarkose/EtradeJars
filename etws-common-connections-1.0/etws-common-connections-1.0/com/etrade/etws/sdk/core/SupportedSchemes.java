// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.core;

public enum SupportedSchemes
{
    HTTP, 
    HTTPS;
    
    public static boolean isSupportedScheme(final String scheme) {
        try {
            return valueOf(scheme.toUpperCase()) != null;
        }
        catch (Exception ex) {
            return false;
        }
    }
}
