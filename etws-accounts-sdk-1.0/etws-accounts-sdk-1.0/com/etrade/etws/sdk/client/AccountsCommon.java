// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.client;

public class AccountsCommon
{
    public static String constructFullURL(final String abstractId, final String resource, final ClientRequest request) {
        String url = null;
        if (request.getEnv() == Environment.SANDBOX) {
            final String sandboxURL = request.getSandboxHost() + "/accounts/sandbox/rest/";
            url = sandboxURL + resource;
        }
        else if (request.getEnv() == Environment.LIVE) {
            final String liveURL = request.getLiveHost() + "/accounts/rest/";
            url = liveURL + resource;
        }
        if (abstractId != null && abstractId.length() > 0) {
            url = url + "/" + abstractId;
        }
        return url;
    }
}
