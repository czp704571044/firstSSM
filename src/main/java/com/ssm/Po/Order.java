package com.ssm.Po;

import java.util.Date;
import java.util.List;

public class Order {
private int orderId;
 private Date createTime;
 private Double totalCost;
 private int userId;
 private int itemId;
 private Item item;
 private User user;
 private int number;
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", createTime=" + createTime + ", totalCost=" + totalCost + ", userId="
			+ userId + ", itemId=" + itemId + ", item=" + item + ", user=" + user + ", number=" + number + "]";
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public Double getTotalCost() {
	return totalCost;
}
public void setTotalCost(Double totalCost) {
	this.totalCost = totalCost;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
}
