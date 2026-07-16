package com.langaugefundamantals.methods;

import java.util.Scanner;

public class StudentResult {
	void displayStudent(String name) {
		System.out.println("Your name is :" + name);
	}

	void calculateTotal(int m1, int m2, int m3) {
		int totlMarks = m1 + m2 + m3;
		System.out.println("************Total Marks of Student******************");
		System.out.println("Your Total marks  are :" + totlMarks);
	}

	void calculateAverage(int m1, int m2, int m3) {
		double avgMarks = m1 + m2 + m3/3;
		System.out.println("************Average Marks of Student******************");
		System.out.println("Your average marks are :" + avgMarks);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		StudentResult objStudentResult = new StudentResult();
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		objStudentResult.displayStudent(name);
		System.out.println("Enter m1 marks :");
		int m1 = sc.nextInt();
		System.out.println("Enter m2 marks :");
		int m2 = sc.nextInt();
		System.out.println("Enter m2 marks :");
		int m3 = sc.nextInt();
		objStudentResult.calculateTotal(m1, m2, m3);
		objStudentResult.calculateAverage(m1, m2, m3);
		System.out.println("main method ended");

	}

}
