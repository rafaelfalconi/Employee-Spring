package com.rafael.falconi.Employee.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Category {
    @Id
    private String id;

    private int rank;

    private String title;

    public Category() {

    }

    public Category(int rank, String title) {
        this.rank = rank;
        this.title = title;
    }

    public Category(String id, int rank, String title) {
        super();
        this.id = id;
        this.rank = rank;
        this.title = title;
    }

    public String getId() {
        return id;
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