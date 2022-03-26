package com.cap.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cap.fms.entities.Scheduler;
import com.cap.fms.repository.ISchedularDao;
import com.cap.fms.util.JPAUtil;

public class ISchedulerDaoImpl implements ISchedularDao {
	EntityManager entityManager;
	
	public ISchedulerDaoImpl()
	{
		super();
		entityManager=JPAUtil.getEntityManager();
	}

	public Scheduler getSheduler(String schedulerName) {
		String qstr="SELECT scheduler FROM Scheduler scheduler WHERE schedulerName LIKE:pschedulerName";
		TypedQuery<Scheduler> query=entityManager.createQuery(qstr,Scheduler.class);
		query.setParameter("pscheduler", schedulerName);
		return query.getSingleResult();
	}

	public boolean addScheduler(Scheduler scheduler) {
		try
		{
			entityManager.persist(scheduler);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean updateScheduler(Scheduler scheduler) {
		try {
		entityManager.merge(scheduler);
		return true;
		}
		catch(Exception e) {
		return false;
		}
	}

	public boolean deleteScheduler(String schedulerName) {
		try {
			String qstr="SELECT scheduler FROM Scheduler scheduler WHERE schedulerName LIKE:pschedulerName";
			TypedQuery<Scheduler> query=entityManager.createQuery(qstr,Scheduler.class);
			query.setParameter("pscheduler", schedulerName);
			entityManager.remove( query.getSingleResult());
			return true;
			}
			catch(Exception exception) {
			return false;
			}
	}

	public List<Scheduler> getAllSchedulers() {
		String qstr="SELECT scheduler from Scheduler scheduler ";
		TypedQuery<Scheduler> query=entityManager.createQuery(qstr,Scheduler.class);
		return query.getResultList();
	}

}
