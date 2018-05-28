package com.ssm.Service.ServiceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.Mapper.OrderMapper;
import com.ssm.Po.Order;
import com.ssm.Service.OrderService;
@Service
public class OrderServiceImp implements OrderService {
  @Resource
  private OrderMapper orderMapper;
	
	@Override
	public void createOrder(Order order) {
		// TODO Auto-generated method stub
		orderMapper.createOrder(order);
	}

	@Override
	public List<Order> getOrderByUser(int userId) {
		// TODO Auto-generated method stub
		return orderMapper.getOrderByUser(userId);
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderMapper.getAllOrder();
	}

	@Override
	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		orderMapper.deleteOrder(orderId);
	}

}
