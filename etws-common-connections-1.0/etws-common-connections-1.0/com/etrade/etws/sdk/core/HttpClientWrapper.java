// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.core;

import java.io.IOException;
import java.util.Iterator;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.DeleteMethod;
import java.io.UnsupportedEncodingException;
import org.apache.commons.httpclient.methods.RequestEntity;
import java.io.InputStream;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import java.io.ByteArrayInputStream;
import org.apache.commons.httpclient.methods.EntityEnclosingMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import java.util.Map;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory;
import org.apache.log4j.Logger;

public class HttpClientWrapper
{
    private Logger logger;
    
    public HttpClientWrapper() {
        this.logger = Logger.getLogger((Class)this.getClass());
    }
    
    public static void trustAllCerts() throws Exception {
        final ProtocolSocketFactory sf = (ProtocolSocketFactory)new EasySSLProtocolSocketFactory();
        final Protocol p = new Protocol("https", sf, 443);
        Protocol.registerProtocol("https", p);
    }
    
    public HttpMethodResponse execute(final String url, final String authString, final String method, final Map<String, String[]> parameters, final String body) throws Exception {
        final boolean isDelete = "DELETE".equalsIgnoreCase(method);
        final boolean isPost = "POST".equalsIgnoreCase(method);
        final boolean isGet = "GET".equalsIgnoreCase(method);
        final boolean isPut = "PUT".equalsIgnoreCase(method);
        final byte[] excerpt = null;
        HttpMethod httpMethod = null;
        final String requestContentType = null;
        if (isPost) {
            httpMethod = (HttpMethod)new PostMethod(url);
            final EntityEnclosingMethod entityEnclosingMethod = (EntityEnclosingMethod)httpMethod;
            final String contentType = requestContentType + "; charset=UTF-8";
            ByteArrayInputStream inputStream = null;
            try {
                if (body != null && !body.isEmpty()) {
                    inputStream = new ByteArrayInputStream(body.getBytes("UTF-8"));
                    entityEnclosingMethod.setRequestEntity((RequestEntity)new InputStreamRequestEntity((InputStream)inputStream, contentType));
                }
            }
            catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        else if (isDelete) {
            httpMethod = (HttpMethod)new DeleteMethod(url);
        }
        else {
            httpMethod = (HttpMethod)new GetMethod(url);
            if (parameters != null && parameters.size() > 0) {
                final int paramCount = parameters.size();
                final NameValuePair[] nvp = new NameValuePair[paramCount];
                int i = 0;
                for (final String key : parameters.keySet()) {
                    if (parameters.get(key) != null) {
                        try {
                            final NameValuePair vp = new NameValuePair(key, parameters.get(key)[0]);
                            nvp[i++] = vp;
                        }
                        catch (Exception e2) {
                            this.logger.error((Object)e2.getMessage());
                            throw e2;
                        }
                    }
                }
                httpMethod.setQueryString(nvp);
            }
        }
        httpMethod.addRequestHeader("Content-Type", "application/xml");
        httpMethod.addRequestHeader("Authorization", authString);
        final HttpClient client = new HttpClient();
        try {
            trustAllCerts();
            client.executeMethod(httpMethod);
        }
        catch (Exception e3) {
            this.logger.error((Object)e3.getMessage());
            throw e3;
        }
        return new HttpMethodResponse(httpMethod);
    }
    
    private void populateParameters(final PostMethod postMethod, final Map<String, String[]> parameters) throws IOException {
        if (parameters != null && parameters.size() > 0) {
            final int paramCount = parameters.size();
            final NameValuePair[] nvp = new NameValuePair[paramCount];
            int i = 0;
            for (final String key : parameters.keySet()) {
                if (parameters.get(key) != null) {
                    try {
                        final NameValuePair vp = new NameValuePair(key, parameters.get(key)[0]);
                        nvp[i++] = vp;
                    }
                    catch (Exception e) {
                        this.logger.error((Object)e.getMessage());
                        throw new IOException();
                    }
                }
            }
            postMethod.addParameters(nvp);
        }
    }
}
