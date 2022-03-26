package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Land;

public interface LandService {
	Land getLand(String surveyNumber);// String ownerName
	boolean addLand(Land land);//Land land
	boolean updateLand(Land land);//Land land
	boolean removeLandDetails(String surveyNumber);//String surveyNumber
	List<Land> getAllLands();
}
