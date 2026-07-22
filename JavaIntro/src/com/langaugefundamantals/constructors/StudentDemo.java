package com.langaugefundamantals.constructors;

public class StudentDemo {
	int sid;
	String sname;
	int sage;
	String scity;

	// No argument constructor
	StudentDemo() {
		System.out.println("No argumnent constructor called");
	}

	// Parameterized constructor
	StudentDemo(int id, String name, int age, String city) {
		System.out.println("paramaeterized constructor called");
		sid = id;
		sname = name;
		sage = age;
		scity = city;
	}

	void dispayStudentDetails() {
		System.out.println("Student Id :" + sid);
		System.out.println("Student name :" + sname);
		System.out.println("Student Age :" + sage);
		System.out.println("Student city :" + scity);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		// The objStudentis created by using No argument constructor
		StudentDemo objStudent = new StudentDemo();
		objStudent.sid = 101;
		objStudent.sname = "shiva";
		objStudent.sage = 26;
		objStudent.scity = "Hyderabad";
		objStudent.dispayStudentDetails();
		StudentDemo objStudent1 = new StudentDemo(101, "shiva", 45, "HYD");
		System.out.println("*************Student Object 1 is calling************");
		objStudent1.dispayStudentDetails();
		StudentDemo objStudent2 = new StudentDemo(102, "chandrakala", 45, "BAN");
		System.out.println("*************Student Object 2 is calling************");
		objStudent2.dispayStudentDetails();
		StudentDemo objStudent3 = new StudentDemo(103, "Syed", 45, "VIZAG");
		System.out.println("*************Student Object 3 is calling************");
		objStudent3.dispayStudentDetails();
		System.out.println("main method ended");
	}

}
