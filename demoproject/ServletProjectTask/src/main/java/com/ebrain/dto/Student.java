package com.ebrain.dto;

public class Student {

	private Integer id;
	private String name;
	private String phone;
	private String  email;
	private String address;
	private String  department;
	private Double cgpa;
	
	
	
	public Student(Integer student_id, String student_name, String student_phone, String student_email, String student_address, String student_department, Double student_cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.department = department;
		this.cgpa = cgpa;
	}



	public int getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public double getCgpa() {
		return cgpa;
	}



	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
}
	