// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.oauth.sdk.client;

import com.etrade.etws.sdk.client.ClientRequest;

public class OAuthCommon
{
    public static String constructFullURL(final String resource, final ClientRequest request) {
        String url = null;
        final String liveURL = request.getLiveHost() + "/oauth/";
        url = liveURL + resource;
        return url;
    }
}
