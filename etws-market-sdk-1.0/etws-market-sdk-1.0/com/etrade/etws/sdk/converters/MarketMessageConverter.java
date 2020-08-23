// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.converters;

import com.etrade.etws.market.OptionExpireDateGetResponse;
import com.etrade.etws.market.ExpirationDate;
import com.etrade.etws.market.PairType;
import com.etrade.etws.market.PutOptionChain;
import com.etrade.etws.market.CallOptionChain;
import com.etrade.etws.market.OptionChainPair;
import com.etrade.etws.market.OptionChainResponse;
import com.etrade.etws.market.Product;
import com.etrade.etws.market.ProductLookupResponse;
import java.util.Collection;
import com.etrade.etws.market.Week52Quote;
import com.etrade.etws.market.FundamentalQuote;
import com.etrade.etws.market.OptionQuote;
import com.etrade.etws.market.AllQuote;
import com.etrade.etws.market.IntradayQuote;
import com.etrade.etws.market.QuoteData;
import java.util.ArrayList;
import com.etrade.etws.market.QuoteResponse;
import com.etrade.etws.market.MarketIndex;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.etrade.etws.market.MarketIndicesResponse;

public class MarketMessageConverter
{
    public static MarketIndicesResponse convertToMarketIndices(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("MarketIndicesResponse", (Class)MarketIndicesResponse.class);
        xstream.alias("MarketIndex", (Class)MarketIndex.class);
        xstream.addImplicitCollection((Class)MarketIndicesResponse.class, "marketIndicesList");
        final MarketIndicesResponse response = (MarketIndicesResponse)xstream.fromXML(is);
        return response;
    }
    
    public static QuoteResponse convertToQuote(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("QuoteResponse", (Class)ArrayList.class);
        xstream.alias("QuoteData", (Class)QuoteData.class);
        xstream.alias("QuoteData", (Class)QuoteData.class);
        xstream.alias("intraday", (Class)IntradayQuote.class);
        xstream.alias("all", (Class)AllQuote.class);
        xstream.alias("option", (Class)OptionQuote.class);
        xstream.alias("fundamental", (Class)FundamentalQuote.class);
        xstream.alias("week52", (Class)Week52Quote.class);
        xstream.addImplicitCollection((Class)QuoteResponse.class, "quoteData");
        final QuoteResponse response = new QuoteResponse();
        final ArrayList<QuoteData> list = (ArrayList<QuoteData>)xstream.fromXML(is);
        response.getQuoteData().addAll(list);
        return response;
    }
    
    public static ProductLookupResponse convertToProductlookup(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("ProductLookupResponse", (Class)ProductLookupResponse.class);
        xstream.alias("Product", (Class)Product.class);
        xstream.addImplicitCollection((Class)ProductLookupResponse.class, "productList");
        final ProductLookupResponse response = (ProductLookupResponse)xstream.fromXML(is);
        return response;
    }
    
    public static OptionChainResponse convertToOptionChain(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("OptionChainResponse", (Class)OptionChainResponse.class);
        xstream.addImplicitCollection((Class)OptionChainResponse.class, "optionPairs", (Class)OptionChainPair.class);
        xstream.addImplicitCollection((Class)OptionChainPair.class, "call", (Class)CallOptionChain.class);
        xstream.addImplicitCollection((Class)OptionChainPair.class, "put", (Class)PutOptionChain.class);
        xstream.alias("PairType", (Class)PairType.class);
        xstream.alias("expireDate", (Class)ExpirationDate.class);
        final OptionChainResponse response = (OptionChainResponse)xstream.fromXML(is);
        return response;
    }
    
    public static OptionExpireDateGetResponse convertToExpireDateGet(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("OptionExpireDateGetResponse", (Class)OptionExpireDateGetResponse.class);
        xstream.alias("ExpirationDate", (Class)ExpirationDate.class);
        xstream.addImplicitCollection((Class)OptionExpireDateGetResponse.class, "expireDates");
        final OptionExpireDateGetResponse response = (OptionExpireDateGetResponse)xstream.fromXML(is);
        return response;
    }
}
