package com.rafael.falconi.Employee.repositories;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
    CategoryRepositoryIT.class,
    EmployeeRepositoryIT.class
})
public class AllRafaelCoreIntegreationTests {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
