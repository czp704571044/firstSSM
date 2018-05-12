package com.ssm.Po;

import java.util.Date;

public class Order {
 private int orderId;
 private String name;
 private Date createTime;
 private double totalCost;
 private int status;
 private int userId;
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", name=" + name + ", createTime=" + createTime + ", totalCost=" + totalCost
			+ ", status=" + status + ", userId=" + userId + "]";
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public double getTotalCost() {
	return totalCost;
}
public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
}
