package com.rafael.falconi.Employee.repositories;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rafael.falconi.Employee.documents.Area;
import com.rafael.falconi.Employee.documents.Category;
import com.rafael.falconi.Employee.documents.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryIT {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void findAny() throws ParseException {
		Category category = this.categoryRepository.findById("1");
		//System.out.println("category=====>"+category.getTitle());
		Employee employee = new Employee("id", "surname", true, category, Area.Finansas);
		this.employeeRepository.save(employee);
		System.out.println("employee====>" + employeeRepository.findAll().toString());

	}

}
