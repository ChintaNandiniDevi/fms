package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Product;

public interface ProductService {
	Product getProduct(String ProductName);
	boolean addProduct(Product Product);
	boolean updateProduct(Product Product);
	boolean deleteProduct(String Product);
	List<Product> getAllProducts();
}