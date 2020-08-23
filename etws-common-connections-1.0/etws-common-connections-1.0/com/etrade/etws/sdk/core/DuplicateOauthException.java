// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.core;

public class DuplicateOauthException extends Exception
{
    private static final long serialVersionUID = 1L;
    
    public DuplicateOauthException() {
    }
    
    public DuplicateOauthException(final String mesg) {
        super(mesg);
    }
}
