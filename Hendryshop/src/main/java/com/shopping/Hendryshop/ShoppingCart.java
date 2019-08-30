package com.shopping.Hendryshop;

import java.util.Map;

import com.shopping.pojo.Product;

public interface ShoppingCart {
	
	public Map addPurchaseItem(Product shoppingproduct);
	public Map RemovePurchaseItem(String pname);
	public Double calaculatePrice(Map<String, Integer> map,Map<String, Product> cartmap);
}
