package Models;

public class Instructor extends User {
	private String [] givenCourse;
	private String biography;

	public Instructor() {
	}

	public Instructor(String[] givenCourse, String biography) {
		this();
		this.givenCourse = givenCourse;
		this.biography = biography;
	}

	

	public String[] getGivenCourse() {
		return givenCourse;
	}

	public void setGivenCourse(String[] givenCourse) {
		this.givenCourse = givenCourse;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

}
