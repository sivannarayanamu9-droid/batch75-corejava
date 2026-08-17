package com.logicalstatements;

import java.util.Scanner;

public class StudentGrade {
	static String studentGrade(double marksP)
	{
		int marks=(int)(marksP/10);
		String grade="";
		switch(marks)
		{
		case 9->System.out.println("Grade A");
		case 8->System.out.println("Grdae B");
		case 7->System.out.println("Grade C");
		case 6->System.out.println("Grade D");
		case 4,5->System.out.println("Grade E");
		default ->System.out.println("Fail");
		}
		return grade;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student percentage :");
		double marksPercentage=sc.nextDouble();
		studentGrade(marksPercentage);
		System.out.println(studentGrade(marksPercentage));
		System.out.println("main method ended");
	}

}
