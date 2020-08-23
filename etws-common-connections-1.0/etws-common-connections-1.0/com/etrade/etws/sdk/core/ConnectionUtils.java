// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.core;

import com.etrade.etws.sdk.common.ETWSUtil;
import com.etrade.etws.sdk.common.ETWSException;
import java.io.IOException;
import java.util.Map;
import com.etrade.etws.sdk.client.ClientRequest;
import org.apache.log4j.Logger;

public class ConnectionUtils
{
    public static ConnectionUtils instance;
    private static Logger logger;
    
    public static ConnectionUtils getInstance() {
        if (ConnectionUtils.instance == null) {
            ConnectionUtils.instance = new ConnectionUtils();
        }
        return ConnectionUtils.instance;
    }
    
    public static HttpApiResponse invoke(final String url, final String httpMethod, final ClientRequest request, final Map<String, String[]> parameters) throws IOException, ETWSException {
        return invoke(url, httpMethod, request, parameters, null, null);
    }
    
    public static HttpApiResponse invoke(final String url, final String httpMethod, final ClientRequest request, final Map<String, String[]> parameters, final String body) throws IOException, ETWSException {
        return invoke(url, httpMethod, request, parameters, null, body);
    }
    
    public static HttpApiResponse invoke(final String url, final String httpMethod, final ClientRequest request, final Map<String, String[]> parameters, final String oauth_callback, final String body) throws IOException, ETWSException {
        final String authString = OAuthSignatureUtils.sign(url, httpMethod, parameters, request.getConsumerKey(), request.getConsumerSecret(), request.getToken(), request.getTokenSecret(), oauth_callback, request.getVerifierCode());
        System.out.println("URL : " + url);
        final HttpClientWrapper wrapperClient = new HttpClientWrapper();
        HttpMethodResponse response = null;
        try {
            response = wrapperClient.execute(url, authString, httpMethod, parameters, body);
        }
        catch (IOException e) {
            System.out.println("In HttpClientWrapper catch of IOException ");
            ConnectionUtils.logger.error((Object)e.getMessage());
            throw e;
        }
        catch (Exception e2) {
            System.out.println("In HttpClientWrapper catch of Exception ");
            ConnectionUtils.logger.error((Object)e2.getMessage());
            throw ETWSUtil.constructException(9999, e2.getMessage());
        }
        if (response == null) {
            throw ETWSUtil.constructException("Unable to get response.");
        }
        int statusCode = 0;
        String responseString = "";
        try {
            statusCode = response.getStatusCode();
        }
        catch (Exception e3) {
            throw ETWSUtil.constructException(9999, e3.getMessage());
        }
        try {
            responseString = response.getResponseString();
        }
        catch (Exception e3) {
            throw ETWSUtil.constructException(statusCode, e3.getMessage());
        }
        if (responseString != null && responseString.trim().startsWith("<Error>")) {
            throw ETWSUtil.constructException(statusCode, responseString);
        }
        if (statusCode / 100 == 2) {
            System.out.println("==================OUTPUT========================");
            System.out.println("StatusCode : " + statusCode);
            System.out.println("responseString : \n" + responseString);
            System.out.println("==================END OUTPUT========================");
            response.releaseConnection();
            final HttpApiResponse apiResponseObject = new HttpApiResponse();
            apiResponseObject.setStatusCode(statusCode);
            apiResponseObject.setResponseString(responseString);
            return apiResponseObject;
        }
        String responseHeader = null;
        try {
            responseHeader = response.getAuthenticateHeader();
        }
        catch (Exception e4) {
            throw ETWSUtil.constructException(9999, "Unable to get response headers.");
        }
        if (responseHeader != null && !responseHeader.isEmpty()) {
            throw ETWSUtil.constructException(statusCode, responseHeader);
        }
        throw ETWSUtil.constructException(statusCode, responseString);
    }
    
    static {
        ConnectionUtils.instance = null;
        ConnectionUtils.logger = Logger.getLogger((Class)ConnectionUtils.class);
    }
}
