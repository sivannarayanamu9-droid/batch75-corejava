package com.logicalstatements;

import java.util.Scanner;

public class StudentGradeExample {
	static String studentGradeInfo(double marks)
	{
		String grade="";
		int marksPercentage=(int)(marks/10);
		return switch(marksPercentage) {
		case 9,10->"Grdae A";
		case 8->"Grade B";
		case 7->"Grade C";
		case 5,6->"Grade D";
		case 3,4->"Grade Fair";		
		default ->"Fail";
		
		};
		//return grade;
	}
	public static void main(String[] args)
	{
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage of a student");
		double studentMarksPerc=sc.nextDouble();
		String gradeInfo=studentGradeInfo(studentMarksPerc);
		System.out.println(gradeInfo);
		System.out.println("main method ended");
		sc.close();
		
	}

}
