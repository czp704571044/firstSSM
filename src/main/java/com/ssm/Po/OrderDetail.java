package com.ssm.Po;

public class OrderDetail {
	 private int detailId;
	 private int number;
	 private double cost;
	 private int orderId;
	 private int itemId;
	@Override
	public String toString() {
		return "OrderDetail [detailId=" + detailId + ", number=" + number + ", cost=" + cost + ", orderId=" + orderId
				+ ", itemId=" + itemId + "]";
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
}
