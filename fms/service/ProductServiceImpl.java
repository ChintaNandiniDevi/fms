package com.cap.fms.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.cap.fms.dao.IProductDaoImpl;
import com.cap.fms.entities.Product;
import com.cap.fms.repository.IProductDao;

import com.cap.fms.util.JPAUtil;

public class ProductServiceImpl implements ProductService {

	EntityTransaction transaction;
	IProductDao repo;
	
	public ProductServiceImpl()
	{
		repo=new IProductDaoImpl();
		transaction=JPAUtil.getEntityManager().getTransaction();
	}
	
	public Product getProduct(String productName) {
		transaction.begin();
		Product Product=repo.getProduct(productName);
		transaction.commit();
		return Product;
	}

	public boolean addProduct(Product product) {
		transaction.begin();
		boolean bool =repo.addProduct(product);
		transaction.commit();
		return bool;
	}

	public boolean updateProduct(Product product) {
		transaction.begin();
		boolean bool =repo.updateProduct(product);
		transaction.commit();
		return bool;
	}

	public boolean deleteProduct(String product) {
		transaction.begin();
		boolean bool =repo.deleteProduct(product);
		transaction.commit();
		return bool;
	}

	public List<Product> getAllProducts() {
		transaction.begin();
		List<Product> productList=repo.getAllProducts();
		transaction.commit();
		return productList;
	}
}