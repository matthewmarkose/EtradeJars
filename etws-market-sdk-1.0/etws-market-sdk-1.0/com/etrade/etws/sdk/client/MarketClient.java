// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.client;

import java.util.Iterator;
import com.etrade.etws.market.QuoteResponse;
import com.etrade.etws.market.DetailFlag;
import java.util.ArrayList;
import com.etrade.etws.market.ProductLookupResponse;
import com.etrade.etws.market.ProductLookupRequest;
import com.etrade.etws.market.OptionExpireDateGetResponse;
import com.etrade.etws.market.OptionExpireDateGetRequest;
import com.etrade.etws.market.OptionChainResponse;
import com.etrade.etws.market.OptionChainRequest;
import com.etrade.etws.sdk.core.HttpApiResponse;
import com.etrade.etws.sdk.common.ETWSException;
import java.io.IOException;
import com.etrade.etws.sdk.converters.MarketMessageConverter;
import java.util.Map;
import com.etrade.etws.sdk.core.ConnectionUtils;
import org.apache.commons.lang.StringUtils;
import java.util.HashMap;
import com.etrade.etws.market.MarketIndicesResponse;
import com.etrade.etws.market.MarketIndicesRequest;

public class MarketClient
{
    ClientRequest request;
    
    public MarketClient(final ClientRequest request) {
        this.request = request;
    }
    
    public MarketIndicesResponse getMarketIndicies(final MarketIndicesRequest marketIndicesRequest) throws IOException, ETWSException {
        MarketIndicesResponse marketIndices = null;
        final String url = MarketCommon.constructFullURL(null, "marketindices", this.request);
        try {
            final Map<String, String[]> parameterMap = new HashMap<String, String[]>();
            final String indexSymbol = marketIndicesRequest.getIndexSymbol();
            if (!StringUtils.isEmpty(indexSymbol)) {
                parameterMap.put("indexSymbol", new String[] { indexSymbol });
            }
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)parameterMap, (String)null);
            final String is = response.getResponseString();
            marketIndices = MarketMessageConverter.convertToMarketIndices(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return marketIndices;
    }
    
    public OptionChainResponse getOptionChain(final OptionChainRequest optionChainRequest) throws IOException, ETWSException {
        OptionChainResponse optionChainResponse = null;
        final String url = MarketCommon.constructFullURL(null, "optionchains", this.request);
        try {
            final Map<String, String[]> parameterMap = new HashMap<String, String[]>();
            final String underlier = optionChainRequest.getUnderlier();
            final String chainType = optionChainRequest.getChainType();
            final String month = optionChainRequest.getExpirationMonth();
            final String year = optionChainRequest.getExpirationYear();
            final String skipAdjusted = optionChainRequest.getSkipAdjusted();
            if (!StringUtils.isEmpty(underlier)) {
                parameterMap.put("underlier", new String[] { underlier });
            }
            if (chainType != null) {
                parameterMap.put("chainType", new String[] { chainType });
            }
            if (month != null) {
                parameterMap.put("expirationMonth", new String[] { month });
            }
            if (year != null) {
                parameterMap.put("expirationYear", new String[] { year });
            }
            if (skipAdjusted != null) {
                parameterMap.put("skipAdjusted", new String[] { skipAdjusted.toString() });
            }
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)parameterMap, (String)null);
            final String is = response.getResponseString();
            optionChainResponse = MarketMessageConverter.convertToOptionChain(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return optionChainResponse;
    }
    
    public OptionExpireDateGetResponse getExpiryDates(final OptionExpireDateGetRequest expireDateGetRequest) throws IOException, ETWSException {
        OptionExpireDateGetResponse expireDateGetResponse = null;
        final String url = MarketCommon.constructFullURL(null, "optionexpiredate", this.request);
        try {
            final Map<String, String[]> parameterMap = new HashMap<String, String[]>();
            final String underlier = expireDateGetRequest.getUnderlier();
            if (!StringUtils.isEmpty(underlier)) {
                parameterMap.put("underlier", new String[] { underlier });
            }
            final String expiryType = expireDateGetRequest.getExpiryType();
            if (!StringUtils.isEmpty(expiryType)) {
                parameterMap.put("expiryType", new String[] { expiryType });
            }
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)parameterMap, (String)null);
            final String is = response.getResponseString();
            expireDateGetResponse = MarketMessageConverter.convertToExpireDateGet(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return expireDateGetResponse;
    }
    
    public ProductLookupResponse productLookup(final ProductLookupRequest productLookupRequest) throws IOException, ETWSException {
        ProductLookupResponse productLookupResponse = null;
        final String url = MarketCommon.constructFullURL(null, "productlookup", this.request);
        try {
            final Map<String, String[]> parameterMap = new HashMap<String, String[]>();
            final String company = productLookupRequest.getCompany();
            final String type = productLookupRequest.getType();
            if (!StringUtils.isEmpty(company)) {
                parameterMap.put("company", new String[] { company });
            }
            if (type != null) {
                parameterMap.put("type", new String[] { type });
            }
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)parameterMap, (String)null);
            final String is = response.getResponseString();
            productLookupResponse = MarketMessageConverter.convertToProductlookup(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return productLookupResponse;
    }
    
    public QuoteResponse getQuote(final ArrayList<String> symbolList, final boolean afterhourFlag, final DetailFlag detailFlag) throws IOException, ETWSException {
        QuoteResponse quoteResponse = null;
        String symbol = "";
        try {
            final Map<String, String[]> parameterMap = new HashMap<String, String[]>();
            parameterMap.put("afterHourFlag", new String[] { new Boolean(afterhourFlag).toString() });
            parameterMap.put("detailFlag", new String[] { detailFlag.toString() });
            final Iterator<String> i = symbolList.iterator();
            while (i.hasNext()) {
                symbol = symbol + i.next() + ",";
            }
            final String url = MarketCommon.constructFullURL(symbol.substring(0, symbol.length() - 1), "quote", this.request);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)parameterMap, (String)null);
            final String is = response.getResponseString();
            quoteResponse = MarketMessageConverter.convertToQuote(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return quoteResponse;
    }
}
