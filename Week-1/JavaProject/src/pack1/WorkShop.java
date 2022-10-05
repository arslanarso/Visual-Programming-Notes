package pack1;

import java.util.Scanner;

public class WorkShop {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = scan.nextLine();
		
		
		System.out.println("Enter your Age : ");
		int age = scan.nextInt();
		
		System.out.println("Hello, "+ name + " " + "Your age is : " + age);

	}

}
