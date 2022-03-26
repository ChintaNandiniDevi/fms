package com.cap.fms.repository;

import java.util.List;

import com.cap.fms.entities.Scheduler;

public interface ISchedularDao {
	Scheduler getSheduler(String schedulerName);//String
	boolean addScheduler(Scheduler scheduler);//Scheduler
	boolean updateScheduler(Scheduler scheduler);//Scheduler
	boolean deleteScheduler(String  schedulerName);//String
	List<Scheduler> getAllSchedulers();
}
