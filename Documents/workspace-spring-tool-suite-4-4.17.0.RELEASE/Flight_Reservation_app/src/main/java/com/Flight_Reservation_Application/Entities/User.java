package com.Flight_Reservation_Application.Entities;

import jakarta.persistence.Entity;

@Entity
public class User extends AbstractEntity{

private String firstnameString;
private String lastNameString;
private String email;
private String passwordString;

public String getFirstnameString() {
	return firstnameString;
}
public void setFirstnameString(String firstnameString) {
	this.firstnameString = firstnameString;
}
public String getLastNameString() {
	return lastNameString;
}
public void setLastNameString(String lastNameString) {
	this.lastNameString = lastNameString;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPasswordString() {
	return passwordString;
}
public void setPasswordString(String passwordString) {
	this.passwordString = passwordString;
}

	
	
}
