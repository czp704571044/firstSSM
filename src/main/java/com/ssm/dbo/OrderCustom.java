package com.ssm.dbo;

import java.util.List;

import com.ssm.Po.Order;
import com.ssm.Po.User;

public class OrderCustom {
	 private Order order;
	 private User user;
	 private List<ItemCustom>ItemCustomList;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<ItemCustom> getItemCustomList() {
		return ItemCustomList;
	}
	public void setItemCustomList(List<ItemCustom> itemCustomList) {
		ItemCustomList = itemCustomList;
	}
	@Override
	public String toString() {
		return "OrderCustom [order=" + order + ", user=" + user + ", ItemCustomList=" + ItemCustomList + "]";
	}
	 
}
