// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.oauth.sdk.client;

import com.etrade.etws.sdk.common.ETWSException;
import java.io.IOException;
import com.etrade.etws.oauth.sdk.common.Token;
import com.etrade.etws.sdk.client.ClientRequest;

public interface IOAuthClient
{
    Token getRequestToken(final ClientRequest p0) throws IOException, ETWSException;
    
    Token getAccessToken(final ClientRequest p0) throws IOException, ETWSException;
    
    void renewAccessToken(final ClientRequest p0) throws IOException, ETWSException;
    
    void revokeAccessToken(final ClientRequest p0) throws IOException, ETWSException;
    
    String getAuthorizeUrl(final ClientRequest p0) throws ETWSException;
}
