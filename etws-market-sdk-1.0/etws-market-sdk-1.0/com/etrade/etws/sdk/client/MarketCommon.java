// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.client;

import org.apache.commons.lang.StringUtils;

public class MarketCommon
{
    public static String constructFullURL(final String symbol, final String resource, final ClientRequest request) {
        String url = null;
        if (request.getEnv() == Environment.SANDBOX) {
            final String sandboxURL = request.getSandboxHost() + "/market/sandbox/rest/";
            url = sandboxURL + resource;
        }
        else if (request.getEnv() == Environment.LIVE) {
            final String liveURL = request.getLiveHost() + "/market/rest/";
            url = liveURL + resource;
        }
        if (!StringUtils.isEmpty(symbol)) {
            url = url + "/" + symbol;
        }
        return url;
    }
}
