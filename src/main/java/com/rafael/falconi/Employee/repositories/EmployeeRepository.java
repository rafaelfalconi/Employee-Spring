package com.rafael.falconi.Employee.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<EmployeeRepository, String> {

}
