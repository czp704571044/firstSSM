package com.ssm.Mapper;

import java.util.List;

import com.ssm.Po.Item;

public interface ItemMapper {
	 void addItem(Item item);
	 
     void deleteItem(int id);
	 
	 List<Item> findAllItem();
	 
	 Item findItemById(int id);
	 
     void updateItem(int id);
}
