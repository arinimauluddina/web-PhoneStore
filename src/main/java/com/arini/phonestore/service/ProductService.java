package com.arini.phonestore.service;

import java.util.List;
import java.util.Map;
import com.arini.phonestore.domain.Product;

public interface ProductService {
	void updateAllStock();

	List<Product> getAllProducts();

	List<Product> getProductsByCategory(String category);

	List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	Product getProductById(String productID);

	void addProduct(Product product);
}