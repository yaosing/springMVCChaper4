package com.chapter4.service;

import com.chapter4.model.Product;

public interface ProductService {
	Product add(Product product);
	Product get(long id);
}
