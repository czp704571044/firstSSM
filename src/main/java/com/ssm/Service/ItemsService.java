package com.ssm.Service;

import java.util.List;

import com.ssm.Po.Item;

public interface ItemsService {
	public Item findItemById(int id);
	
	public Item findItemsByName(String name);
	
	public void add(Item item);
	
	public List<Item> queryAllItems();
	
	public void delete(int id);
	
	public void update(Item item);

	
}
