package com.rafael.falconi.Employee.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.rafael.falconi.Employee.documents.Category;
import com.rafael.falconi.Employee.dtos.CategoryDto;

public interface CategoryRepository extends MongoRepository<Category, String>{
	
	public Category findById(Long id);
	
	@Query(value = "{'id' : ?0}", fields = "{'id':1,'rank' : 1, 'title' : 'title'}")
	List<CategoryDto> findCategoryAll();

}
