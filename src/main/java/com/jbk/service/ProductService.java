package com.jbk.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jbk.entity.Product;


public interface ProductService

{
  //abstract method of interface to add the product
   public int addProduct(Product product);

  //abstract method to get the product by id
   public Product getProductById(long id);

   //abstract method to get all product
  // public Object gelAllProduct();
   
 //abstract methods to delete the product by id
   public String deleteProduct(long productId);
   
   //abstract methods to delete the product by  productName
 //  public Product getProductByName(String productName);
   
   public String updateProduct(Product product);
   

   
   public Product getProductByName(String productName);
   
   
  

   
   
   
  
}
