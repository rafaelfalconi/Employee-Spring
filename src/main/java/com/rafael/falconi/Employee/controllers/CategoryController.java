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

	public void createCategory(CategoryDto categoryDto) {
		Category category = new Category(categoryDto.getId(), categoryDto.getRank(), categoryDto.getTitle());
		this.categoryRepository.save(category);
	}

	public boolean putCategory(String id, CategoryDto categoryDto) {
		Category category = this.categoryRepository.findById(id);
		assert category != null;
		category.setRank(categoryDto.getRank());
		category.setTitle(categoryDto.getTitle());
		this.categoryRepository.save(category);
		return true;
	}

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
