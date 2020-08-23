// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.core;

public enum OAuthParameter
{
    oauth_consumer_key, 
    oauth_token, 
    oauth_signature_method, 
    oauth_signature, 
    oauth_timestamp, 
    oauth_nonce, 
    oauth_version, 
    realm, 
    oauth_callback, 
    oauth_verifier, 
    xoauth_module, 
    xoauth_response_format;
    
    public static boolean isOAuthParameter(final String someParam) {
        try {
            return someParam != null && valueOf(someParam) != null;
        }
        catch (Exception e) {
            return false;
        }
    }
}
