package com.rafael.falconi.Employee.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Employee.documents.Category;
import com.rafael.falconi.Employee.dtos.CategoryDto;
import com.rafael.falconi.Employee.repositories.CategoryRepository;

@Controller
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	public Optional<CategoryDto> readCategory(String id) {
		Category categoryBD = this.categoryRepository.findById(id);
		if (categoryBD == null) {
			return Optional.empty();
		} else {
			return Optional.of(new CategoryDto(categoryBD));
		}
	}

	public List<CategoryDto> readCategoryAll() {
		List<Category> categoryList = this.categoryRepository.findAll();
		List<CategoryDto> categoryListDto = new ArrayList<CategoryDto>();
		for (Category category : categoryList) {

			categoryListDto.add(new CategoryDto(category.getId(), category.getRank(), category.getTitle()));

		}
		return categoryListDto;
	}

}
