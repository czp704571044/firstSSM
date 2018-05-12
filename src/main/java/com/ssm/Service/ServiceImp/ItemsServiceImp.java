package com.ssm.Service.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.Mapper.ItemMapper;
import com.ssm.Po.Item;
import com.ssm.Service.ItemsService;
@Service
public class ItemsServiceImp implements ItemsService {
  
	@Autowired
	private ItemMapper itemMapper;
	@Override
	public Item findItemById(int itemId) {
		// TODO Auto-generated method stub
		return itemMapper.findItemById(itemId);
	}
	
	@Override
	public Item findItemsByName(String itemName) {
		// TODO Auto-generated method stub
		return itemMapper.findItemsByName(itemName);
	}
	
	@Override
	public void add(Item item) {
		// TODO Auto-generated method stub
       itemMapper.addItems(item);
	}

	@Override
	public List<Item> queryAllItems() {
		// TODO Auto-generated method stub
		return itemMapper.queryAllItems();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
        itemMapper.deleteItem(id);
	}

	@Override
	public void update(Item item) {
		// TODO Auto-generated method stub
      itemMapper.updateItem(item);
	}

	

}
