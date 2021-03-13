package com.ayan.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.ayan.product.dto.Product;

public class ProductDAOimpl implements ProductDAO {

	private static final String Map = null;
	Map<Integer,Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
		// TODO Auto-generated method stub
	}

	@Override
	public Product read(int id) {
		
		// TODO Auto-generated method stub
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
