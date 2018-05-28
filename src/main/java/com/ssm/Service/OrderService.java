package com.ssm.Service;

import java.util.List;

import com.ssm.Po.Order;


public interface OrderService {

 public 	void createOrder(Order order);
	
 public	List<Order> getOrderByUser(int userId);
	
  public List<Order> getAllOrder();
	
 public	void deleteOrder(int orderId);
}
