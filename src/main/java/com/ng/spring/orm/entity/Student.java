package com.ng.spring.orm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_hibernate")
public class Student {
	
	@Id
	@Column(name = "h_id")
	private int id;
	
	@Column(name = "h_name")
	private String name;
	
	@Column(name = "h_address")
	private String address;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public String getAddress() {
	
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
