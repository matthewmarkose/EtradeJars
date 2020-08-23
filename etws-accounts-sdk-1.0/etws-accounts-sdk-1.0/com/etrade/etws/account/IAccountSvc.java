// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.account;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import java.math.BigInteger;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.jws.WebService;

@WebService(targetNamespace = "http://account.etws.etrade.com", name = "IAccountSvc")
@XmlSeeAlso({ ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IAccountSvc
{
    @WebResult(name = "deleteAlertResponse", targetNamespace = "http://account.etws.etrade.com", partName = "deleteAlertResponse")
    @WebMethod(operationName = "DeleteAlert", action = "DeleteAlert")
    DeleteAlertResponse deleteAlert(@WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://account.etws.etrade.com", header = true) final String p0, @WebParam(partName = "alertId", name = "alertId", targetNamespace = "http://account.etws.etrade.com") final BigInteger p1) throws ETWSException_Exception;
    
    @WebResult(name = "getAlertDetailsResponse", targetNamespace = "http://account.etws.etrade.com", partName = "getAlertDetailsResponse")
    @WebMethod(operationName = "GetAlertDetails", action = "GetAlertDetails")
    GetAlertDetailsResponse getAlertDetails(@WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://account.etws.etrade.com", header = true) final String p0, @WebParam(partName = "alertId", name = "alertId", targetNamespace = "http://account.etws.etrade.com") final BigInteger p1) throws ETWSException_Exception;
    
    @WebResult(name = "accountBalanceResponse", targetNamespace = "http://account.etws.etrade.com", partName = "accountBalanceResponse")
    @WebMethod(operationName = "GetAccountBalance", action = "GetAccountBalance")
    AccountBalanceResponse getAccountBalance(@WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://account.etws.etrade.com", header = true) final String p0, @WebParam(partName = "accountId", name = "accountId", targetNamespace = "http://account.etws.etrade.com") final String p1) throws ETWSException_Exception;
    
    @WebResult(name = "getAlertsResponse", targetNamespace = "http://account.etws.etrade.com", partName = "parameters")
    @WebMethod(operationName = "GetAlerts")
    GetAlertsResponse getAlerts(@WebParam(partName = "parameters", name = "getAlerts", targetNamespace = "http://account.etws.etrade.com") final GetAlerts p0, @WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://account.etws.etrade.com", header = true) final String p1) throws ETWSException_Exception;
    
    @WebResult(name = "accountListResponse", targetNamespace = "http://account.etws.etrade.com", partName = "accountListResponse")
    @WebMethod(operationName = "GetAccountList", action = "GetAccountList")
    AccountListResponse getAccountList(@WebParam(partName = "parameters", name = "accountList", targetNamespace = "http://account.etws.etrade.com") final AccountList p0, @WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://account.etws.etrade.com", header = true) final String p1) throws ETWSException_Exception;
    
    @WebResult(name = "accountPositionsResponse", targetNamespace = "http://account.etws.etrade.com", partName = "accountPositionsResponse")
    @WebMethod(operationName = "GetAccountPositions", action = "GetAccountPositions")
    AccountPositionsResponse getAccountPositions(@WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://account.etws.etrade.com", header = true) final String p0, @WebParam(partName = "accountPositionsRequest", name = "accountPositionsRequest", targetNamespace = "http://account.etws.etrade.com") final AccountPositionsRequest p1) throws ETWSException_Exception;
}
