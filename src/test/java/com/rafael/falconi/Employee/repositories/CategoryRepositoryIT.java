package com.rafael.falconi.Employee.repositories;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rafael.falconi.Employee.documents.Category;
import com.rafael.falconi.Employee.repositories.CategoryRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryRepositoryIT {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Before
	public void populate() {
		this.categoryRepository.deleteAll();
		for(int i=0;i<5;i++) {
			this.categoryRepository.save(new Category(Long.valueOf(i),i,"rank"+i));
		}
	}
	@Test
	public void findAny() {
		System.out.println("lo que existe==>>>"+categoryRepository.findAll().toString());
		
	}

}
