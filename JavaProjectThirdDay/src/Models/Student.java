package Models;

public class Student extends User {
	private String [] takenCourse;

	public Student() {

	}

	public Student(String[] takenCourse) {
		this();
		this.takenCourse = takenCourse;
	}

	public String[] getTakenCourse() {
		return takenCourse;
	}

	public void setTakenCourse(String[] takenCourse) {
		this.takenCourse = takenCourse;
	}

	
}
