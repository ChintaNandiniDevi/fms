package com.cap.fms.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.cap.fms.dao.ISchedulerDaoImpl;
import com.cap.fms.entities.Scheduler;
import com.cap.fms.repository.ISchedularDao;
import com.cap.fms.util.JPAUtil;

public class SchedulerServiceImpl implements SchedulerService {
	EntityTransaction transaction;
	ISchedularDao repo;
	
	public SchedulerServiceImpl()
	{
		repo=new ISchedulerDaoImpl();
		transaction=JPAUtil.getEntityManager().getTransaction();
	}

	public Scheduler getScheduler(String schedulerName ) {
		transaction.begin();
		Scheduler scheduler= repo.getSheduler(schedulerName);
		transaction.commit();
		return scheduler;
	}

	public boolean addScheduler(Scheduler scheduler) {
		transaction.begin();
		boolean bool= repo.addScheduler(scheduler);
		transaction.commit();
		return bool;
	}

	public boolean updateScheduler(Scheduler scheduler) {
		transaction.begin();
		boolean bool= repo.updateScheduler(scheduler);
		transaction.commit();
		return bool;
	}

	public boolean deleteScheduler(String schedulerName) {
		transaction.begin();
		boolean bool= repo.deleteScheduler(schedulerName);
		transaction.commit();
		return bool;
	}

	public List<Scheduler> getAllSchedulers() {
		transaction.begin();
		List<Scheduler> schedulerList=repo.getAllSchedulers();
		transaction.commit();
		return schedulerList;
	}

}
