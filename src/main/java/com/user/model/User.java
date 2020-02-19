package com.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int Id;
	@Column(name="NAME")
	String name;
	@Column(name="AGE")
	int age;
	@Column(name="PHONE")
	String phone;
	@Column(name="EMAIL")
	String email;
	public User() {
		
	}
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	

	public User(int id, String name, int age, String phone, String email) {

		Id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email + "]";
	}

}
