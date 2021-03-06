package com.rafael.falconi.Employee.dtos;

import com.rafael.falconi.Employee.documents.Category;

public class CategoryDto {
	private String id;

	private int rank;

	private String title;

	public CategoryDto() {
		// Empty for framework
	}

	public CategoryDto(Category category) {
		super();
		this.id = category.getId();
		this.title = category.getTitle();
		this.rank = category.getRank();
	}

	public CategoryDto(String id, int rank, String title) {
		super();
		this.id = id;
		this.rank = rank;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", rank=" + rank + ", title=" + title + "]";
	}

}
