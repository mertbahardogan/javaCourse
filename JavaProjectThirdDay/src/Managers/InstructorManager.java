package Managers;

import Models.Instructor;
import Models.User;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " instructor added.");
	}
	
	@Override
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void getCourses(Instructor instructor) {
		for (String course : instructor.getGivenCourse()) {
			System.out.println(instructor.getFirstName() + " named instructor, has these courses: "+course);
		}
	}

}
