// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.converters;

import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.etrade.etws.sdk.common.ETWSException;

public class ErrorMessageConverter
{
    public static ETWSException convertToEtwsException(final String errorXML) {
        final XStream xstream = new XStream((HierarchicalStreamDriver)new DomDriver());
        xstream.alias("Error", (Class)ETWSException.class);
        xstream.aliasField("ErrorCode", (Class)ETWSException.class, "errorCode");
        xstream.aliasField("ErrorMessage", (Class)ETWSException.class, "errorMessage");
        final ETWSException response = (ETWSException)xstream.fromXML(errorXML);
        return response;
    }
}
