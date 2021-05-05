package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class User implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalId;
	private boolean isValid;

	public User() {
	}

	public User(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalId,boolean isValid) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
		this.isValid=isValid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public boolean getIsValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "Info: [ID=" + id + ", Name=" + firstName + lastName +"Date of Birth=" + dateOfBirth + "]";
	}

}
