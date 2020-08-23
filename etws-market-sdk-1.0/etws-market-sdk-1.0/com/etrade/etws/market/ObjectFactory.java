// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ObjectFactory
{
    private static final QName _ETWSException_QNAME;
    private static final QName _ReqId_QNAME;
    
    public OptionQuote createOptionQuote() {
        return new OptionQuote();
    }
    
    public ExpirationDate createExpirationDate() {
        return new ExpirationDate();
    }
    
    public SymbolList createSymbolList() {
        return new SymbolList();
    }
    
    public Product createProduct() {
        return new Product();
    }
    
    public MarketIndicesResponse createMarketIndicesResponse() {
        return new MarketIndicesResponse();
    }
    
    public QuoteData createQuoteData() {
        return new QuoteData();
    }
    
    public ProductLookupRequest createProductLookupRequest() {
        return new ProductLookupRequest();
    }
    
    public ETWSException createETWSException() {
        return new ETWSException();
    }
    
    public OptionExpireDateGetRequest createOptionExpireDateGetRequest() {
        return new OptionExpireDateGetRequest();
    }
    
    public OptionChainRequest createOptionChainRequest() {
        return new OptionChainRequest();
    }
    
    public DetailProduct createDetailProduct() {
        return new DetailProduct();
    }
    
    public QuoteResponse createQuoteResponse() {
        return new QuoteResponse();
    }
    
    public Week52Quote createWeek52Quote() {
        return new Week52Quote();
    }
    
    public OptionChainResponse createOptionChainResponse() {
        return new OptionChainResponse();
    }
    
    public OptionChainPair createOptionChainPair() {
        return new OptionChainPair();
    }
    
    public MarketIndicesRequest createMarketIndicesRequest() {
        return new MarketIndicesRequest();
    }
    
    public IntradayQuote createIntradayQuote() {
        return new IntradayQuote();
    }
    
    public FundamentalQuote createFundamentalQuote() {
        return new FundamentalQuote();
    }
    
    public MarketIndex createMarketIndex() {
        return new MarketIndex();
    }
    
    public CallOptionChain createCallOptionChain() {
        return new CallOptionChain();
    }
    
    public QuoteRequest createQuoteRequest() {
        return new QuoteRequest();
    }
    
    public PutOptionChain createPutOptionChain() {
        return new PutOptionChain();
    }
    
    public ProductId createProductId() {
        return new ProductId();
    }
    
    public AllQuote createAllQuote() {
        return new AllQuote();
    }
    
    public ProductLookupResponse createProductLookupResponse() {
        return new ProductLookupResponse();
    }
    
    public OptionExpireDateGetResponse createOptionExpireDateGetResponse() {
        return new OptionExpireDateGetResponse();
    }
    
    public JAXBElement<ETWSException> createETWSException(final ETWSException value) {
        return (JAXBElement<ETWSException>)new JAXBElement(ObjectFactory._ETWSException_QNAME, (Class)ETWSException.class, (Class)null, (Object)value);
    }
    
    public JAXBElement<String> createReqId(final String value) {
        return (JAXBElement<String>)new JAXBElement(ObjectFactory._ReqId_QNAME, (Class)String.class, (Class)null, (Object)value);
    }
    
    static {
        _ETWSException_QNAME = new QName("http://market.etws.etrade.com", "ETWSException");
        _ReqId_QNAME = new QName("http://market.etws.etrade.com", "reqId");
    }
}
