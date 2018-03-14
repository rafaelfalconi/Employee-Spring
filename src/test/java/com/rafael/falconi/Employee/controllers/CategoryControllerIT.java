package com.rafael.falconi.Employee.controllers;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class CategoryControllerIT {
	
	@Autowired
	private CategoryController categoryController;
	
	@Test
	public void testReadCategoryVarious() {
		System.out.println(this.categoryController.readCategoryAll().toString());
	}

}
