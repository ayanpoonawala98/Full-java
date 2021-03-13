package com.ayan.product.bo;

import com.ayan.product.dto.Product;

public interface ProductBO {
	void create(Product product);
	
	Product findProduct(int id);
	}
