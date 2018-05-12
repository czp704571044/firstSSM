package com.ssm.dbo;

import com.ssm.Po.Category;
import com.ssm.Po.Item;

public class ItemCustom {
   private Item item;
   private Category category;
   private int number;
@Override
public String toString() {
	return "ItemCustom [item=" + item + ", category=" + category + ", number=" + number + "]";
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
}
