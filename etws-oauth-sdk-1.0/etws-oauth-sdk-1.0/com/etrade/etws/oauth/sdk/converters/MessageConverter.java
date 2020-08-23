// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.oauth.sdk.converters;

import com.etrade.etws.sdk.core.OAuthSignatureUtils;
import java.util.StringTokenizer;
import java.io.IOException;
import com.etrade.etws.oauth.sdk.common.Token;
import org.apache.log4j.Logger;

public class MessageConverter
{
    private static Logger logger;
    
    public static Token convertToToken(final String is) throws IOException {
        final Token token = new Token();
        populateToken(token, is);
        return token;
    }
    
    private static void populateToken(final Token token, final String responseString) {
        final StringTokenizer paramTokenizer = new StringTokenizer(responseString, "&");
        while (paramTokenizer.hasMoreTokens()) {
            final String param = paramTokenizer.nextToken();
            final String paramName = param.substring(0, param.indexOf("="));
            final String paramValue = param.substring(param.indexOf("=") + 1);
            if (paramName.equals("oauth_token")) {
                try {
                    token.setToken(OAuthSignatureUtils.urlDecode(paramValue));
                }
                catch (Exception e) {
                    MessageConverter.logger.error((Object)"Token decoding failed");
                }
            }
            else {
                if (!paramName.equals("oauth_token_secret")) {
                    continue;
                }
                try {
                    token.setSecret(OAuthSignatureUtils.urlDecode(paramValue));
                }
                catch (Exception e) {
                    MessageConverter.logger.error((Object)"Token secret decoding failed");
                }
            }
        }
    }
    
    static {
        MessageConverter.logger = Logger.getLogger((Class)MessageConverter.class);
    }
}
