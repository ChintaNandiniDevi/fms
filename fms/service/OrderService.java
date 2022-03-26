package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Orders;

public interface OrderService {
Orders getOrder(String orderNumber);//String
boolean addOrder(Orders orders);//Orders
boolean updateOrder(Orders orders);//Orders
boolean deleteOrder(String orderNumber);//String
List<Orders> getAllOrders();

}
