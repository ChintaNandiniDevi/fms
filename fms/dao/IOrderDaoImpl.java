package com.cap.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cap.fms.entities.Orders;
import com.cap.fms.repository.IOrderDao;
import com.cap.fms.util.JPAUtil;

public class IOrderDaoImpl implements IOrderDao {
	EntityManager entityManager;
	public IOrderDaoImpl()
	{
		super();
		entityManager=JPAUtil.getEntityManager();
	}

	public Orders getOrder(String orderNumber) {
		String qstr="SELECT orders from Orders WHERE orderNumber LIKE :porderNumber";
		TypedQuery<Orders> query=entityManager.createQuery(qstr,Orders.class);
		query.setParameter("porderNumber", orderNumber);
		return query.getSingleResult();
	}

	public boolean addOrder(Orders orders) {
		try
		{
			entityManager.persist(orders);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean updateOrder(Orders orders) {
		try
		{
			entityManager.merge(orders);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean deleteOrder(String orderNumber) {
		try
		{
			String qstr="SELECT orders from Orders WHERE orderNumber LIKE :porderNumber";
			TypedQuery<Orders> query=entityManager.createQuery(qstr,Orders.class);
			query.setParameter("porderNumber", orderNumber);
			entityManager.remove(query.getSingleResult());
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public List<Orders> getAllOrders() {
		String qstr="SELECT orders from Orders orders ";
		TypedQuery<Orders> query=entityManager.createQuery(qstr,Orders.class);
		return query.getResultList();
	}

}
