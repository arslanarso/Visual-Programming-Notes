package pack1;

import java.util.ArrayList;

public class Department {
	
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Course> courses = new ArrayList<Course>();
	String title;
	Integer  deptID;

	
	
	public void addStudent(Student stu) {
		
		this.students.add(stu);
	}
	public void addCourse(Course course) {
		
		this.courses.add(course);
	}
	

	

	

}
