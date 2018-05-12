package com.ssm.Mapper;

import java.util.List;

import com.ssm.Po.Category;
import com.ssm.dbo.ItemCustom;

public interface CategoryMapper {
  List<Category> getAll();
  
  List<ItemCustom> getAllByCategoryId(int id);
}
