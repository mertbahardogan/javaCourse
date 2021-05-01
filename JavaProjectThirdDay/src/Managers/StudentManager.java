package Managers;

import Models.User;

import Models.Student;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " student added.");
	}

	@Override
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void getCourses(Student student) {

		for (String course : student.getTakenCourse()) {
			System.out.println(student.getFirstName() + " named student, has these courses: "+course);
		}
	}

}
