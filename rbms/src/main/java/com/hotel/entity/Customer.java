package com.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	

	 public Customer() {
		super();
	}
	@Id
	    private String id;
	     
	public String getId() {
		return id;
	}
	public Customer(String id,String firstName, String lastName, String dob, String email, String password) {
			super();
			this.id=id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dob = dob;
			this.email = email;
			this.password = password;
		}
	private void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	private void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	private void setPassword(String password) {
		this.password = password;
	}
		private String firstName;
	    private String lastName;
	    private String dob;
	    private String email;
	    private String password;
	
}
