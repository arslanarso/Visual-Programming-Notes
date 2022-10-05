package pack1;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class University {

	
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	
	public int getINT (String message) {
		
		
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
	
	public String getString(String message) {
		
		return JOptionPane.showInputDialog(message);
	}
	
	
	
	
	public void display(Student a) {
		
		String details = a.studentId+"\n"+ 
						 a.name+" "+a.surname+"\n"+
						 a.age+"\n"+a.department;
		
		
		JOptionPane.showMessageDialog(null, details);
		
		

	}
	
	public void createSTU() {
		Student stu = new Student(getINT("Your ID : "),
								  getString("Your name : "),
								  getString("Your surname : "),
								  getINT("Your age : "),
								  getString("Your department : "));
		
		students.add(stu);
	}
	
	public void getStudents() {
		for (Student s : students) {
			String details = "Öğrenci Numarası : "+s.studentId+"\n"+"Öğrenci İsmi : "+s.name+"\n"+"Öğrenci Soyadı : "+s.surname+"\n"+ "Yaş : "+s.age+"\n"+"Okuduğu Bölüm : "+s.department; 
			JOptionPane.showMessageDialog(null, details);
			
		}
	}
	
	
	public static void main(String[] args) {
		
		University univ = new University();

		univ.createSTU();
		univ.createSTU();

		univ.getStudents();
		
	}

}
