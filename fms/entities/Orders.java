package com.cap.fms.entities;

public class Orders {
	private String orderNumber;
	private String deliveryPlace;
	private String deliveryDate;
	private String quantity;
	public Orders() {
		
	}
	
	public Orders(String orderNumber, String deliveryPlace, String deliveryDate, String quantity) {
		super();
		this.orderNumber = orderNumber;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
	}

	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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
