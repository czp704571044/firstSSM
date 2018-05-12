package com.ssm.Po;

public class Category {
  private int categoryId;
  private String name;
  private String description;
  private  int parentId;
@Override
public String toString() {
	return "Category [categoryId=" + categoryId + ", name=" + name + ", description=" + description + ", parentId="
			+ parentId + "]";
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
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
public int getParentId() {
	return parentId;
}
public void setParentId(int parentId) {
	this.parentId = parentId;
}
}
