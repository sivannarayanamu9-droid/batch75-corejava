package com.langaugefundamantals.classlevelconstructors;

public class Student {
	int id;
	String name;

	// No argument constructor
	Student() {
		System.out.println("No arg constructor called");
	}

	void show() {

		System.out.println("*********Student details are :************");
		System.out.println("Student ID :" + id);
		System.out.println("Student Name :" + name);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		// Student object is created because java compiler will generate default
		// constructor
		Student s = new Student();
		s.show();
		Student s1 = new Student();
		s1.id = 18;
		s1.name = "kohli";
		System.out.println("main method ended");

	}

}
