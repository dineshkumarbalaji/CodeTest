package com.shopping.HendrshopImp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.shopping.Hendryshop.InputCart;
import com.shopping.Hendryshop.ProductNotFoundException;
import com.shopping.pojo.Product;

public class InputCartImp implements InputCart {

	
	private Map map;
	
	public InputCartImp(){
		
		map = new HashMap();
	}

	public boolean addProduct(Product p) {
		if(map.containsKey(p.getPname())){
			Product p1 = (Product) map.get(p.getPname());
			p1.setCost(p.getCost());
			p1.setQuantity(p1.getQuantity()+p.getQuantity());
			return true;
		}
		map.put(p.getPname(),p);
		return false;
	}

	public boolean removeProduct(String Pname) throws ProductNotFoundException {
		if(map.containsKey(Pname)){
			map.remove(Pname);
			return true;
		}else throw new ProductNotFoundException(
      "Product with Name "+Pname+" is not Found.");
	}

	public Collection<Product> getCartDetails() {
			return map.values();
	}

}
