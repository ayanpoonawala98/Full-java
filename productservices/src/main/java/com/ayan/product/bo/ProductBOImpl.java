package com.ayan.product.bo;

import com.ayan.product.dao.ProductDAO;
import com.ayan.product.dao.ProductDAOimpl;
import com.ayan.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	private ProductDAO dao =new ProductDAOimpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

}
