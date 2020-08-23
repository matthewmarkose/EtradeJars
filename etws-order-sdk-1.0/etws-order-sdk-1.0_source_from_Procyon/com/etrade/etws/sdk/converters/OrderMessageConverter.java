// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.converters;

import com.etrade.etws.order.CancelOrderRequest;
import com.etrade.etws.order.CancelOrder;
import com.etrade.etws.order.PreviewChangeOptionOrder;
import com.etrade.etws.order.ChangeOptionOrderRequest;
import com.etrade.etws.order.PlaceChangeOptionOrder;
import com.etrade.etws.order.PreviewOptionOrder;
import com.etrade.etws.order.PlaceOptionOrder;
import com.etrade.etws.order.PreviewChangeEquityOrder;
import com.etrade.etws.order.ChangeEquityOrderRequest;
import com.etrade.etws.order.PlaceChangeEquityOrder;
import com.etrade.etws.order.PreviewEquityOrder;
import com.thoughtworks.xstream.converters.Converter;
import com.etrade.etws.order.PlaceEquityOrder;
import com.etrade.etws.order.CancelOrderResponse;
import com.etrade.etws.order.PlaceChangeOptionOrderResponse;
import com.etrade.etws.order.PreviewChangeOptionOrderResponse;
import com.etrade.etws.order.PlaceChangeEquityOrderResponse;
import com.etrade.etws.order.PreviewChangeEquityOrderResponse;
import com.etrade.etws.order.PreviewOptionOrderResponse;
import com.etrade.etws.order.ETMessages;
import com.etrade.etws.order.PreviewEquityOrderResponse;
import com.etrade.etws.order.PlaceOptionOrderResponse;
import com.etrade.etws.order.ETAppMessages;
import com.etrade.etws.order.PlaceEquityOrderResponse;
import com.etrade.etws.order.SymbolInfo;
import com.etrade.etws.order.LegDetails;
import com.etrade.etws.order.Order;
import com.etrade.etws.order.GroupOrder;
import com.etrade.etws.order.OrderDetails;
import com.etrade.etws.order.OrderListResponse;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.etrade.etws.order.GetOrderListResponse;

public class OrderMessageConverter
{
    public static GetOrderListResponse convertToOrderList(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("GetOrderListResponse", (Class)GetOrderListResponse.class);
        xstream.alias("OrderListResponse", (Class)OrderListResponse.class);
        xstream.alias("OrderDetails", (Class)OrderDetails.class);
        xstream.alias("GroupOrder", (Class)GroupOrder.class);
        xstream.alias("Order", (Class)Order.class);
        xstream.alias("LegDetails", (Class)LegDetails.class);
        xstream.alias("SymbolInfo", (Class)SymbolInfo.class);
        xstream.setMode(1001);
        final GetOrderListResponse response = (GetOrderListResponse)xstream.fromXML(is);
        return response;
    }
    
    public static PlaceEquityOrderResponse convertToPlaceEquityOrderResponse(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("PlaceEquityOrderResponse", (Class)PlaceEquityOrderResponse.class);
        xstream.alias("message", (Class)ETAppMessages.class);
        final PlaceEquityOrderResponse response = (PlaceEquityOrderResponse)xstream.fromXML(is);
        return response;
    }
    
    public static PlaceOptionOrderResponse convertToPlaceOptionOrderResponse(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("PlaceOptionOrderResponse", (Class)PlaceOptionOrderResponse.class);
        xstream.alias("message", (Class)ETAppMessages.class);
        final PlaceOptionOrderResponse response = (PlaceOptionOrderResponse)xstream.fromXML(is);
        return response;
    }
    
    public static PreviewEquityOrderResponse convertToPreviewEquityOrderResponse(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("PreviewEquityOrderResponse", (Class)PreviewEquityOrderResponse.class);
        xstream.alias("messageList", (Class)ETMessages.class);
        xstream.alias("message", (Class)ETAppMessages.class);
        final PreviewEquityOrderResponse response = (PreviewEquityOrderResponse)xstream.fromXML(is);
        return response;
    }
    
    public static PreviewOptionOrderResponse convertToPreviewOptionOrderResponse(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("PreviewOptionOrderResponse", (Class)PreviewOptionOrderResponse.class);
        xstream.alias("message", (Class)ETAppMessages.class);
        final PreviewOptionOrderResponse response = (PreviewOptionOrderResponse)xstream.fromXML(is);
        return response;
    }
    
    public static PreviewChangeEquityOrderResponse convertToPreviewChangeEquityOrder(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("PreviewChangeEquityOrderResponse", (Class)PreviewChangeEquityOrderResponse.class);
        xstream.alias("message", (Class)ETAppMessages.class);
        final PreviewChangeEquityOrderResponse response = (PreviewChangeEquityOrderResponse)xstream.fromXML(is);
        return response;
    }
    
    public static PlaceChangeEquityOrderResponse convertToPlaceChangeEquityOrder(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("PlaceChangeEquityOrderResponse", (Class)PlaceChangeEquityOrderResponse.class);
        xstream.alias("message", (Class)ETAppMessages.class);
        final PlaceChangeEquityOrderResponse response = (PlaceChangeEquityOrderResponse)xstream.fromXML(is);
        return response;
    }
    
    public static PreviewChangeOptionOrderResponse convertToPreviewChangeOptionOrder(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("PreviewChangeOptionOrderResponse", (Class)PreviewChangeOptionOrderResponse.class);
        xstream.alias("message", (Class)ETAppMessages.class);
        final PreviewChangeOptionOrderResponse response = (PreviewChangeOptionOrderResponse)xstream.fromXML(is);
        return response;
    }
    
