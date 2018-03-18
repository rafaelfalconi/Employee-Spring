package com.rafael.falconi.Employee.resources.exeptions;

public class EmployeeCodeNotFoundException extends Exception {
	private static final long serialVersionUID = -7717691994704695707L;

	public static final String DESCRIPTION = "employee id not found";
	public EmployeeCodeNotFoundException() {
		super(DESCRIPTION);
	}

	public EmployeeCodeNotFoundException(String details) {
		super(DESCRIPTION + "." + details);
	}
}
