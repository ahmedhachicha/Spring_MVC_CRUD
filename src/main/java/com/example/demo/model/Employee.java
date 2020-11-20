package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
	@Column(name="firstname")
private String name;
	@Column(name="last_name")
private String lastname;
	@Column(name="email")
private String email;

public Employee(long id, String name, String last_name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = last_name;
	this.email = email;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String last_name) {
	this.lastname = last_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
