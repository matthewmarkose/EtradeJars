// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.core;

public class UnsupportedURLSchemeException extends Exception
{
    private static final long serialVersionUID = 1L;
    
    public UnsupportedURLSchemeException(final String scheme) {
        super(scheme + " is not supported");
    }
}
