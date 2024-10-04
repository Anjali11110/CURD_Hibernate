package com.example.mavenproject.CURD_Using_Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
@Column(name="Student_Name")
  private String name;
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int rollNo;
  @Column
  private long phoneNumber;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
	public String toString() {
		return "User [name=" + name + ", rollNo=" + rollNo + ", phoneNumber=" + phoneNumber + "]";
	}
}
