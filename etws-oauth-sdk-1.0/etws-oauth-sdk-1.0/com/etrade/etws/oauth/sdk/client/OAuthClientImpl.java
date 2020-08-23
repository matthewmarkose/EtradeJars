// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.oauth.sdk.client;

import java.io.UnsupportedEncodingException;
import com.etrade.etws.sdk.core.OAuthSignatureUtils;
import com.etrade.etws.sdk.core.HttpApiResponse;
import java.util.List;
import java.io.IOException;
import com.etrade.etws.oauth.sdk.converters.MessageConverter;
import java.util.Map;
import com.etrade.etws.sdk.core.ConnectionUtils;
import com.etrade.etws.sdk.common.ETWSException;
import java.util.ArrayList;
import com.etrade.etws.oauth.sdk.common.Token;
import com.etrade.etws.sdk.client.ClientRequest;
import org.apache.log4j.Logger;

public class OAuthClientImpl implements IOAuthClient
{
    private Logger logger;
    private static OAuthClientImpl instance;
    
    private OAuthClientImpl() {
        this.logger = Logger.getLogger((Class)this.getClass());
    }
    
    public static OAuthClientImpl getInstance() {
        return OAuthClientImpl.instance;
    }
    
    private static boolean isEmpty(final String s) {
        return s == null || s.trim().length() == 0;
    }
    
    @Override
    public Token getRequestToken(final ClientRequest request) throws ETWSException {
        final List<String> emptyParams = new ArrayList<String>();
        if (isEmpty(request.getConsumerKey())) {
            emptyParams.add("Consumer Key");
        }
        if (isEmpty(request.getConsumerSecret())) {
            emptyParams.add("Consumer Secret");
        }
        if (emptyParams != null && !emptyParams.isEmpty()) {
            this.logger.error((Object)"Mandatory parameters missing");
            throw new ETWSException(-1, "Mandatory parameters missing: " + emptyParams);
        }
        Token requestToken = null;
        final String url = OAuthCommon.constructFullURL("request_token", request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", request, (Map)null, "oob", (String)null);
            final String is = response.getResponseString();
            this.logger.info((Object)("output is :" + is.toString()));
            requestToken = MessageConverter.convertToToken(is);
        }
        catch (IOException e) {
            throw new ETWSException((Exception)e);
        }
        return requestToken;
    }
    
    @Override
    public String getAuthorizeUrl(final ClientRequest request) throws ETWSException {
        final List<String> emptyParams = new ArrayList<String>();
        if (isEmpty(request.getConsumerKey())) {
            emptyParams.add("Consumer Key");
        }
        if (isEmpty(request.getToken())) {
            emptyParams.add("Token");
        }
        if (emptyParams != null && !emptyParams.isEmpty()) {
            this.logger.error((Object)"Mandatory parameters missing");
            throw new ETWSException(-1, "Mandatory parameters missing: " + emptyParams);
        }
        final String baseUrl = request.getBaseAuthorizeUrl();
        String url = null;
        try {
            url = baseUrl + "?key=" + request.getConsumerKey() + "&token=" + OAuthSignatureUtils.urlEncode(request.getToken());
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return url;
    }
    
    @Override
    public Token getAccessToken(final ClientRequest request) throws ETWSException {
        final List<String> emptyParams = new ArrayList<String>();
        if (isEmpty(request.getConsumerKey())) {
            emptyParams.add("Consumer Key");
        }
        if (isEmpty(request.getConsumerSecret())) {
            emptyParams.add("Consumer Secret");
        }
        if (isEmpty(request.getToken())) {
            emptyParams.add("Token");
        }
        if (isEmpty(request.getTokenSecret())) {
            emptyParams.add("Token Secret");
        }
        if (isEmpty(request.getVerifierCode())) {
            emptyParams.add("Verifier Code");
        }
        if (emptyParams != null && !emptyParams.isEmpty()) {
            this.logger.error((Object)"Mandatory parameters missing");
            throw new ETWSException(-1, "Mandatory parameters missing: " + emptyParams);
        }
        Token accessToken = null;
        final String url = OAuthCommon.constructFullURL("access_token", request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", request, (Map)null);
            final String is = response.getResponseString();
            this.logger.info((Object)("output is :" + is.toString()));
            accessToken = MessageConverter.convertToToken(is);
        }
        catch (IOException e) {
            throw new ETWSException((Exception)e);
        }
        return accessToken;
    }
    
    @Override
    public void renewAccessToken(final ClientRequest request) throws ETWSException {
        final List<String> emptyParams = new ArrayList<String>();
        if (isEmpty(request.getConsumerKey())) {
            emptyParams.add("Consumer Key");
        }
        if (isEmpty(request.getConsumerSecret())) {
            emptyParams.add("Consumer Secret");
        }
        if (isEmpty(request.getToken())) {
            emptyParams.add("Token");
        }
        if (isEmpty(request.getTokenSecret())) {
            emptyParams.add("Token Secret");
        }
        if (emptyParams != null && !emptyParams.isEmpty()) {
            this.logger.error((Object)"Mandatory parameters missing");
            throw new ETWSException(-1, "Mandatory parameters missing: " + emptyParams);
        }
        final String url = OAuthCommon.constructFullURL("renew_access_token", request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", request, (Map)null);
            final String is = response.getResponseString();
            this.logger.info((Object)("output is : " + is));
        }
        catch (IOException e) {
            throw new ETWSException((Exception)e);
        }
    }
    
    @Override
    public void revokeAccessToken(final ClientRequest request) throws ETWSException {
        final List<String> emptyParams = new ArrayList<String>();
        if (isEmpty(request.getConsumerKey())) {
            emptyParams.add("Consumer Key");
        }
        if (isEmpty(request.getConsumerSecret())) {
            emptyParams.add("Consumer Secret");
        }
        if (isEmpty(request.getToken())) {
            emptyParams.add("Token");
        }
        if (isEmpty(request.getTokenSecret())) {
            emptyParams.add("Token Secret");
        }
        if (emptyParams != null && !emptyParams.isEmpty()) {
            this.logger.error((Object)"Mandatory parameters missing");
            throw new ETWSException(-1, "Mandatory parameters missing: " + emptyParams);
        }
        final String url = OAuthCommon.constructFullURL("revoke_access_token", request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", request, (Map)null);
            final String is = response.getResponseString();
            this.logger.info((Object)("output is : " + is));
        }
        catch (IOException e) {
            throw new ETWSException((Exception)e);
        }
    }
    
    static {
        OAuthClientImpl.instance = new OAuthClientImpl();
    }
}
