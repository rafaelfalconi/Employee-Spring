package com.rafael.falconi.Employee.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rafael.falconi.Employee.documents.Category;

public interface CategoryRepository extends MongoRepository<Category, String>{
	
	List<Category> findAll();

}
