package com.rafael.falconi.Employee.dtos;

public class CategoryDto {
	private Long id;

	private int rank;

	private String title;

	public CategoryDto() {
		// Empty for framework
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return "CategoryDto [id=" + id + ", rank=" + rank + ", title=" + title + "]";
	}
	
	
}
