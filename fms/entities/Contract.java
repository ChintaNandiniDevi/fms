package com.cap.fms.entities;

public class Contract {
	private String contractNumber;
	private String deliveryPlace;
	private String deliveryDate;
	private String quantity;
    public Contract() {
	}
	public Contract(String contractNumber, String deliveryPlace, String deliveryDate, String quantity) {
		super();
		this.contractNumber = contractNumber;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getDeliveryPlace() {
		return deliveryPlace;
	}
	public void setDeliveryPlace(String deliveryPlace) {
		this.deliveryPlace = deliveryPlace;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}