package com.langaugefundamantals.constructors;

public class Student {
	int studentId;
	String studentName;
	String studentCourse;
	//No-arg constructor
	Student()
	{
		System.out.println("No arg constructr called");
		this(202645);
		
	}
	Student(int studentId)
	{
		this(studentId,"Chandu");
	}
	Student(int studentId,String studentName)
	{
		this(studentId,studentName,"JFS-B75");
	}
	Student(int studentId,String studentName,String studentCourse)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentCourse=studentCourse;
	}
	void displayStudentInformation()
	{
		System.out.println("Student Id :"+studentId);
		System.out.println("Student Name :"+studentName);
		System.out.println("Student course :"+studentCourse);
	}
	public static void main(String[] args)
	{
		System.out.println("main method started");
		Student objStudent=new Student();
		objStudent.displayStudentInformation();
		
		
	}

}
