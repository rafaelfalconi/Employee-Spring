package com.rafael.falconi.Employee.dtos;

import javax.validation.constraints.NotNull;

public class CategoryMinimunDto {
	private String id;
	@NotNull
	private String title;
	
	public CategoryMinimunDto() {
		
	}
	
	public CategoryMinimunDto(String id, String title) {
		this.id = id;
		this.title = title;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "id=" + id + ", title=" + title;
	}
	
}
