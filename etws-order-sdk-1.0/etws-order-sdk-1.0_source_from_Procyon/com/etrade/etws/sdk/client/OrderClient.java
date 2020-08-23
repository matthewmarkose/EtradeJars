// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.client;

import com.etrade.etws.order.CancelOrderResponse;
import com.etrade.etws.order.CancelOrder;
import com.etrade.etws.order.PlaceChangeOptionOrderResponse;
import com.etrade.etws.order.PlaceChangeOptionOrder;
import com.etrade.etws.order.PreviewChangeOptionOrderResponse;
import com.etrade.etws.order.PreviewChangeOptionOrder;
import com.etrade.etws.order.PlaceChangeEquityOrderResponse;
import com.etrade.etws.order.PlaceChangeEquityOrder;
import com.etrade.etws.order.PreviewChangeEquityOrderResponse;
import com.etrade.etws.order.PreviewChangeEquityOrder;
import com.etrade.etws.order.PreviewOptionOrderResponse;
import com.etrade.etws.order.PreviewOptionOrder;
import com.etrade.etws.order.PreviewEquityOrderResponse;
import com.etrade.etws.order.PreviewEquityOrder;
import com.etrade.etws.order.PlaceOptionOrderResponse;
import com.etrade.etws.order.PlaceOptionOrder;
import com.etrade.etws.order.PlaceEquityOrderResponse;
import com.etrade.etws.order.PlaceEquityOrder;
import com.etrade.etws.sdk.core.HttpApiResponse;
import com.etrade.etws.sdk.common.ETWSException;
import java.io.IOException;
import com.etrade.etws.sdk.converters.OrderMessageConverter;
import java.util.Map;
import com.etrade.etws.sdk.core.ConnectionUtils;
import org.apache.commons.lang.StringUtils;
import java.util.HashMap;
import com.etrade.etws.order.GetOrderListResponse;
import com.etrade.etws.order.OrderListRequest;
import org.apache.log4j.Logger;

public class OrderClient
{
    private Logger logger;
    ClientRequest request;
    
    public OrderClient(final ClientRequest request) {
        this.logger = Logger.getLogger((Class)this.getClass());
        this.request = request;
    }
    
