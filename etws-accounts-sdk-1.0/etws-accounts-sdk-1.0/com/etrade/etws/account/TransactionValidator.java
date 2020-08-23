// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import com.etrade.etws.sdk.common.ETWSException;

public class TransactionValidator
{
    public static void validateAccountID(final long accountID) throws ETWSException {
        if (accountID < 1L) {
            throw new ETWSException("invalid accountID");
        }
    }
    
    public static void validateTransactionID(final long transactionID) throws ETWSException {
        if (transactionID < 1L) {
            throw new ETWSException("invalid transactionID");
        }
    }
    
    public static void validateTransactionType(final TransactionTypeEnum transactionTypeEnum) throws ETWSException {
        if (null == transactionTypeEnum) {
            throw new ETWSException("transactionTypeEnum is null");
        }
    }
    
    public static void validateTransactionTypeTrades(final TransactionTypeTrades transactionTypeTrades) throws ETWSException {
        if (null == transactionTypeTrades) {
            throw new ETWSException("TransactionTypeTrades is null");
        }
    }
    
    public static void validateTransactionRequest(final TransactionRequest transactionRequest) throws ETWSException {
        if (null == transactionRequest) {
            throw new ETWSException("transactionRequest is null");
        }
    }
}
