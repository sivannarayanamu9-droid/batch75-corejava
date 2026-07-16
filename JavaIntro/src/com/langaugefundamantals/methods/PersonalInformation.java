package com.langaugefundamantals.methods;

import java.util.Scanner;

public class PersonalInformation {
	void getFullName(String firstName, String lastName) {
		System.out.println("Your full name is :" + firstName + " " + lastName);
	}

	void getAge(int age) {
		System.out.println("Your age is :" + age);
	}

	void getWeightAndHeightInformation(float height, double weight) {
		System.out.println("Your weight is :" + weight);
		System.out.println("Your height is :" + height);
	}

	void salaryInfo(double salary) {
		System.out.println("Your salary is :" + salary);
	}

	void getGenderDetails(char c) {
		System.out.println("Your gender is :" + c);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		PersonalInformation objPersonalInformation = new PersonalInformation();
		// String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		objPersonalInformation.getAge(age);

		System.out.println("Enter your weight ");
		double weight = sc.nextDouble();
		System.out.println("Enter your height ");
		float height = sc.nextFloat();
		objPersonalInformation.getWeightAndHeightInformation(height, weight);
		sc.nextLine();
		System.out.println("Enter your first name :");
		String firstName = sc.nextLine();
		System.out.println("Enter Your last name ");
		String lastName = sc.nextLine();
		objPersonalInformation.getFullName(firstName, lastName);
		System.out.println("Enter Your salary :");
		double salary = sc.nextDouble();
		objPersonalInformation.salaryInfo(salary);
		System.out.println("Enter your gender :");
		char gender = sc.next().charAt(0);// method chaining
		objPersonalInformation.getGenderDetails(gender);
		// String s =new String();
//		Scanner sc = new Scanner();

		System.out.println("main method ended");

	}

}
