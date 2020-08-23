// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.client;

import org.apache.commons.lang.StringUtils;

public class OrderCommon
{
    public static String constructFullURL(final String accountId, final String resource, final ClientRequest request) {
        String url = null;
        if (request.getEnv() == Environment.SANDBOX) {
            final String sandboxURL = request.getSandboxHost() + "/order/sandbox/rest/";
            url = sandboxURL + resource;
        }
        else if (request.getEnv() == Environment.LIVE) {
            final String liveURL = request.getLiveHost() + "/order/rest/";
            url = liveURL + resource;
        }
        if (!StringUtils.isEmpty(accountId)) {
            url = url + "/" + accountId;
        }
        return url;
    }
}
