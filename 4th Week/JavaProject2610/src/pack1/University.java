package pack1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class University {
	
	ArrayList<Department> departments = new ArrayList<Department>();
	
	
	public String getString(String message) {
		return JOptionPane.showInputDialog(message);
	}
	
	public int getINT(String message) {
			return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
	
	public void newDepartments() {
		Department dept = new Department();
		dept.deptID = getINT("Department ID");
		dept.title = getString("Title : ");
		departments.add(dept);

			
	}
	
	public void getDepartments() {
		for (Department d : departments) {
			System.out.println(d.deptID+ " "+ d.title+" "+"Number of Student: "+ d.students.size()+" "+"Number of Courses : "+ d.courses.size());
		}
		
	}
	
	public void getDepartmentBydeptID(int deptID) {
		for (Department d : departments) {
			if (d.deptID == deptID) {
				System.out.println(d.deptID+ " "+ d.title+" "+"Number of Student: "+ d.students.size()+" "+"Number of Courses : "+ d.courses.size());

			}
		}
		
	}
	
	public void getStudents() {
		
		
	}
	
	public void getStudentBydeptID(int deptID) {
		
		
	}
	
	public void getCourses() {
		
		
	}
	
	public void getCoursesBydeptID(int deptID) {
		
		
	}
	
	public void newStudent() {
		Student stu = new Student(getINT("ID : "), getString("Name : "), getString("Surname : "), getINT("Dept ID : "));
		
	}
	
	public void newCourse() {
		
	}



	public static void main(String[] args) {
		

		University univ = new University();
		univ.newDepartments();
		univ.newDepartments();

		univ.getDepartments();

	}

}
