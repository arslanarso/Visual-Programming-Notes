package pack1;

import javax.swing.JOptionPane;

public class WorkShop02 {

	public static void main(String[] args) {
		

		String name = JOptionPane.showInputDialog("What is your name?");
		
		
		
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Your Age"));
		
		JOptionPane.showMessageDialog(null, "Hello, " + name+" your age is  "+ age,"Java",JOptionPane.QUESTION_MESSAGE);

	}

}
