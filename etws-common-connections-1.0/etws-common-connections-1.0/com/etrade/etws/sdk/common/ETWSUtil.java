// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.common;

import com.etrade.etws.sdk.converters.ErrorMessageConverter;

public class ETWSUtil
{
    public static ETWSException constructException(final int statusCode, final String authenticateHeader) {
        final ETWSException exception = new ETWSException();
        exception.setErrorCode(statusCode);
        exception.setErrorMessage(authenticateHeader);
        return exception;
    }
    
    public static ETWSException constructException(final String problem) {
        ETWSException exception = null;
        exception = ErrorMessageConverter.convertToEtwsException(problem);
        return exception;
    }
}
