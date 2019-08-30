package com.shopping.Hendryshop;

import java.util.Collection;

import com.shopping.pojo.Product;

public interface InputCart {
	
	boolean addProduct(Product p);
	boolean removeProduct(String pid) throws ProductNotFoundException;
	Collection getCartDetails();
	
 

}
