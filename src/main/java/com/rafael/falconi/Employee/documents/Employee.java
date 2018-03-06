package com.rafael.falconi.Employee.documents;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.rafael.falconi.Employee.documents.Category;

@Document
public class Employee {
    @Id
    private int id;

    private String surname;

    @DateTimeFormat(iso = ISO.DATE)
    private Calendar entry;

    private Boolean active;

    @DBRef
    private Category category;

    public Employee() {

    }

    public Employee(String surname, Category category) {
        this.category = category;
        this.surname = surname;
    }

    public Employee(int id, String surname, Category category) {

        this.category = category;
        this.id = id;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Calendar getEntry() {
        return entry;
    }

    public void setEntry(Calendar entry) {
        this.entry = entry;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void getDate() {
        // this.getEntry().setTime(date);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", surname=" + surname + ", entry=" + entry + ", active=" + active + ", category=" + category + "]";
    }
}