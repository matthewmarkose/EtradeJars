// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

public final class TransactionTypeTrades
{
    private SecurityTypeEnum securityTypeEnum;
    private String symbol;
    private TransactionGroupingEnum transactionGroupingEnum;
    private TradesTransactionType[] tradesTransactionTypes;
    
    public TransactionTypeTrades() {
        this.transactionGroupingEnum = TransactionGroupingEnum.TRADES;
    }
    
    public TransactionTypeTrades(final SecurityTypeEnum securityTypeEnum) {
        this.transactionGroupingEnum = TransactionGroupingEnum.TRADES;
        this.securityTypeEnum = securityTypeEnum;
    }
    
    public TransactionTypeTrades(final SecurityTypeEnum securityTypeEnum, final String symbol) {
        this.transactionGroupingEnum = TransactionGroupingEnum.TRADES;
        this.securityTypeEnum = securityTypeEnum;
        this.symbol = symbol;
    }
    
    public TransactionTypeTrades(final TradesTransactionType... tradesTransactionTypes) {
        this.transactionGroupingEnum = TransactionGroupingEnum.TRADES;
        this.tradesTransactionTypes = tradesTransactionTypes;
    }
    
    public SecurityTypeEnum getSecurityTypeEnum() {
        return this.securityTypeEnum;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public String getGroupingName() {
        return this.transactionGroupingEnum.getName();
    }
    
    public String getTransactionNameString() {
        String transactionsNameString = null;
        if (null != this.tradesTransactionTypes) {
            final StringBuilder transactionTypeNames = new StringBuilder(32);
            for (final TradesTransactionType type : this.tradesTransactionTypes) {
                transactionTypeNames.append(type.getName()).append(',');
            }
            transactionsNameString = transactionTypeNames.deleteCharAt(transactionTypeNames.length() - 1).toString();
        }
        return transactionsNameString;
    }
    
    public enum TradesTransactionType
    {
        ASSIGNMENT("ASSIGNMENT"), 
        EXERCISE("EXERCISE"), 
        EXPIRATION("EXPIRATION");
        
        private String name;
        
        private TradesTransactionType(final String name) {
            this.name = name;
        }
        
        public String getName() {
            return this.name;
        }
    }
}
