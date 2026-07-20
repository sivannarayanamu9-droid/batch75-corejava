package com.langaugefundamantals.methods;

public class Student {
	int sid;
	String name;
	int age;
	String city;

	// factory method
	Student getStudentData() {
		Student s = new Student();
		s.sid = 101;
		s.name = "shiva";
		s.age = 30;
		s.city = "akividu";
		return s;
	}

	void displayStudentInfo(Student s) {
		System.out.println("Student ID :" + s.sid);
		System.out.println("Studnet name :" + s.name);
		System.out.println("Student age :" + s.age);
		System.out.println("Studnet City :" + s.city);
	}

	void main() {
		System.out.println("main method started");
		Student s = getStudentData();
		displayStudentInfo(s);
		System.out.println("main method ended");
	}

}
