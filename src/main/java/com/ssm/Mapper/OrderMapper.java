package com.ssm.Mapper;

import java.util.List;

import com.ssm.Po.Order;

public interface OrderMapper {
 
	void createOrder(Order order);
	
	List<Order> getOrderByUser(int userId);
	
	List<Order> getAllOrder();
	
	void deleteOrder(int orderId);
	
    
}
