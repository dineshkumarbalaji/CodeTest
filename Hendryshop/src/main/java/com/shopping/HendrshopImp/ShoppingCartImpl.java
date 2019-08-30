package com.shopping.HendrshopImp;

import java.util.HashMap;
import java.util.Map;

import com.shopping.Hendryshop.ShoppingCart;
import com.shopping.pojo.Product;

public class ShoppingCartImpl implements ShoppingCart {

	private Map<String, Integer> cartmap;

	public ShoppingCartImpl() {

		cartmap = new HashMap<String, Integer>();
	}

	@Override
	public Map addPurchaseItem(Product sp) {

		if (cartmap.containsKey(sp.getPname())) {
			cartmap.put(sp.getPname(), sp.getQuantity() + sp.getQuantity());
		} else {
			cartmap.put(sp.getPname(), sp.getQuantity());
		}
		return cartmap;
	}

	@Override
	public Map RemovePurchaseItem(String pname) {
		if (cartmap.containsKey(pname)) {
			cartmap.remove(pname);
		}

		return cartmap;
	}

	@Override
	public Double calaculatePrice(Map<String, Integer> map, Map<String, Product> cartmap) {

		Double totalprice = 0.0;
		Integer offerbread = 0;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			for (Map.Entry<String, Product> cart : cartmap.entrySet()) {
				Product prd = (Product) cartmap.values();

				if (entry.getKey().endsWith(prd.getPname())) {
					Product p1 = (Product) cartmap.values();
					if (p1.getPname().equals("Milk")) {
						totalprice = entry.getValue() * p1.getCost();
					} else if (p1.getPname().equals("apples")) {
						totalprice = ((entry.getValue() * p1.getCost()) * 10) / 100;
					} else {
						totalprice = entry.getValue() * p1.getCost();
					}
				}
			}
		}

		return totalprice;
	}

}
