package com.rafael.falconi.Employee.resources.exeptions;

public class CategoryCodeNotFoundException extends Exception {

	private static final long serialVersionUID = -7717691994704695707L;

	public static final String DESCRIPTION = "category id not found";

	public CategoryCodeNotFoundException() {
		super(DESCRIPTION);
	}

	public CategoryCodeNotFoundException(String details) {
		super(DESCRIPTION + "." + details);
	}

}
