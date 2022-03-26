package com.cap.fms.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.cap.fms.dao.ILandDaoImpl;
import com.cap.fms.entities.Land;
import com.cap.fms.repository.ILandDao;
import com.cap.fms.util.JPAUtil;

public class LandServiceImpl implements LandService {
	
	EntityTransaction transaction;
	ILandDao repo;
	
	public LandServiceImpl()
	{
		repo=new ILandDaoImpl();
		transaction=JPAUtil.getEntityManager().getTransaction();
	}
	
	public Land getLand(String surveyNumber) {
		transaction.begin();
		Land land=repo.getLand(surveyNumber);
		transaction.commit();
		return land;
	}

	public boolean addLand(Land land) {
		transaction.begin();
		boolean bool =repo.addLand(land);
		transaction.commit();
		return bool;
	}

	public boolean updateLand(Land land) {
		transaction.begin();
		boolean bool =repo.updateLand(land);
		transaction.commit();
		return bool;
	}

	public boolean removeLandDetails(String surveyNumber) {
		transaction.begin();
		boolean bool =repo.deleteLand(surveyNumber);
		transaction.commit();
		return bool;
	}

	public List<Land> getAllLands() {
		transaction.begin();
		List<Land> landList=repo.getAllLands();
		transaction.commit();
		return landList;
	}

}
