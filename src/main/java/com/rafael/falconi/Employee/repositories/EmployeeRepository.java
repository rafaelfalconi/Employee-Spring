package com.rafael.falconi.Employee.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rafael.falconi.Employee.documents.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	public Employee findById(String id);
}
