package com.rafael.falconi.Employee.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.falconi.Employee.controllers.CategoryController;
import com.rafael.falconi.Employee.dtos.CategoryDto;

@RestController
@RequestMapping
public class CategoryResource {
	
	public static final String CATEGORIES = "/categories";
	
	public static final String ID = "/{id}";
	
	@Autowired
	private CategoryController categoryController;
	
	@GetMapping
	public List<CategoryDto> readCategoryAll(){
		return this.categoryController.readCategoryAll();
	}

}
