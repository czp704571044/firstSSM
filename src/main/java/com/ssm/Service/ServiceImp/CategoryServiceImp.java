package com.ssm.Service.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.Mapper.CategoryMapper;
import com.ssm.Po.Category;
import com.ssm.Service.CategoryService;
import com.ssm.dbo.ItemCustom;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryMapper.getAll();
	}

	@Override
	public List<ItemCustom> getAllByCategoryId(int id) {
		// TODO Auto-generated method stub
		return categoryMapper.getAllByCategoryId(id);
	}

}
