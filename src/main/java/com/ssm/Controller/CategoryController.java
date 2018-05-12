package com.ssm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.Po.Category;
import com.ssm.Service.CategoryService;
import com.ssm.dbo.ItemCustom;

@Controller
@RequestMapping(value="/category.do")
public class CategoryController {
   @Autowired
   private CategoryService categoryService;
   
   @RequestMapping(value="/getAllByCategoryId/{categoryId}.do")
   public ModelAndView getAllByCategoryId(@PathVariable("categoryId")int categoryId,ModelAndView mv) {
    List<ItemCustom> categories=categoryService.getAllByCategoryId(categoryId);
    mv.addObject("categories",categories);
    mv.addObject("parentId", categoryId);
    mv.setViewName("list");
	return mv;
   }
   
   @RequestMapping(value="/getAll.do")
   public ModelAndView getAll(ModelAndView mv) {
	   List<Category>categoryList=categoryService.getAll();
	   mv.addObject("categoryList", categoryList);
	return mv;
	   
   }
   
}
