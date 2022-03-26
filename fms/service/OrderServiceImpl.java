package com.cap.fms.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.cap.fms.dao.IOrderDaoImpl;
import com.cap.fms.entities.Orders;
import com.cap.fms.repository.IOrderDao;
import com.cap.fms.util.JPAUtil;

public class OrderServiceImpl implements OrderService {
	EntityTransaction transaction;
	IOrderDao repo;
	
	public OrderServiceImpl()
	{
		repo=new IOrderDaoImpl();
		transaction=JPAUtil.getEntityManager().getTransaction();
	}
	public Orders getOrder(String orderNumber) {
		transaction.begin();
		Orders orders=repo.getOrder(orderNumber);
		transaction.commit();
		return orders;
	}

	public boolean addOrder(Orders orders) {
		transaction.begin();
		boolean bool=repo.addOrder(orders);
		transaction.commit();
		return bool;
	}

	public boolean updateOrder(Orders orders) {
		transaction.begin();
		boolean bool=repo.updateOrder(orders);
		transaction.commit();
		return bool;
	}

	public boolean deleteOrder(String orderNumber) {
		transaction.begin();
		boolean bool=repo.deleteOrder(orderNumber);
		transaction.commit();
		return bool;
	}

	public List<Orders> getAllOrders() {
		transaction.begin();
		List<Orders> ordersList=repo.getAllOrders();
		transaction.commit();
		return ordersList;
	}

}
