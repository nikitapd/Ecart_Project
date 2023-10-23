package com.jbk.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jbk.dao.ProductDao;
import com.jbk.entity.Product;
import com.jbk.service.ProductService;

@Service //instead of @Component
public class ProductServiceImpl implements ProductService {

	@Autowired    //instead of creating object using new keyword use @Autowired
	private ProductDao dao; 
	
	@Override
	public int addProduct(Product product) {
	
		return dao.addProduct(product);
	}

	@Override
	public Product getProductById(long id) {
		
		return dao.getProductById(id);
	}

	/*@Override
	public Object gelAllProduct() {
		
		List<Product> list = dao.gelAllProduct();
		
		if(!list.isEmpty())
		{
			return list;
		}else
		{
			return "Empty List";
		}
	}*/
	
	@Override
	public String deleteProduct(long productId)
	{
		return dao.deleteProduct(productId);
	}

	
	@Override
	public Product getProductByName(String productName) {
		
		return dao.getProductByName(productName);
	}

	
	
	
	@Override
	public String updateProduct(Product product) {
		
		Product listProduct=getProductById(product.getProductId());
		
		if(listProduct!=null) {
			
			return dao.updateProduct(product);
		}
		else 
		{
		return "Product not found to update";
	}
 }

}
