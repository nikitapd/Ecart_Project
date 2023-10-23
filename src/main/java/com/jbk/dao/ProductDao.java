package com.jbk.dao;

import com.jbk.entity.Product;

public interface ProductDao 
{
	//abstract method
	public int addProduct(Product product);
	
	//abstract method to get product
	public Product getProductById(long id);
	
	//abstract method to get all product

	public String deleteProduct(long productId);
    //abstract method to delete the product by id in dao
	

	public Product getProductByName(String productName);
	//abstract method to delete the product by name in dao
	
	 public String updateProduct(Product product);
	 
	
}
