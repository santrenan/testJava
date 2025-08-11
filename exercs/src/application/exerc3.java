package application;

import java.util.Scanner;

import entities.Student;

public class exerc3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Student name: ");
		student.name = sc.nextLine();
		
		System.out.println("Enter grades:");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("FINAL GRADE = " + student.finalGrade());
		student.isApproved();
		
	}

}
