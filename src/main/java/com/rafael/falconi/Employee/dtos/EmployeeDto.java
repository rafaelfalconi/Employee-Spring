package com.rafael.falconi.Employee.dtos;


import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.rafael.falconi.Employee.documents.Area;
import com.rafael.falconi.Employee.documents.Employee;

@JsonInclude(Include.NON_NULL)
public class EmployeeDto {

	private String id;

	private String surname;

	private Date entry;

	private Boolean active;

	@JsonInclude(Include.NON_NULL)
	private CategoryDto categorydto;

	private Area area;

	public EmployeeDto() {

	}

	public EmployeeDto(Employee employee) {
		super();
		this.id = employee.getId();
		this.surname = employee.getSurname();
		this.entry = employee.getEntry();
		this.active = employee.getActive();
		this.categorydto = new CategoryDto(employee.getCategory().getId(), employee.getCategory().getRank(),
				employee.getCategory().getTitle());
		this.area = employee.getArea();
	}

	public EmployeeDto(String id, String surname, Date entry, Boolean active, CategoryDto categorydto, Area area) {
		super();
		this.id = id;
		this.surname = surname;
		this.active = active;
		this.categorydto = categorydto;
		this.area = area;
		this.entry = entry;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getEntry() {
		return entry;
	}

	public void setEntry(Date entry) {
		this.entry = entry;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public CategoryDto getCategorydto() {
		return categorydto;
	}

	public void setCategorydto(CategoryDto categorydto) {
		this.categorydto = categorydto;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@Override
	public String toString() {
		String date="";
		date = new SimpleDateFormat("dd-MMM-yyyy").format(entry.getTime());
		return "EmployeeDto [id=" + id + ", surname=" + surname + ", entry=" + date + ", active=" + active
				+ ", category=" + categorydto.toString() + ", area=" + area + "]";
	}

}
