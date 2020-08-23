// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.client;

import com.etrade.etws.account.TransactionGroupingEnum;
import com.etrade.etws.account.TransactionTypeTrades;
import com.etrade.etws.account.TransactionTypeEnum;
import com.etrade.etws.account.TransactionUtils;
import com.etrade.etws.account.TransactionRequest;
import com.etrade.etws.account.TransactionValidator;
import com.etrade.etws.account.GetTransactionDetailsResponse;
import java.util.Iterator;
import java.text.DateFormat;
import java.util.Date;
import com.etrade.etws.account.Transaction;
import java.text.SimpleDateFormat;
import com.etrade.etws.account.GetTransactionHistoryResponse;
import com.etrade.etws.account.DeleteAlertResponse;
import com.etrade.etws.account.GetAlertDetailsResponse;
import com.etrade.etws.account.GetAlertsResponse;
import java.math.BigDecimal;
import org.apache.commons.lang.StringUtils;
import java.util.HashMap;
import com.etrade.etws.account.AccountPositionsResponse;
import com.etrade.etws.account.AccountPositionsRequest;
import com.etrade.etws.account.AccountBalanceResponse;
import com.etrade.etws.sdk.core.HttpApiResponse;
import com.etrade.etws.sdk.common.ETWSException;
import java.io.IOException;
import com.etrade.etws.sdk.converters.AccountMessageConverter;
import java.util.Map;
import com.etrade.etws.sdk.core.ConnectionUtils;
import com.etrade.etws.account.AccountListResponse;
import org.apache.log4j.Logger;

public class AccountsClient
{
    private Logger logger;
    ClientRequest request;
    
    public AccountsClient(final ClientRequest request) {
        this.logger = Logger.getLogger((Class)this.getClass());
        this.request = request;
    }
    
    public AccountListResponse getAccountList() throws IOException, ETWSException {
        AccountListResponse accountList = null;
        final String url = AccountsCommon.constructFullURL(null, "accountlist", this.request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)null, (String)null);
            final String is = response.getResponseString();
            this.logger.info((Object)("output is :" + is.toString()));
            accountList = AccountMessageConverter.convertToAccountList(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return accountList;
    }
    
    public AccountBalanceResponse getAccountBalance(final String accountId) throws IOException, ETWSException {
        AccountBalanceResponse balance = null;
        final String url = AccountsCommon.constructFullURL(accountId, "accountbalance", this.request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)null, (String)null);
            final String is = response.getResponseString();
            balance = AccountMessageConverter.convertToAccountBalance(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return balance;
    }
    
    public AccountPositionsResponse getAccountPositions(final String accountId, final AccountPositionsRequest acctRequest) throws IOException, ETWSException {
        AccountPositionsResponse positions = null;
        final String url = AccountsCommon.constructFullURL(accountId, "accountpositions", this.request);
        try {
            final Map<String, String[]> parameterMap = this.constructParameters(acctRequest);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)parameterMap, (String)null);
            final String is = response.getResponseString();
            positions = AccountMessageConverter.convertToAccountPositions(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return positions;
    }
    
