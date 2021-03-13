package com.ayan.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ayan.product.dto.Product;

public class ProductDAOimplTest {

	@Test
	public void createShouldCreateProduct() {
		ProductDAO dao =new ProductDAOimpl();
		Product product =new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("It is awesome but costly");
		product.setPrice(1000);
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Iphone",result.getName());
				
		
		
	}

}
