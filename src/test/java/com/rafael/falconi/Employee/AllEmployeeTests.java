package com.rafael.falconi.Employee;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.rafael.falconi.Employee.repositories.AllRafaelCoreIntegreationTests;
import com.rafael.falconi.Employee.resource.AllRafelFunctionalTestion;

@RunWith(Suite.class)
@SuiteClasses({
	AllRafaelCoreIntegreationTests.class,
	AllRafelFunctionalTestion.class
	
})
public class AllEmployeeTests {

	
}
