package com.langaugefundamantals.methods;

import java.util.Scanner;

public class EmployeeDetails {
	String employeeName;
	double basicSalary;

	void salarySlip(String ename, double salary) {
		employeeName = ename;
		basicSalary = salary;
		System.out.println("Employee Name :" + employeeName);
		System.out.println("Basic Salary  :" + basicSalary);
		System.out.println("HRA (20%)     :" + (basicSalary * 20) / 100);
		System.out.println("DA (10%)      :" + (basicSalary * 10) / 100);
		System.out.println("Gross Salary  :" + basicSalary);
	}

	void inputEmployeeData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter your salary:");
		double salary = sc.nextDouble();
		salarySlip(name, salary);
	}

	void main() {
		System.out.println("main method started");
		inputEmployeeData();
		System.out.println("main method ended");
	}

}
