// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import javax.xml.bind.JAXBElement;
import java.math.BigInteger;
import javax.xml.namespace.QName;

public class ObjectFactory
{
    private static final QName _AlertId_QNAME;
    private static final QName _GetAlerts_QNAME;
    private static final QName _AccountId_QNAME;
    private static final QName _AccountList_QNAME;
    private static final QName _ReqId_QNAME;
    private static final QName _ETWSException_QNAME;
    
    public DeleteAlertResponse createDeleteAlertResponse() {
        return new DeleteAlertResponse();
    }
    
    public AccountStatus createAccountStatus() {
        return new AccountStatus();
    }
    
    public Alert createAlert() {
        return new Alert();
    }
    
    public AccountIdList createAccountIdList() {
        return new AccountIdList();
    }
    
    public Account createAccount() {
        return new Account();
    }
    
    public ProductId createProductId() {
        return new ProductId();
    }
    
    public GetAlerts createGetAlerts() {
        return new GetAlerts();
    }
    
    public AccountPosition createAccountPosition() {
        return new AccountPosition();
    }
    
    public AccountBalanceResponse createAccountBalanceResponse() {
        return new AccountBalanceResponse();
    }
    
    public AccountPositionsRequest createAccountPositionsRequest() {
        return new AccountPositionsRequest();
    }
    
    public AccountDTBalance createAccountDTBalance() {
        return new AccountDTBalance();
    }
    
    public AccountPositionsResponse createAccountPositionsResponse() {
        return new AccountPositionsResponse();
    }
    
    public AccountListResponse createAccountListResponse() {
        return new AccountListResponse();
    }
    
    public GetAlertDetailsResponse createGetAlertDetailsResponse() {
        return new GetAlertDetailsResponse();
    }
    
    public MarginAccountBalance createMarginAccountBalance() {
        return new MarginAccountBalance();
    }
    
    public CashAccountBalance createCashAccountBalance() {
        return new CashAccountBalance();
    }
    
    public ETWSException createETWSException() {
        return new ETWSException();
    }
    
    public GetAlertsResponse createGetAlertsResponse() {
        return new GetAlertsResponse();
    }
    
    public Balance createBalance() {
        return new Balance();
    }
    
    public AccountList createAccountList() {
        return new AccountList();
    }
    
    public JAXBElement<BigInteger> createAlertId(final BigInteger value) {
        return (JAXBElement<BigInteger>)new JAXBElement(ObjectFactory._AlertId_QNAME, (Class)BigInteger.class, (Class)null, (Object)value);
    }
    
    public JAXBElement<GetAlerts> createGetAlerts(final GetAlerts value) {
        return (JAXBElement<GetAlerts>)new JAXBElement(ObjectFactory._GetAlerts_QNAME, (Class)GetAlerts.class, (Class)null, (Object)value);
    }
    
    public JAXBElement<String> createAccountId(final String value) {
        return (JAXBElement<String>)new JAXBElement(ObjectFactory._AccountId_QNAME, (Class)String.class, (Class)null, (Object)value);
    }
    
    public JAXBElement<AccountList> createAccountList(final AccountList value) {
        return (JAXBElement<AccountList>)new JAXBElement(ObjectFactory._AccountList_QNAME, (Class)AccountList.class, (Class)null, (Object)value);
    }
    
    public JAXBElement<String> createReqId(final String value) {
        return (JAXBElement<String>)new JAXBElement(ObjectFactory._ReqId_QNAME, (Class)String.class, (Class)null, (Object)value);
    }
    
    public JAXBElement<ETWSException> createETWSException(final ETWSException value) {
        return (JAXBElement<ETWSException>)new JAXBElement(ObjectFactory._ETWSException_QNAME, (Class)ETWSException.class, (Class)null, (Object)value);
    }
    
    static {
        _AlertId_QNAME = new QName("http://account.etws.etrade.com", "alertId");
        _GetAlerts_QNAME = new QName("http://account.etws.etrade.com", "getAlerts");
        _AccountId_QNAME = new QName("http://account.etws.etrade.com", "accountId");
        _AccountList_QNAME = new QName("http://account.etws.etrade.com", "accountList");
        _ReqId_QNAME = new QName("http://account.etws.etrade.com", "reqId");
        _ETWSException_QNAME = new QName("http://account.etws.etrade.com", "ETWSException");
    }
}
