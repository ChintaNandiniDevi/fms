package com.cap.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cap.fms.entities.Land;
import com.cap.fms.repository.ILandDao;
import com.cap.fms.util.JPAUtil;

public class ILandDaoImpl implements ILandDao {
	EntityManager entityManager;
	
	public ILandDaoImpl()
	{
		super();
		entityManager=JPAUtil.getEntityManager();
	}

	public Land getLand(String surveyNumber) {
		String qstr="SELECT land from Land land WHERE land.surveyNumber LIKE :psurveyNumber ";
		TypedQuery<Land> query=entityManager.createQuery(qstr,Land.class);
		query.setParameter("psurveyNumber",surveyNumber);
		return query.getSingleResult();
	}

	public boolean addLand(Land land) {
		try {
		 entityManager.persist(land);
		 return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean updateLand(Land land) {
		try {
			 entityManager.merge(land);
			 return true;
			}
			catch(Exception e)
			{
				return false;
			}
	}

	public boolean deleteLand(String surveyNumber) {
		try {
		String qstr="SELECT land from Land land WHERE land.surveyNumber LIKE :psurveyNumber";
		TypedQuery<Land> query=entityManager.createQuery(qstr,Land.class);
		query.setParameter("psurveyNumber",surveyNumber);
		entityManager.remove(query.getSingleResult());
//		Land land = entityManager.find(Land.class, surveyNumber);
//		entityManager.remove(land);
		return true;
		}
		catch(Exception e){
			return false;
		}
	}

	public List<Land> getAllLands() {
		String qstr="SELECT land from Land land ";
		TypedQuery<Land> query=entityManager.createQuery(qstr,Land.class);
		return query.getResultList();
	}

}
