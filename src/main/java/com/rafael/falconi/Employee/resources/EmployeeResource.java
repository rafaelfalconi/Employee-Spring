package com.rafael.falconi.Employee.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.falconi.Employee.controllers.EmployeeController;
import com.rafael.falconi.Employee.dtos.EmployeeDto;
import com.rafael.falconi.Employee.resources.exeptions.EmployeeCodeNotFoundException;

@RestController
@RequestMapping(EmployeeResource.EMPLOYEES)
public class EmployeeResource {

	public static final String EMPLOYEES = "/employees";
	public static final String ID = "/{id}";
	@Autowired
	private EmployeeController employeeController;

	@PostMapping
	public void createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
		this.employeeController.createEmployee(employeeDto);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<EmployeeDto> readEmployeeAll() {
		return this.employeeController.readEmployeeAll();
	}

	@RequestMapping(value = ID, method = RequestMethod.GET)
	public EmployeeDto readCategory(@PathVariable String id) throws EmployeeCodeNotFoundException {
		return this.employeeController.readEmployee(id).orElseThrow(() -> new EmployeeCodeNotFoundException(id));

	}
}
