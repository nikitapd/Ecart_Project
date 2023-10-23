package com.jbk.daoimpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jbk.dao.ProductDao;
import com.jbk.entity.Product;



@Repository       // or @Component  //instead of ProductDao=new ProductDaoImpl
public class ProductDaoImpl implements ProductDao 
{
	@Autowired
    private SessionFactory sessionFactory;	
	
	@Override
	public int addProduct(Product product) 
	{
		
		try {
			Session session=sessionFactory.openSession();
			session.save(product);
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			return 2;
		}
		return 1;
	}

	@Override
	public Product getProductById(long id)
	{
		return null;
		
	}

	/*@Override
	public List<Product> gelAllProduct() 
	{
		return null;
	}*/

	
	@Override
	public String deleteProduct(long productId)
	{
		return null;
		
	}

	

	@Override
	public Product getProductByName(String productName)
	{
		
		return null;
	}
	
	@Override
	public String updateProduct(Product product)
	{
		return null;
		
	}

}
	
	
	
	
	
	
	
	



