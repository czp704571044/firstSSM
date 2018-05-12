package com.ssm.Service;

import java.util.List;

import com.ssm.dbo.OrderCustom;

public interface OrderService {
   public OrderCustom createOrder(OrderCustom orderCustom);
   
   public List<OrderCustom>getOrder(int id);
}
