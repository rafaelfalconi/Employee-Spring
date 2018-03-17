package com.rafael.falconi.Employee.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.falconi.Employee.controllers.EmployeeController;
import com.rafael.falconi.Employee.dtos.EmployeeDto;

@RestController
@RequestMapping(EmployeeResource.EMPLOYEES)
public class EmployeeResource {

	public static final String EMPLOYEES = "/employees";
	public static final String ID = "/{id}";
	@Autowired
	private EmployeeController employeeController;

	@RequestMapping(method = RequestMethod.GET)
	public List<EmployeeDto> readEmployeeAll() {
		return this.employeeController.readEmployeeAll();
	}
}