// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.converters;

import com.etrade.etws.order.CancelOrder;
import com.etrade.etws.order.PlaceChangeOptionOrder;
import com.etrade.etws.order.PreviewChangeOptionOrder;
import com.etrade.etws.order.PreviewOptionOrder;
import com.etrade.etws.order.PlaceOptionOrder;
import com.etrade.etws.order.PlaceChangeEquityOrder;
import com.etrade.etws.order.PreviewChangeEquityOrder;
import com.etrade.etws.order.PreviewEquityOrder;
import com.etrade.etws.order.PlaceEquityOrder;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;

public class NameSpaceConverter extends ReflectionConverter implements Converter
{
    public NameSpaceConverter(final Mapper mapper, final ReflectionProvider reflectionProvider) {
        super(mapper, reflectionProvider);
    }
    
    public void marshal(final Object obj, final HierarchicalStreamWriter writer, final MarshallingContext context) {
        writer.addAttribute("xmlns", "http://order.etws.etrade.com");
        super.marshal(obj, writer, context);
    }
    
    public Object unmarshal(final HierarchicalStreamReader reader, final UnmarshallingContext context) {
        return null;
    }
    
    public boolean canConvert(final Class clazz) {
        return clazz.equals(PlaceEquityOrder.class) || clazz.equals(PreviewEquityOrder.class) || clazz.equals(PreviewChangeEquityOrder.class) || clazz.equals(PlaceChangeEquityOrder.class) || clazz.equals(PlaceOptionOrder.class) || clazz.equals(PreviewOptionOrder.class) || clazz.equals(PreviewChangeOptionOrder.class) || clazz.equals(PlaceChangeOptionOrder.class) || clazz.equals(CancelOrder.class);
    }
}
