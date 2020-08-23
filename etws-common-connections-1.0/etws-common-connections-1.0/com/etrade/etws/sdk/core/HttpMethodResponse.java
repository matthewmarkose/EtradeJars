// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.core;

import org.apache.commons.httpclient.Header;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.log4j.Logger;

public class HttpMethodResponse
{
    private Logger logger;
    private final HttpMethod method;
    
    public HttpMethodResponse(final HttpMethod method) throws IOException {
        this.logger = Logger.getLogger((Class)this.getClass());
        this.method = method;
    }
    
    public int getStatusCode() {
        return this.method.getStatusCode();
    }
    
    public InputStream openBody() throws IOException {
        return this.method.getResponseBodyAsStream();
    }
    
    public String getResponseString() throws IOException {
        final InputStream is = this.openBody();
        final StringBuilder sb = new StringBuilder();
        if (is != null) {
            try {
                final BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
            }
            finally {
                is.close();
            }
        }
        else {
            sb.append("output is NULL");
        }
        return sb.toString();
    }
    
    public String getAuthenticateHeader() throws IOException {
        String problem = "";
        final Header header = this.method.getResponseHeader("WWW-Authenticate");
        if (header != null) {
            this.logger.info((Object)("Header value is " + header.getValue()));
            final String[] values = header.getValue().split(",");
            final int count = values.length;
            this.logger.info((Object)("Count is " + count));
            if (count == 1) {
                problem += values[0];
            }
            else {
                problem += values[1];
            }
            this.logger.info((Object)("Problem is " + problem));
        }
        return problem;
    }
    
    public void releaseConnection() {
        this.method.releaseConnection();
    }
}
