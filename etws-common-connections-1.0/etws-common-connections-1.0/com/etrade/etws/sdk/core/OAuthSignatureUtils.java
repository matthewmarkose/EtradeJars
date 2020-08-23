// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.core;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.binary.Base64;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class OAuthSignatureUtils
{
    private static String HMAC_SHA1_ALGORITHM;
    private static Logger logger;
    
    public static boolean isEmpty(final String s) {
        return s == null || s.trim().length() == 0;
    }
    
    public static String stripQuotes(final String string) {
        if (!isEmpty(string) && string.startsWith("\"") && string.endsWith("\"")) {
            return string.substring(1, string.length() - 1);
        }
        return string;
    }
    
    public static String getSignatureBaseString(final String normalizedParamString, String httpMethod, final String requestUrl, final String hostHeader) throws MalformedURLException, UnsupportedURLSchemeException, UnsupportedEncodingException {
        if (isEmpty(httpMethod)) {
            throw new IllegalArgumentException("Unsupported HTTP Method " + httpMethod);
        }
        httpMethod = httpMethod.toUpperCase();
        final URL url = new URL(requestUrl);
        String scheme = url.getProtocol();
        if (!SupportedSchemes.isSupportedScheme(scheme)) {
            throw new UnsupportedURLSchemeException(scheme);
        }
        scheme = scheme.toLowerCase();
        int port = url.getPort();
        String host = url.getHost();
        if (!isEmpty(hostHeader)) {
            hostHeader.split(":");
            final String[] hostPart = hostHeader.split(":");
            final String headerHost = hostPart[0];
            int headerPort = -1;
            if (hostPart.length == 2) {
                headerPort = Integer.parseInt(hostPart[1]);
            }
            if (!headerHost.equals(host)) {
                host = headerHost;
            }
            if (headerPort != port) {
                port = headerPort;
            }
        }
        port = ((port == url.getDefaultPort()) ? -1 : url.getPort());
        final StringBuilder baseString = new StringBuilder();
        baseString.append(scheme + "://");
        baseString.append(host.toLowerCase());
        if (port != -1) {
            baseString.append(":" + port);
        }
        final String path = url.getPath();
        if (!isEmpty(path)) {
            baseString.append(path);
        }
        final String baseStringUri = urlEncode(baseString.toString());
        final String normalizedEncodedParamString = urlEncode(normalizedParamString);
        final String signatureBaseString = httpMethod + "&" + baseStringUri + "&" + normalizedEncodedParamString;
        return signatureBaseString.toString();
    }
    
    public static String getHMACSHA1Signature(final String signatureBaseString, final String sharedSecret, final String tokenSecret) throws UnsupportedEncodingException {
        final String key = isEmpty(tokenSecret) ? (urlEncode(sharedSecret) + "&") : (urlEncode(sharedSecret) + "&" + urlEncode(tokenSecret));
        final SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), OAuthSignatureUtils.HMAC_SHA1_ALGORITHM);
        Mac mac = null;
        try {
            mac = Mac.getInstance(OAuthSignatureUtils.HMAC_SHA1_ALGORITHM);
        }
        catch (NoSuchAlgorithmException e) {
            OAuthSignatureUtils.logger.error((Object)e, (Throwable)e);
            throw new IllegalArgumentException(e);
        }
        try {
            mac.init(signingKey);
        }
        catch (InvalidKeyException e2) {
            OAuthSignatureUtils.logger.error((Object)e2, (Throwable)e2);
            throw new IllegalArgumentException(e2);
        }
        final byte[] raw = mac.doFinal(signatureBaseString.getBytes());
        final String result = new String(Base64.encodeBase64(raw));
        return result;
    }
    
    private static Map<String, String[]> convertOAuthMapToStringArrayMap(final Map<OAuthParameter, String> oauthMap) {
        if (oauthMap == null) {
            return null;
        }
        final Map<String, String[]> stringMap = new HashMap<String, String[]>(oauthMap.size());
        for (final OAuthParameter parameter : oauthMap.keySet()) {
            stringMap.put(parameter.name(), new String[] { oauthMap.get(parameter) });
        }
        return stringMap;
    }
    
    public static String sign(final String url, final String httpMethod, final Map<String, String[]> parameters, final String oauth_consumer_key, final String oauth_consumer_secret, final String oauth_access_token, final String oauth_token_secret, final String oauth_callback) {
        return sign(url, httpMethod, parameters, oauth_consumer_key, oauth_consumer_secret, oauth_access_token, oauth_token_secret, oauth_callback, null);
    }
    
    public static String getNormalizedParamString(final Map<String, String[]> requestMap) throws DuplicateOauthException, UnsupportedEncodingException {
        final Map<String, String[]> collectedParams = new HashMap<String, String[]>();
        final Map<OAuthParameter, String> oauthParameters = new HashMap<OAuthParameter, String>();
        oauthParameters.remove(OAuthParameter.realm);
        if (!oauthParameters.isEmpty()) {
            collectedParams.putAll(convertOAuthMapToStringArrayMap(oauthParameters));
        }
        collectedParams.putAll(requestMap);
        collectedParams.remove(OAuthParameter.oauth_signature.name());
        final TreeMap<String, String[]> sortedMap = new TreeMap<String, String[]>();
        for (final String key : collectedParams.keySet()) {
            final String[] encodedValues = (collectedParams.get(key) != null) ? new String[collectedParams.get(key).length] : new String[0];
            for (int i = 0; i < encodedValues.length; ++i) {
                encodedValues[i] = urlEncode(collectedParams.get(key)[i]);
            }
            Arrays.sort(encodedValues);
            sortedMap.put(urlEncode(key), encodedValues);
        }
        final StringBuilder normalizedRequest = new StringBuilder();
        for (final String key2 : sortedMap.keySet()) {
            if (sortedMap.get(key2) == null || sortedMap.get(key2).length == 0) {
                normalizedRequest.append(key2 + "=&");
            }
            for (final String value : sortedMap.get(key2)) {
                normalizedRequest.append(key2 + "=" + value + "&");
            }
        }
        final String normalizedParamString = normalizedRequest.toString().substring(0, normalizedRequest.length() - 1);
        return normalizedParamString;
    }
    
    public static String sign(final String url, final String httpMethod, final Map<String, String[]> parameters, final String oauth_consumer_key, final String oauth_consumer_secret, final String oauth_access_token, final String oauth_token_secret, final String oauth_callback, final String oauth_verifier) {
        final String oauth_timestamp = "" + System.currentTimeMillis() / 1000L;
        final SecureRandom secureRand = new SecureRandom();
        final long generatedNo = secureRand.nextLong();
        final String oauth_nonce = new String(Base64.encodeBase64(("" + generatedNo).getBytes()));
        final String oauth_signature_method = "HMAC-SHA1";
        final HashMap<String, String[]> requestMap = new HashMap<String, String[]>();
        requestMap.put("oauth_consumer_key", new String[] { oauth_consumer_key });
        requestMap.put("oauth_timestamp", new String[] { oauth_timestamp });
        requestMap.put("oauth_nonce", new String[] { oauth_nonce });
        requestMap.put("oauth_signature_method", new String[] { oauth_signature_method });
        requestMap.put("oauth_token", new String[] { oauth_access_token });
        if (parameters != null && parameters.size() > 0) {
            requestMap.putAll(parameters);
        }
        if (oauth_callback != null && oauth_callback.length() > 0) {
            requestMap.put("oauth_callback", new String[] { oauth_callback });
        }
        if (oauth_verifier != null && oauth_verifier.length() > 0) {
            requestMap.put("oauth_verifier", new String[] { oauth_verifier });
        }
        String normalizedParamString = null;
        try {
            normalizedParamString = getNormalizedParamString(requestMap);
        }
        catch (DuplicateOauthException e) {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        String signatureBaseString = null;
        try {
            signatureBaseString = getSignatureBaseString(normalizedParamString, httpMethod, url, null);
        }
        catch (MalformedURLException e3) {
            e3.printStackTrace();
        }
        catch (UnsupportedURLSchemeException e4) {
            e4.printStackTrace();
        }
        catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
        }
        String signature = null;
        try {
            signature = getHMACSHA1Signature(signatureBaseString, oauth_consumer_secret, oauth_token_secret);
        }
        catch (UnsupportedEncodingException e6) {
            e6.printStackTrace();
        }
        requestMap.put("oauth_signature", new String[] { signature });
        final String authHeader = generateHeader(requestMap);
        return authHeader;
    }
    
    private static String generateHeader(final HashMap<String, String[]> requestMap) {
        String header = "OAuth realm=\"\"";
        for (final String key : requestMap.keySet()) {
            if (key.startsWith("oauth_")) {
                try {
                    header = header + "," + urlEncode(key) + "=\"" + urlEncode(requestMap.get(key)[0]) + "\"";
                }
                catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return header;
    }
    
    public static String urlEncode(final String s) throws UnsupportedEncodingException {
        String encodedString = null;
        if (s != null) {
            encodedString = URLEncoder.encode(s, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        }
        return encodedString;
    }
    
    public static String urlDecode(final String s) throws UnsupportedEncodingException {
        return URLDecoder.decode(s, "UTF-8");
    }
    
    static {
        OAuthSignatureUtils.HMAC_SHA1_ALGORITHM = "HmacSHA1";
        OAuthSignatureUtils.logger = Logger.getLogger((Class)OAuthSignatureUtils.class);
    }
}
