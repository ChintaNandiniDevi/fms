package com.cap.fms.repository;

import java.util.List;

import com.cap.fms.entities.Product;

public interface IProductDao {
	Product getProduct(String productName);//String
	boolean addProduct(Product product);//Land
	boolean updateProduct(Product product);//Land
	boolean deleteProduct(String Product);//String
	List<Product> getAllProducts();
}