    public GetOrderListResponse getOrderList(final OrderListRequest orderListequest) throws IOException, ETWSException {
        GetOrderListResponse orderList = null;
        final String url = OrderCommon.constructFullURL(orderListequest.getAccountId(), "orderlist", this.request);
        try {
            final Map<String, String[]> parameterMap = new HashMap<String, String[]>();
            final String beginMarker = orderListequest.getMarker();
            if (!StringUtils.isEmpty(beginMarker)) {
                parameterMap.put("marker", new String[] { beginMarker });
            }
            final String cnt = orderListequest.getCount();
            int count = 0;
            if (cnt != null && !cnt.isEmpty()) {
                count = Integer.parseInt(cnt);
            }
            if (count > 0) {
                parameterMap.put("count", new String[] { new Integer(count).toString() });
            }
            final String endMarker = beginMarker + count;
            if (!StringUtils.isEmpty(endMarker)) {
                parameterMap.put("endMarker", new String[] { endMarker });
            }
            final HttpApiResponse response = ConnectionUtils.invoke(url, "GET", this.request, (Map)parameterMap, (String)null);
            final String is = response.getResponseString();
            orderList = OrderMessageConverter.convertToOrderList(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return orderList;
    }
    
    public PlaceEquityOrderResponse placeEquityOrder(final PlaceEquityOrder equityOrderRequest) throws IOException, ETWSException {
        PlaceEquityOrderResponse equityOrderResponse = null;
        final String url = OrderCommon.constructFullURL(null, "placeequityorder", this.request);
        try {
            final String requestBody = OrderMessageConverter.convertPlaceEquityOrderToXML(equityOrderRequest);
            System.out.println(requestBody);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", this.request, (Map)null, requestBody);
            final String is = response.getResponseString();
            equityOrderResponse = OrderMessageConverter.convertToPlaceEquityOrderResponse(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return equityOrderResponse;
    }
    
    public PlaceOptionOrderResponse placeOptionOrder(final PlaceOptionOrder optionOrderRequest) throws IOException, ETWSException {
        PlaceOptionOrderResponse optionOrderResponse = null;
        final String url = OrderCommon.constructFullURL(null, "placeoptionorder", this.request);
        try {
            final String requestBody = OrderMessageConverter.convertPlaceOptionOrderToXML(optionOrderRequest);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", this.request, (Map)null, requestBody);
            final String is = response.getResponseString();
            optionOrderResponse = OrderMessageConverter.convertToPlaceOptionOrderResponse(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return optionOrderResponse;
    }
    
    public PreviewEquityOrderResponse previewEquityOrder(final PreviewEquityOrder equityOrderRequest) throws IOException, ETWSException {
        PreviewEquityOrderResponse equityOrderResponse = null;
        final String url = OrderCommon.constructFullURL(null, "previewequityorder", this.request);
        try {
            final String requestBody = OrderMessageConverter.convertPreviewEquityOrderToXML(equityOrderRequest);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", this.request, (Map)null, requestBody);
            final String is = response.getResponseString();
            equityOrderResponse = OrderMessageConverter.convertToPreviewEquityOrderResponse(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return equityOrderResponse;
    }
    
    public PreviewOptionOrderResponse previewOptionOrder(final PreviewOptionOrder optionOrderRequest) throws IOException, ETWSException {
        PreviewOptionOrderResponse optionOrderResponse = null;
        final String url = OrderCommon.constructFullURL(null, "previewoptionorder", this.request);
        try {
            final String requestBody = OrderMessageConverter.convertPreviewOptionOrderToXML(optionOrderRequest);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", this.request, (Map)null, requestBody);
            final String is = response.getResponseString();
            optionOrderResponse = OrderMessageConverter.convertToPreviewOptionOrderResponse(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return optionOrderResponse;
    }
    
    public PreviewChangeEquityOrderResponse previewChangeEquityOrder(final PreviewChangeEquityOrder equityOrderRequest) throws IOException, ETWSException {
        PreviewChangeEquityOrderResponse equityOrderResponse = null;
        final String url = OrderCommon.constructFullURL(null, "previewchangeequityorder", this.request);
        try {
            final String requestBody = OrderMessageConverter.convertPreviewChangeEquityOrderToXML(equityOrderRequest);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", this.request, (Map)null, requestBody);
            final String is = response.getResponseString();
            equityOrderResponse = OrderMessageConverter.convertToPreviewChangeEquityOrder(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return equityOrderResponse;
    }
    
    public PlaceChangeEquityOrderResponse placeChangeEquityOrder(final PlaceChangeEquityOrder equityOrderRequest) throws IOException, ETWSException {
        PlaceChangeEquityOrderResponse equityOrderResponse = null;
        final String url = OrderCommon.constructFullURL(null, "placechangeequityorder", this.request);
        try {
            final String requestBody = OrderMessageConverter.convertPlaceChangeEquityOrderToXML(equityOrderRequest);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", this.request, (Map)null, requestBody);
            final String is = response.getResponseString();
            equityOrderResponse = OrderMessageConverter.convertToPlaceChangeEquityOrder(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return equityOrderResponse;
    }
    
    public PreviewChangeOptionOrderResponse previewChangeOptionOrder(final PreviewChangeOptionOrder optionOrderRequest) throws IOException, ETWSException {
        PreviewChangeOptionOrderResponse optionOrderResponse = null;
        final String url = OrderCommon.constructFullURL(null, "previewchangeoptionorder", this.request);
        try {
            final String requestBody = OrderMessageConverter.convertPreviewChangeOptionOrderToXML(optionOrderRequest);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", this.request, (Map)null, requestBody);
            final String is = response.getResponseString();
            optionOrderResponse = OrderMessageConverter.convertToPreviewChangeOptionOrder(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return optionOrderResponse;
    }
    
    public PlaceChangeOptionOrderResponse placeChangeOptionOrder(final PlaceChangeOptionOrder optionOrderRequest) throws IOException, ETWSException {
        PlaceChangeOptionOrderResponse optionOrderResponse = null;
        final String url = OrderCommon.constructFullURL(null, "placechangeoptionorder", this.request);
        try {
            final String requestBody = OrderMessageConverter.convertPlaceChangeOptionOrderToXML(optionOrderRequest);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", this.request, (Map)null, requestBody);
            final String is = response.getResponseString();
            optionOrderResponse = OrderMessageConverter.convertToPlaceChangeOptionOrder(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return optionOrderResponse;
    }
    
    public CancelOrderResponse cancelOrder(final CancelOrder cancelRequest) throws IOException, ETWSException {
        CancelOrderResponse cancelResponse = null;
        final String url = OrderCommon.constructFullURL(null, "cancelorder", this.request);
        try {
            final String requestBody = OrderMessageConverter.convertCancelOrderToXML(cancelRequest);
            final HttpApiResponse response = ConnectionUtils.invoke(url, "POST", this.request, (Map)null, requestBody);
            final String is = response.getResponseString();
            cancelResponse = OrderMessageConverter.convertToCancelOrderResponse(is);
        }
        catch (IOException e) {
            throw e;
        }
        catch (ETWSException e2) {
            throw e2;
        }
        return cancelResponse;
    }
}
