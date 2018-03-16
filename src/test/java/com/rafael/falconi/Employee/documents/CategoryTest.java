package com.rafael.falconi.Employee.documents;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rafael.falconi.Employee.documents.Category;

public class CategoryTest {

	@Test
	public void testCategoryList() {
		Category category= new Category();
		category.setTitle("title");
		assertEquals("title", category.getTitle());
	}

}
