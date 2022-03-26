package com.cap.fms.repository;

import java.util.List;

import com.cap.fms.entities.Land;


public interface ILandDao {
	Land getLand(String surveyNumber);//String
	boolean addLand(Land land);//Land
	boolean updateLand(Land land);//Land
	boolean deleteLand(String surveyNumber);//String
	List<Land> getAllLands();
}
