package com.jbk.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Product;

import com.jbk.service.ProductService;


@RestController   //to specify that  class is controller class
public class ProductController
{
	
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addproduct") //incoming request
	public String addProduct(@RequestBody Product product)
	{
		//user want to add product data into the list
		//without database
		
		int status =service.addProduct(product);
		
		if(status==1)
		{
	           return "Data added";
	    } else 
	    {
	    	   return"Data already exist";
	    }
		
	}
	
    @GetMapping("/getproduct/{id}")  //we r returning the product and string(msg)..both have different datatype so using Object returntype
    public Object getProductById(@PathVariable long id)//it return product
    {
    	Product product=service.getProductById(id);
    	//alt+shift+l complete left side
    	
    	if(product!=null)
    	{
    		return product;
    	}else
    	{
    		return "Product not found";
    	}
    	
		
    }
    
   @GetMapping("/getproductbyName/{productName}")
    public Object getProductByName(@PathVariable String productName) 
    {
    	Product product=service.getProductByName(productName);
    	
    	if(product!=null)
    	{
    		return product;
    	}else
    	{
    		return "Product not found";
    	}
    	
		
	}
    
    	
    
    
    
   
  /*  @GetMapping("/getAllProduct")
    public Object gelAllProduct()
    {
    	
    	return service.gelAllProduct();
    	
    }*/
    
   
   
    
   @DeleteMapping("/deleteProduct")  //here we are not giving variable in url so create url  as...http:8080/deleteProduct?productId=101 or 102...
   public String deleteProduct(@RequestParam long productId)
   {
	return service.deleteProduct(productId);
	   
   }
    
    
  
   
   @PutMapping("/updateProduct")   //check it
   public String updateProduct(@RequestBody Product product) {
   
	   return service.updateProduct(product);
	     
   }
    
   
   
  
   
   
   
   
}
