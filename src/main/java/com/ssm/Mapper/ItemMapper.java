package com.ssm.Mapper;

import java.util.List;

import com.ssm.Po.Item;

public interface ItemMapper {
	
  Item findItemById(int itemId);
  
  Item findItemsByName(String itemName);
  
  void addItems(Item item);
  
  List<Item> queryAllItems();
  
  void deleteItem(int id);
  
  void updateItem(Item item);
}
