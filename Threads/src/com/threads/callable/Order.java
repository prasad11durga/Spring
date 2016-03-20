package com.threads.callable;

public class Order {
	private OrderState orderState;
	private int orderNumber;

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public OrderState getOrderState() {
		return orderState;
	}

	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}
}

enum OrderState{
	NEW, FULFILLED;
}
