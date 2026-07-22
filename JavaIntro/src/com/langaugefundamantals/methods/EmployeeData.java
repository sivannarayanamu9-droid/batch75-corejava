package com.langaugefundamantals.methods;

import java.util.Scanner;

public class EmployeeData {
	void salarySlip(String employeeName, double basicSalary) {
		double HRA = (basicSalary * 20) / 100;
		double DA = (basicSalary * 10) / 100;
		double grossSalary = basicSalary + HRA + DA;
		System.out.println("Emplopyee Name :" + employeeName);
		System.out.println("Basic Salary  :" + basicSalary);
		System.out.println("HRA (20%)     :" + HRA);
		System.out.println("DA (10%)      :" + DA);
		System.out.println("Gross Salary  :" + grossSalary);

	}

	void main() {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.next();
		System.out.println("Enter Basic salary :");
		double salary = sc.nextDouble();
		EmployeeData objEmployeeData = new EmployeeData();
		objEmployeeData.salarySlip(name, salary);
		System.out.println("main method ended");
	}

}
