package com.cap.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cap.fms.entities.Product;
import com.cap.fms.repository.IProductDao;

import com.cap.fms.util.JPAUtil;

public class IProductDaoImpl implements IProductDao {
		EntityManager entityManager;
		
		public IProductDaoImpl()
		{
			super();
			entityManager=JPAUtil.getEntityManager();
		}

		public Product getProduct(String productName) {
			String qstr="SELECT Product from Product product WHERE product.productName LIKE :pproductName ";
			TypedQuery<Product> query=entityManager.createQuery(qstr,Product.class);
			query.setParameter("pproductName",productName);
			return query.getSingleResult();
		}

		public boolean addProduct(Product product) {
			try {
			 entityManager.persist(product);
			 return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}

		public boolean updateProduct(Product product) {
			try {
				 entityManager.merge(product);
				 return true;
				}
				catch(Exception e)
				{
					return false;
				}
		}

		public boolean deleteProduct(String product) {
			try {
			String qstr="SELECT Product from Product product WHERE product.product LIKE :pproduct";
			TypedQuery<Product> query=entityManager.createQuery(qstr,Product.class);
			query.setParameter("pproduct",product);
			entityManager.remove(query.getSingleResult());
			return true;
			}
			catch(Exception e){
				return false;
			}
		}

		public List<Product> getAllProducts() {
			String qstr="SELECT Product from Product product ";
			TypedQuery<Product> query=entityManager.createQuery(qstr,Product.class);
			return query.getResultList();
		}	
}