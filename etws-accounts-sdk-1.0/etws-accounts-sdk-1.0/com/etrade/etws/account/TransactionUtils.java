// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

public class TransactionUtils
{
    public static final String TRANSACTIONS = "transactions";
    public static final String DATE_FORMAT = "MM/dd/yyyy";
    
    public static String constructResourceUrl(final long accountID, final String resourceSubUrl) {
        final StringBuilder resourceUrl = new StringBuilder(128);
        resourceUrl.append(accountID).append('/').append("transactions");
        if (StringUtils.isNotEmpty(resourceSubUrl)) {
            resourceUrl.append('/').append(resourceSubUrl);
        }
        return resourceUrl.toString();
    }
    
    public static String constructResourceUrl(final long accountID, final long transactionId) {
        final StringBuilder resourceUrl = new StringBuilder(128);
        resourceUrl.append(accountID).append('/').append("transactions");
        resourceUrl.append('/').append(transactionId);
        return resourceUrl.toString();
    }
    
    public static Map<String, String[]> constructTransactionParamMap(final TransactionRequest transactionRequest) {
        final Map<String, String[]> paramMap = new HashMap<String, String[]>(4);
        if (null == transactionRequest) {
            return paramMap;
        }
        if (transactionRequest.getCount() != 0) {
            paramMap.put(TransactionRequestEnum.COUNT.getName(), new String[] { String.valueOf(transactionRequest.getCount()) });
        }
        if (transactionRequest.getMarker() != 0) {
            paramMap.put(TransactionRequestEnum.MARKER.getName(), new String[] { String.valueOf(transactionRequest.getMarker()) });
        }
        if (null != transactionRequest.getStartDate()) {
            paramMap.put(TransactionRequestEnum.START_DATE.getName(), new String[] { String.valueOf(transactionRequest.getStartDate()) });
        }
        if (null != transactionRequest.getEndDate()) {
            paramMap.put(TransactionRequestEnum.END_DATE.getName(), new String[] { String.valueOf(transactionRequest.getEndDate()) });
        }
        return paramMap;
    }
    
    public static String constructTransactionTypeSubResourceUrl(final TransactionTypeEnum transactionTypeEnum) {
        return transactionTypeEnum.getName();
    }
    
    public static String constructTradesSubResourceUrl(final TransactionTypeTrades transactionTypeTrades) {
        final StringBuilder resourceUrl = new StringBuilder(transactionTypeTrades.getGroupingName());
        final SecurityTypeEnum securityTypeEnum = transactionTypeTrades.getSecurityTypeEnum();
        if (null != securityTypeEnum) {
            resourceUrl.append('/').append(securityTypeEnum.getName());
        }
        if (null != securityTypeEnum && StringUtils.isNotEmpty(transactionTypeTrades.getSymbol())) {
            resourceUrl.append('/').append(transactionTypeTrades.getSymbol());
        }
        if (StringUtils.isNotEmpty(transactionTypeTrades.getTransactionNameString())) {
            resourceUrl.append('/').append(transactionTypeTrades.getTransactionNameString());
        }
        return resourceUrl.toString();
    }
    
    public static String constructSubResource(final TransactionGroupingEnum transactionGroupingEnum, final TransactionTypeEnum[] transactionTypeEnums) {
        if (null == transactionGroupingEnum) {
            throw new NullPointerException("transactionGroupingEnum is null");
        }
        final StringBuilder resourceUrl = new StringBuilder(transactionGroupingEnum.getName());
        if (null == transactionTypeEnums || transactionTypeEnums.length == 0) {
            return resourceUrl.toString();
        }
        resourceUrl.append('/');
        for (final TransactionTypeEnum transactionTypeEnum : transactionTypeEnums) {
            resourceUrl.append(transactionTypeEnum.getName()).append(',');
        }
        return resourceUrl.deleteCharAt(resourceUrl.length() - 1).toString();
    }
    
    private static String getResponseString(final InputStream is) throws IOException {
        final StringBuilder sb = new StringBuilder();
        if (is != null) {
            try {
                final BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
            }
            finally {}
        }
        return sb.toString();
    }
}
