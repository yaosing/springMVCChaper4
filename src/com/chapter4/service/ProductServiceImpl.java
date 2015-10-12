package com.chapter4.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.chapter4.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private Map<Long, Product> products = new HashMap<Long, Product>();
	private AtomicLong generator = new AtomicLong();
	
	public ProductServiceImpl(){
		Product product = new Product();
		product.setName("test");
		product.setDescription("Powerful test");
		product.setPrice(129.99F);
		add(product);
	}
	
	public Product add(Product product) {
		long newId = generator.incrementAndGet();
		product.setId(newId);
		products.put(newId, product);
		return product;
	}

	public Product get(long id) {
		return products.get(id);
	}
	
}
