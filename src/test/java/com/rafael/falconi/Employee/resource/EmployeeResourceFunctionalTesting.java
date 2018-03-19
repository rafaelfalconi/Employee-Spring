package com.rafael.falconi.Employee.resource;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.rafael.falconi.Employee.documents.Area;
import com.rafael.falconi.Employee.dtos.CategoryDto;
import com.rafael.falconi.Employee.dtos.EmployeeDto;
import com.rafael.falconi.Employee.resources.EmployeeResource;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:test.properties")
public class EmployeeResourceFunctionalTesting {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Autowired
	private RestService restService;
	private EmployeeDto employeeDto;
	private CategoryDto categoryDto;

	@Before
	public void before() {
		this.categoryDto = new CategoryDto("45", 5546, "rank4");
		this.employeeDto = new EmployeeDto("1", "1212", true, this.categoryDto, Area.Marketing);
	}

	@Test
	public void testCreateEmployee() {
		restService.restBuilder().path(EmployeeResource.EMPLOYEES).body(this.employeeDto).post().build();
	}

	@Test
	public void testPutEmployee() {
		restService.restBuilder().path(EmployeeResource.EMPLOYEES).body(this.employeeDto).post().build();
		this.employeeDto.setSurname("surname");
		System.out.println(this.employeeDto.toString());
		restService.restBuilder().path(EmployeeResource.EMPLOYEES).path(EmployeeResource.ID)
				.expand(this.employeeDto.getId()).body(this.employeeDto).put().build();
	}

	@Test
	public void testEmployeeAll() {
		String json = restService.restBuilder(new RestBuilder<String>()).clazz(String.class)
				.path(EmployeeResource.EMPLOYEES).get().build();
		System.out.println("------>" + json);
	}

	@Test
	public void testEmployeeRead() {
		String json = restService.restBuilder(new RestBuilder<String>()).path(EmployeeResource.EMPLOYEES)
				.path(EmployeeResource.ID).expand("id").get().build();
		System.out.println("------------>" + json);
	}

}
