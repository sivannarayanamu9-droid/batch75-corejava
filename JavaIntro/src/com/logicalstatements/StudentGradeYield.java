package com.logicalstatements;

import java.util.Scanner;

public class StudentGradeYield {
	static String studentGradeInfo(double marks)
	{
		int marksPercentage=(int)(marks/10);
		String garde="";
		return switch(marksPercentage)
				{
					case 9,10->{
						yield "A"; 
					}
					case 8->{
						yield "B";
					}
					case 7->{
						yield "C";
					}
					case 6->{
						yield "D";
					}
					case 4,5->{
						yield "C";
					}
					default ->{
						yield "Fail";
					}
				};
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student marks :");
		double marks=sc.nextDouble();
		studentGradeInfo(marks);
		System.out.println(studentGradeInfo(marks));
		
		System.out.println("main method ended");
		
	}

}
