package com.rafael.falconi.Employee.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Employee.documents.Employee;
import com.rafael.falconi.Employee.dtos.CategoryDto;
import com.rafael.falconi.Employee.dtos.EmployeeDto;
import com.rafael.falconi.Employee.repositories.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<EmployeeDto> readEmployeeAll() {
		List<Employee> employeeList = this.employeeRepository.findAll();
		List<EmployeeDto> employeeListDto = new ArrayList<EmployeeDto>();
		for (Employee employee : employeeList) {
			CategoryDto category = new CategoryDto(employee.getCategory().getId(), employee.getCategory().getRank(),
					employee.getCategory().getTitle());
			employeeListDto.add(new EmployeeDto(employee.getId(), employee.getSurname(), employee.getActive(), category,
					employee.getArea()));

		}
		return employeeListDto;
	}

	public Optional<EmployeeDto> readEmployee(String id) {
		Employee employeeBD = this.employeeRepository.findById(id);
		if (employeeBD == null) {
			return Optional.empty();
		} else {
			return Optional.of(new EmployeeDto(employeeBD));
		}
	}

}
