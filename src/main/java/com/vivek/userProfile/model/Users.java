package com.vivek.userProfile.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "userInfo" , catalog = "USERPROFILE")
public class Users {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userID;
	@NotBlank
	private String firstName;
	private String lastName;
	@Temporal(TemporalType.TIMESTAMP)
	@NotBlank
	private Date dob;
	@NotBlank
	private String emailID;
	@NotBlank
	private String password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserID() {
		return userID;
	}
	
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public Users() {
		
	}
	public Users(String firstName, String lastName, Date dob, String emailID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.emailID = emailID;
	}
	@Override
	public String toString() {
		return "Users [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", emailID=" + emailID + "]";
	}

}
