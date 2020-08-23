// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.sdk.converters;

import com.etrade.etws.account.Transaction;
import com.etrade.etws.account.GetTransactionHistoryResponse;
import com.etrade.etws.account.ProductId;
import com.etrade.etws.account.GetTransactionDetailsResponse;
import com.etrade.etws.account.DeleteAlertResponse;
import com.etrade.etws.account.GetAlertDetailsResponse;
import com.etrade.etws.account.Alert;
import com.etrade.etws.account.GetAlertsResponse;
import com.etrade.etws.account.AccountPosition;
import com.etrade.etws.account.AccountPositionsResponse;
import com.etrade.etws.account.MarginAccountBalance;
import com.etrade.etws.account.CashAccountBalance;
import com.etrade.etws.account.AccountBalanceResponse;
import com.etrade.etws.account.MarginLevel;
import com.etrade.etws.account.Account;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import java.util.ArrayList;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.etrade.etws.account.AccountListResponse;

public class AccountMessageConverter
{
    public static AccountListResponse convertToAccountList(final String is) {
        System.out.println("Xstream wrapper");
        final XStream xstream = new XStream(new DomDriver()) {
            protected List<String> implicitFields = new ArrayList<String>();
            
            protected MapperWrapper wrapMapper(final MapperWrapper next) {
                return new MapperWrapper(next) {
                    public boolean shouldSerializeMember(final Class definedIn, final String fieldName) {
                        if (!XStream.this.implicitFields.contains(fieldName) && definedIn == Object.class && !fieldName.equalsIgnoreCase("Account")) {
                            System.out.println("Field = " + fieldName);
                            return false;
                        }
                        return super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
            
            public void addImplicitCollection(final Class ownerType, final String fieldName, final String itemFieldName, final Class itemType) {
                System.out.println("Field " + fieldName + " added to the list");
                this.implicitFields.add(fieldName);
                super.addImplicitCollection(ownerType, fieldName, itemFieldName, itemType);
            }
        };
        xstream.alias("AccountListResponse", (Class)AccountListResponse.class);
        xstream.alias("Account", (Class)Account.class);
        xstream.addImplicitCollection((Class)AccountListResponse.class, "response");
        xstream.alias("MarginLevel", (Class)MarginLevel.class);
        xstream.setMode(1001);
        final AccountListResponse response = (AccountListResponse)xstream.fromXML(is);
        return response;
    }
    
    public static AccountBalanceResponse convertToAccountBalance(final String is) {
        final XStream xstream = new XStream(new DomDriver()) {
            protected MapperWrapper wrapMapper(final MapperWrapper next) {
                return new MapperWrapper(next) {
                    public boolean shouldSerializeMember(final Class definedIn, final String fieldName) {
                        return definedIn != Object.class && super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
        };
        xstream.alias("AccountBalanceResponse", (Class)AccountBalanceResponse.class);
        xstream.alias("CashAccountBalance", (Class)CashAccountBalance.class);
        xstream.alias("MarginAccountBalance", (Class)MarginAccountBalance.class);
        final AccountBalanceResponse response = (AccountBalanceResponse)xstream.fromXML(is);
        return response;
    }
    
    public static AccountPositionsResponse convertToAccountPositions(final String is) {
        final XStream xstream = new XStream(new DomDriver()) {
            protected MapperWrapper wrapMapper(final MapperWrapper next) {
                return new MapperWrapper(next) {
                    public boolean shouldSerializeMember(final Class definedIn, final String fieldName) {
                        return definedIn != Object.class && super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
        };
        xstream.alias("AccountPositionsResponse", (Class)AccountPositionsResponse.class);
        xstream.aliasField("AccountPositions", (Class)AccountPositionsResponse.class, "response");
        xstream.alias("AccountPosition", (Class)AccountPosition.class);
        final AccountPositionsResponse res = (AccountPositionsResponse)xstream.fromXML(is);
        return res;
    }
    
    public static GetAlertsResponse convertToAlertsList(final String is) {
        final XStream xstream = new XStream(new DomDriver()) {
            protected MapperWrapper wrapMapper(final MapperWrapper next) {
                return new MapperWrapper(next) {
                    public boolean shouldSerializeMember(final Class definedIn, final String fieldName) {
                        return definedIn != Object.class && super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
        };
        xstream.aliasField("GetAlertsResponse", (Class)GetAlertsResponse.class, "AlertsResponse");
        xstream.aliasField("Alerts", (Class)GetAlertsResponse.class, "response");
        xstream.alias("Alerts", (Class)ArrayList.class);
        xstream.alias("AlertsResponse", (Class)GetAlertsResponse.class);
        xstream.alias("Alert", (Class)Alert.class);
        final GetAlertsResponse response = (GetAlertsResponse)xstream.fromXML(is);
        return response;
    }
    
    public static GetAlertDetailsResponse convertToAlertDetails(final String is) {
        final XStream xstream = new XStream(new DomDriver()) {
            protected MapperWrapper wrapMapper(final MapperWrapper next) {
                return new MapperWrapper(next) {
                    public boolean shouldSerializeMember(final Class definedIn, final String fieldName) {
                        return definedIn != Object.class && super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
        };
        xstream.alias("AlertDetailsResponse", (Class)GetAlertDetailsResponse.class);
        final GetAlertDetailsResponse response = (GetAlertDetailsResponse)xstream.fromXML(is);
        return response;
    }
    
    public static DeleteAlertResponse convertToDeleteAlert(final String is) {
        final XStream xstream = new XStream(new DomDriver()) {
            protected MapperWrapper wrapMapper(final MapperWrapper next) {
                return new MapperWrapper(next) {
                    public boolean shouldSerializeMember(final Class definedIn, final String fieldName) {
                        return definedIn != Object.class && super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
        };
        xstream.alias("DeleteAlertResponse", (Class)DeleteAlertResponse.class);
        final DeleteAlertResponse response = (DeleteAlertResponse)xstream.fromXML(is);
        return response;
    }
    
    public static GetTransactionDetailsResponse convertToTransactionDetails(final String is) {
        final XStream xstream = new XStream(new DomDriver()) {
            protected MapperWrapper wrapMapper(final MapperWrapper next) {
                return new MapperWrapper(next) {
                    public boolean shouldSerializeMember(final Class definedIn, final String fieldName) {
                        return definedIn != Object.class && super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
        };
        xstream.alias("transactionDetails", (Class)GetTransactionDetailsResponse.class);
        xstream.alias("productId", (Class)ProductId.class);
        final GetTransactionDetailsResponse response = (GetTransactionDetailsResponse)xstream.fromXML(is);
        return response;
    }
    
    public static GetTransactionHistoryResponse convertToHistoryList(final String is) {
        final XStream xstream = new XStream(new DomDriver()) {
            protected MapperWrapper wrapMapper(final MapperWrapper next) {
                return new MapperWrapper(next) {
                    public boolean shouldSerializeMember(final Class definedIn, final String fieldName) {
                        if ("transaction".equals(fieldName)) {
                            return super.shouldSerializeMember(definedIn, fieldName);
                        }
                        return definedIn != Object.class && super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
        };
        xstream.alias("transactions", (Class)GetTransactionHistoryResponse.class);
        xstream.alias("transaction", (Class)Transaction.class);
        xstream.addImplicitCollection((Class)GetTransactionHistoryResponse.class, "transactionList");
        xstream.aliasField("count", (Class)Integer.TYPE, "count");
        xstream.aliasField("next", (Class)String.class, "next");
        xstream.aliasField("accountId", (Class)Long.TYPE, "accountId");
        final GetTransactionHistoryResponse response = (GetTransactionHistoryResponse)xstream.fromXML(is);
        return response;
    }
}
