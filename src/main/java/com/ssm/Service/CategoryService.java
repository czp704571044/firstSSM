package com.ssm.Service;

import java.util.List;

import com.ssm.Po.Category;
import com.ssm.dbo.ItemCustom;

public interface CategoryService {
 
	public List<Category> getAll();
	
	public List<ItemCustom>  getAllByCategoryId(int id);
	
}
