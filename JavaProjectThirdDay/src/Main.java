import Managers.InstructorManager;
import Managers.StudentManager;
import Managers.UserManager;
import Models.Instructor;
import Models.Student;
import Models.User;

public class Main {

	public static void main(String[] args) {
		
		String []	takenCources= {"Java"};
		String []	givenCourses= {"Java","C#"};

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Mert");
		student1.setLastName("Bahardoğan");
		student1.setEmail("mbahardogan@hotmail.com");
		student1.setTakenCourse(takenCources);
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		studentManager.getCourses(student1);
		
		 
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Emre");
		student2.setLastName("Doğan");
		student2.setEmail("dogan@hotmail.com");
		student2.setTakenCourse(takenCources);
		
		// If we want to add multiple student, can be active the following codes
		//User[]users= {student1,student2};
		//studentManager.addMultiple(users);
		System.out.println("*********");
		
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engin@demirog.com");
		instructor.setGivenCourse(givenCourses);;
		instructor.setBiography("Yazılım geliştirmeye lisede \"yazılım\" bölümünde okurken başladım.\r\n"
				+ "\r\n"
				+ "");
		
		InstructorManager instrucorManager =new InstructorManager();
		instrucorManager.add(instructor);
		instrucorManager.getCourses(instructor);
	}

}
