// 
// Decompiled by Procyon v0.5.36
// 

package com.etrade.etws.market;

import java.util.ArrayList;
import java.util.List;

public class ProductLookupResponse
{
    protected List<Product> productList;
    
    public List<Product> getProductList() {
        if (this.productList == null) {
            this.productList = new ArrayList<Product>();
        }
        return this.productList;
    }
}
