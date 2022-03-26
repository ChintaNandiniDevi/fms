package com.cap.fms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Land {
	@Id
	@SequenceGenerator(
            name = "land_sequence",
            sequenceName = "land_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "land_sequence"
    )
	private int landid;
	private String surveyNumber;
	private String ownerName;
	private String landArea;
//	public Land() {}
//	
//	public Land(int landid, String surveyNumber, String ownerName, String landArea) {
//		super();
//		this.landid = landid;
//		this.surveyNumber = surveyNumber;
//		this.ownerName = ownerName;
//		this.landArea = landArea;
//	}

//	public int getLandid() {
//		return landid;
//	}
//	public void setLandid(int landid) {
//		this.landid = landid;
//	}
//	public String getSurveyNumber() {
//		return surveyNumber;
//	}
//	public void setSurveyNumber(String surveyNumber) {
//		this.surveyNumber = surveyNumber;
//	}
//	public String getOwnerName() {
//		return ownerName;
//	}
//	public void setOwnerName(String ownerName) {
//		this.ownerName = ownerName;
//	}
//	public String getLandArea() {
//		return landArea;
//	}
//	public void setLandArea(String landArea) {
//		this.landArea = landArea;
//	}
}
