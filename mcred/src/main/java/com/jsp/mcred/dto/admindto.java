package com.jsp.mcred.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class admindto {
	@Id
private int id;
private String email;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "admindto [id=" + id + ", email=" + email + ", password=" + password + "]";
}
}
