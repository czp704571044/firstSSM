package com.ssm.Service.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.Mapper.OrderMapper;
import com.ssm.Service.OrderService;
import com.ssm.dbo.OrderCustom;

public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
	
	@Override
	public OrderCustom createOrder(OrderCustom orderCustom) {
		// TODO Auto-generated method stub
		return orderMapper.insertOrder(orderCustom);
	}

	@Override
	public List<OrderCustom>  getOrder(int id) {
		// TODO Auto-generated method stub
		return orderMapper.getOrder(id);
	}

}
