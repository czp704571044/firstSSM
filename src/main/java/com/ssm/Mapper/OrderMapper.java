package com.ssm.Mapper;

import java.util.List;

import com.ssm.dbo.OrderCustom;

public interface OrderMapper {
  OrderCustom insertOrder(OrderCustom orderCustom);
  
  List<OrderCustom> getOrder(int id);
}