    public static PlaceChangeOptionOrderResponse convertToPlaceChangeOptionOrder(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("PlaceChangeOptionOrderResponse", (Class)PlaceChangeOptionOrderResponse.class);
        xstream.alias("message", (Class)ETAppMessages.class);
        final PlaceChangeOptionOrderResponse response = (PlaceChangeOptionOrderResponse)xstream.fromXML(is);
        return response;
    }
    
    public static CancelOrderResponse convertToCancelOrderResponse(final String is) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("CancelOrderResponse", (Class)CancelOrderResponse.class);
        final CancelOrderResponse response = (CancelOrderResponse)xstream.fromXML(is);
        return response;
    }
    
    public static String convertPlaceEquityOrderToXML(final PlaceEquityOrder equityOrderRequest) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.registerConverter((Converter)new NameSpaceConverter(xstream.getMapper(), xstream.getReflectionProvider()));
        xstream.alias("PlaceEquityOrder", (Class)PlaceEquityOrder.class);
        xstream.aliasField("EquityOrderRequest", (Class)PlaceEquityOrder.class, "equityOrderRequest");
        final String xml = xstream.toXML((Object)equityOrderRequest);
        return xml;
    }
    
    public static String convertPreviewEquityOrderToXML(final PreviewEquityOrder equityOrderRequest) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.registerConverter((Converter)new NameSpaceConverter(xstream.getMapper(), xstream.getReflectionProvider()));
        xstream.alias("PreviewEquityOrder", (Class)PreviewEquityOrder.class);
        xstream.aliasField("EquityOrderRequest", (Class)PreviewEquityOrder.class, "equityOrderRequest");
        final String xml = xstream.toXML((Object)equityOrderRequest);
        return xml;
    }
    
    public static String convertPlaceChangeEquityOrderToXML(final PlaceChangeEquityOrder equityOrderRequest) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.registerConverter((Converter)new NameSpaceConverter(xstream.getMapper(), xstream.getReflectionProvider()));
        xstream.alias("placeChangeEquityOrder", (Class)PlaceChangeEquityOrder.class);
        xstream.aliasField("ChangeEquityOrderRequest", (Class)ChangeEquityOrderRequest.class, "changeEquityOrderRequest");
        final String xml = xstream.toXML((Object)equityOrderRequest);
        return xml;
    }
    
    public static String convertPreviewChangeEquityOrderToXML(final PreviewChangeEquityOrder equityOrderRequest) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.registerConverter((Converter)new NameSpaceConverter(xstream.getMapper(), xstream.getReflectionProvider()));
        xstream.alias("previewChangeEquityOrder", (Class)PreviewChangeEquityOrder.class);
        xstream.aliasField("ChangeEquityOrderRequest", (Class)ChangeEquityOrderRequest.class, "changeEquityOrderRequest");
        final String xml = xstream.toXML((Object)equityOrderRequest);
        return xml;
    }
    
    public static String convertPlaceOptionOrderToXML(final PlaceOptionOrder optionOrderRequest) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.registerConverter((Converter)new NameSpaceConverter(xstream.getMapper(), xstream.getReflectionProvider()));
        xstream.alias("PlaceOptionOrder", (Class)PlaceOptionOrder.class);
        xstream.aliasField("OptionOrderRequest", (Class)PlaceOptionOrder.class, "optionOrderRequest");
        final String xml = xstream.toXML((Object)optionOrderRequest);
        return xml;
    }
    
    public static String convertPreviewOptionOrderToXML(final PreviewOptionOrder optionOrderRequest) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.registerConverter((Converter)new NameSpaceConverter(xstream.getMapper(), xstream.getReflectionProvider()));
        xstream.alias("PreviewOptionOrder", (Class)PreviewOptionOrder.class);
        xstream.aliasField("OptionOrderRequest", (Class)PreviewOptionOrder.class, "optionOrderRequest");
        final String xml = xstream.toXML((Object)optionOrderRequest);
        return xml;
    }
    
    public static String convertPlaceChangeOptionOrderToXML(final PlaceChangeOptionOrder optionOrderRequest) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.registerConverter((Converter)new NameSpaceConverter(xstream.getMapper(), xstream.getReflectionProvider()));
        xstream.alias("placeChangeOptionOrder", (Class)PlaceChangeOptionOrder.class);
        xstream.aliasField("ChangeOptionOrderRequest", (Class)ChangeOptionOrderRequest.class, "changeOptionOrderRequest");
        final String xml = xstream.toXML((Object)optionOrderRequest);
        return xml;
    }
    
    public static String convertPreviewChangeOptionOrderToXML(final PreviewChangeOptionOrder optionOrderRequest) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.registerConverter((Converter)new NameSpaceConverter(xstream.getMapper(), xstream.getReflectionProvider()));
        xstream.alias("previewChangeOptionOrder", (Class)PreviewChangeOptionOrder.class);
        xstream.aliasField("ChangeOptionOrderRequest", (Class)ChangeOptionOrderRequest.class, "changeOptionOrderRequest");
        final String xml = xstream.toXML((Object)optionOrderRequest);
        return xml;
    }
    
    public static String convertCancelOrderToXML(final CancelOrder cancelOrderRequest) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.registerConverter((Converter)new NameSpaceConverter(xstream.getMapper(), xstream.getReflectionProvider()));
        xstream.alias("cancelOrder", (Class)CancelOrder.class);
        xstream.aliasField("CancelOrderRequest", (Class)CancelOrderRequest.class, "cancelOrderRequest");
        final String xml = xstream.toXML((Object)cancelOrderRequest);
        return xml;
    }
}
