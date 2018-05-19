package com.ssm.Po;


public class Item {
  private  int itemId;
  private  String name;
  private  String description;
  private  double price;
  private  int stock; 
  private  String img;
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
@Override
public String toString() {
	return "Item [itemId=" + itemId + ", name=" + name + ", description=" + description + ", price=" + price
			+ ", stock=" + stock + ", img=" + img + "]";
}



}
