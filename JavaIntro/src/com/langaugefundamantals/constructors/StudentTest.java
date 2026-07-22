package com.langaugefundamantals.constructors;

public class StudentTest {
	int rollNumber;
	String studentName;
	String course;
	int age;
	double fee;

	// No-arg constructor
	StudentTest() {
		System.out.println("No-arg constructor called");
		rollNumber = 201156;
		studentName = "shiva";
		course = "JFS-B75";
		age = 30;
		fee = 30000;
	}

	// Parameterized constructor
	StudentTest(int rollNumber, String studentName, String course, int age, double fee) {
		System.out.println("parameterized constructor called");
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.course = course;
		this.age = age;
		this.fee = fee;
	}

	void displayStudentInformation() {
		System.out.println("******************Display Student Information******************");
		System.out.println("Student Rollnumber :" + rollNumber);
		System.out.println("Student Name :" + studentName);
		System.out.println("Student Course :" + course);
		System.out.println("Student Age :" + age);
		System.out.println("Student fee :" + fee);
	}

	// instance block
	{
		System.out.println("Instnce block executed");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		StudentTest obj = new StudentTest();
		obj.displayStudentInformation();
		StudentTest obj2 = new StudentTest(201157, "Chandrakala", "JFS-B75", 30, 40000);
		obj2.displayStudentInformation();
		System.out.println("main methode ended");
	}

}
