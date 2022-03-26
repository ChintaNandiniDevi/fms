package com.cap.fms.repository;

import java.util.List;

import com.cap.fms.entities.Orders;

public interface IOrderDao {
	Orders getOrder(String orderNumber);//string
	boolean addOrder(Orders orders);//Orders
	boolean updateOrder(Orders orders);//Orders
	boolean deleteOrder(String orderNumber);//String
	List <Orders> getAllOrders();
}