    private Map<String, String[]> constructParameters(final AccountPositionsRequest acctRequest) {
        System.out.println("Calling construct Parameters");
        final Map<String, String[]> parameterMap = new HashMap<String, String[]>();
        if (acctRequest != null) {
            try {
                final String count = acctRequest.getCount();
                final String marker = acctRequest.getMarker();
                final String cp = acctRequest.getCallPut();
                final String day = acctRequest.getExpDay();
                final String month = acctRequest.getExpMonth();
                final String year = acctRequest.getExpYear();
                final BigDecimal strikePrice = acctRequest.getStrikePrice();
                final String symbol = acctRequest.getSymbol();
                final String typeCode = acctRequest.getTypeCode();
                System.out.println("Request Count is " + count);
                if (count != null && !count.isEmpty()) {
                    System.out.println("Count is " + count);
                    parameterMap.put("count", new String[] { "" + acctRequest.getCount() });
                }
                if (!StringUtils.isEmpty(marker)) {
                    parameterMap.put("marker", new String[] { acctRequest.getMarker() });
                }
                if (cp != null) {
                    parameterMap.put("callPut", new String[] { cp.toString() });
                }
                if (day != null && !day.isEmpty()) {
                    parameterMap.put("expDay", new String[] { new Integer(day).toString() });
                }
                if (month != null && !month.isEmpty()) {
                    parameterMap.put("expMonth", new String[] { new Integer(month).toString() });
                }
                if (year != null && !year.isEmpty()) {
                    parameterMap.put("expYear", new String[] { new Integer(year).toString() });
                }
                if (strikePrice != null) {
                    parameterMap.put("strikePrice", new String[] { strikePrice.toString() });
                }
                if (!StringUtils.isEmpty(symbol)) {
                    parameterMap.put("symbol", new String[] { symbol });
                }
                if (!StringUtils.isEmpty(typeCode)) {
                    parameterMap.put("typeCode", new String[] { typeCode });
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return parameterMap;
    }
    
    public GetAlertsResponse getAlerts() throws IOException, ETWSException {
        GetAlertsResponse alerts = null;
        final String url = AccountsCommon.constructFullURL(null, "alerts", this.request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)null, (String)null);
            final String is = response.getResponseString();
            alerts = AccountMessageConverter.convertToAlertsList(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return alerts;
    }
    
    public GetAlertDetailsResponse getAlertDetail(final long alertId) throws IOException, ETWSException {
        GetAlertDetailsResponse details = null;
        final String url = AccountsCommon.constructFullURL(new Long(alertId).toString(), "alerts", this.request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)null, (String)null);
            final String is = response.getResponseString();
            details = AccountMessageConverter.convertToAlertDetails(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return details;
    }
    
    public DeleteAlertResponse deleteAlert(final long alertId) throws IOException, ETWSException {
        DeleteAlertResponse delete = null;
        final String url = AccountsCommon.constructFullURL(new Long(alertId).toString(), "alerts", this.request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "DELETE", this.request, (Map)null, (String)null);
            final String is = response.getResponseString();
            delete = AccountMessageConverter.convertToDeleteAlert(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return delete;
    }
    
    private GetTransactionHistoryResponse getTransactionHistory(final String resourceUrl, final Map<String, String[]> paramMap) throws IOException, ETWSException {
        GetTransactionHistoryResponse history = null;
        final String url = AccountsCommon.constructFullURL(null, resourceUrl, this.request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)paramMap, (String)null);
            final String is = response.getResponseString();
            history = AccountMessageConverter.convertToHistoryList(is);
            final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            for (final Transaction transaction : history.getResponse()) {
                this.logger.info((Object)("Amount : " + transaction.getAmount()));
                final String transactionDate = dateFormat.format(new Date(transaction.getTransactionDate() * 1000L));
                this.logger.info((Object)("Transaction Date : " + transactionDate));
            }
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return history;
    }
    
    private GetTransactionDetailsResponse getTransactionDetails(final String resourceUrl) throws IOException, ETWSException {
        GetTransactionDetailsResponse transactionDetailsResponse = null;
        final String url = AccountsCommon.constructFullURL(null, resourceUrl, this.request);
        try {
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)null, (String)null);
            final String is = response.getResponseString();
            transactionDetailsResponse = AccountMessageConverter.convertToTransactionDetails(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return transactionDetailsResponse;
    }
    
    public GetTransactionHistoryResponse getAllTransactions(final long accountID) throws IOException, ETWSException {
        TransactionValidator.validateAccountID(accountID);
        return this.getTransactionsFor(accountID, null);
    }
    
    public GetTransactionHistoryResponse getAllTransactions(final long accountID, final TransactionRequest transactionRequest) throws IOException, ETWSException {
        TransactionValidator.validateTransactionRequest(transactionRequest);
        TransactionValidator.validateAccountID(accountID);
        return this.getTransactionsFor(accountID, transactionRequest);
    }
    
    private GetTransactionHistoryResponse getTransactionsFor(final long accountID, final TransactionRequest transactionRequest) throws IOException, ETWSException {
        final String resouceUrl = TransactionUtils.constructResourceUrl(accountID, null);
        final Map<String, String[]> paramMap = TransactionUtils.constructTransactionParamMap(transactionRequest);
        return this.getTransactionHistory(resouceUrl, paramMap);
    }
    
    public GetTransactionDetailsResponse getTransactionDetails(final long accountID, final long transactionId) throws IOException, ETWSException {
        TransactionValidator.validateAccountID(accountID);
        TransactionValidator.validateTransactionID(transactionId);
        final String resouceUrl = TransactionUtils.constructResourceUrl(accountID, transactionId);
        return this.getTransactionDetails(resouceUrl);
    }
    
    public GetTransactionHistoryResponse getTransactions(final long accountID, final TransactionTypeEnum transactionTypeEnum, final TransactionRequest transactionRequest) throws IOException, ETWSException {
        TransactionValidator.validateAccountID(accountID);
        TransactionValidator.validateTransactionType(transactionTypeEnum);
        final String transactionTypeSubUrl = TransactionUtils.constructTransactionTypeSubResourceUrl(transactionTypeEnum);
        final Map<String, String[]> paramMap = TransactionUtils.constructTransactionParamMap(transactionRequest);
        final String resouceUrl = TransactionUtils.constructResourceUrl(accountID, transactionTypeSubUrl);
        return this.getTransactionHistory(resouceUrl, paramMap);
    }
    
    public GetTransactionHistoryResponse getTrades(final long accountID, final TransactionTypeTrades transactionTypeTrades, final TransactionRequest transactionRequest) throws IOException, ETWSException {
        TransactionValidator.validateAccountID(accountID);
        TransactionValidator.validateTransactionTypeTrades(transactionTypeTrades);
        final String tradesResouceUrl = TransactionUtils.constructTradesSubResourceUrl(transactionTypeTrades);
        final String resouceUrl = TransactionUtils.constructResourceUrl(accountID, tradesResouceUrl);
        this.logger.info((Object)("resouceUrl : " + resouceUrl));
        final Map<String, String[]> paramMap = TransactionUtils.constructTransactionParamMap(transactionRequest);
        return this.getTransactionHistory(resouceUrl, paramMap);
    }
    
    public GetTransactionHistoryResponse getDeposits(final long accountID, final TransactionTypeEnum[] transactionTypeEnums, final TransactionRequest transactionRequest) throws IOException, ETWSException {
        return this.getDepositsOrWithdrawals(accountID, transactionTypeEnums, transactionRequest, TransactionGroupingEnum.DEPOSITS);
    }
    
    public GetTransactionHistoryResponse getWithdrawals(final long accountID, final TransactionTypeEnum[] transactionTypeEnums, final TransactionRequest transactionRequest) throws IOException, ETWSException {
        return this.getDepositsOrWithdrawals(accountID, transactionTypeEnums, transactionRequest, TransactionGroupingEnum.WITHDRAWALS);
    }
    
    private GetTransactionHistoryResponse getDepositsOrWithdrawals(final long accountID, final TransactionTypeEnum[] transactionTypeEnums, final TransactionRequest transactionRequest, final TransactionGroupingEnum transactionGroupingEnum) throws IOException, ETWSException {
        TransactionValidator.validateAccountID(accountID);
        final String depositResouceUrl = TransactionUtils.constructSubResource(transactionGroupingEnum, transactionTypeEnums);
        final String resouceUrl = TransactionUtils.constructResourceUrl(accountID, depositResouceUrl);
        final Map<String, String[]> paramMap = TransactionUtils.constructTransactionParamMap(transactionRequest);
        return this.getTransactionHistory(resouceUrl, paramMap);
    }
}
