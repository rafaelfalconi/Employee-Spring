package com.rafael.falconi.Employee.documents;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.rafael.falconi.Employee.documents.Category;
import com.rafael.falconi.Employee.documents.Employee;

@Document
public class Enroll {
    @DBRef
    private Category category;

    @DBRef
    private Employee employee;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Enroll() {

    }

    public Enroll(Category category, Employee employee) {
        super();
        this.category = category;
        this.employee = employee;
    }

}
