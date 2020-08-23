// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.jws.WebService;

@WebService(targetNamespace = "http://market.etws.etrade.com", name = "MarketSvc")
@XmlSeeAlso({ ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MarketSvc
{
    @WebResult(name = "MarketIndicesResponse", targetNamespace = "http://market.etws.etrade.com", partName = "getMarketIndicesResponse")
    @WebMethod(operationName = "GetMarketIndices")
    MarketIndicesResponse getMarketIndices(@WebParam(partName = "MarketIndicesRequest", name = "MarketIndicesRequest", targetNamespace = "http://market.etws.etrade.com") final MarketIndicesRequest p0, @WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://market.etws.etrade.com", header = true) final String p1) throws ETWSException_Exception;
    
    @WebResult(name = "quoteResponse", targetNamespace = "http://market.etws.etrade.com", partName = "quoteResponse")
    @WebMethod(operationName = "GetQuotes")
    QuoteResponse getQuotes(@WebParam(partName = "QuoteRequest", name = "QuoteRequest", targetNamespace = "http://market.etws.etrade.com") final QuoteRequest p0, @WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://market.etws.etrade.com", header = true) final String p1) throws ETWSException_Exception;
    
    @WebResult(name = "optionExpireDateGetResponse", targetNamespace = "http://market.etws.etrade.com", partName = "optionExpireDateGetResponse")
    @WebMethod(operationName = "GetOptionExpireDates")
    OptionExpireDateGetResponse getOptionExpireDates(@WebParam(partName = "OptionExpireDateGetRequest", name = "OptionExpireDateGetRequest", targetNamespace = "http://market.etws.etrade.com") final OptionExpireDateGetRequest p0, @WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://market.etws.etrade.com", header = true) final String p1) throws ETWSException_Exception;
    
    @WebResult(name = "optionChainResponse", targetNamespace = "http://market.etws.etrade.com", partName = "optionChainResponse")
    @WebMethod(operationName = "GetOptionChains")
    OptionChainResponse getOptionChains(@WebParam(partName = "OptionChainRequest", name = "OptionChainRequest", targetNamespace = "http://market.etws.etrade.com") final OptionChainRequest p0, @WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://market.etws.etrade.com", header = true) final String p1) throws ETWSException_Exception;
    
    @WebResult(name = "productLookupResponse", targetNamespace = "http://market.etws.etrade.com", partName = "productLookupResponse")
    @WebMethod(operationName = "GetProducts")
    ProductLookupResponse getProducts(@WebParam(partName = "ProductLookupRequest", name = "ProductLookupRequest", targetNamespace = "http://market.etws.etrade.com") final ProductLookupRequest p0, @WebParam(partName = "reqId", name = "reqId", targetNamespace = "http://market.etws.etrade.com", header = true) final String p1) throws ETWSException_Exception;
}
