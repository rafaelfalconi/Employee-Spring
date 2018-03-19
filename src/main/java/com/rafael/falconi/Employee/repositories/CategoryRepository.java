package com.rafael.falconi.Employee.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rafael.falconi.Employee.documents.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

	public Category findById(String id);

	public Category findByTitle(String title);

}
