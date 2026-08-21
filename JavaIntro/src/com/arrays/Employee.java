package com.arrays;

import java.util.Scanner;

public class Employee {
	int employee_Id;
	String employee_Name;
	double employee_Salary;

	Employee() {
		System.out.println("No arg constructor called :");
	}

	Employee(int employee_Id, String employee_Name, double employee_Salary) {
		this.employee_Id = employee_Id;
		this.employee_Name = employee_Name;
		this.employee_Salary = employee_Salary;
	}

	void displayEmployees() {
		System.out.println("*****************Employee Details****************");
		System.out.println("Employee Id :" + employee_Id);
		System.out.println("Employee Name :" + employee_Name);
		System.out.println("Employee Salary :" + employee_Salary);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		Employee[][] objEmp = new Employee[2][1];
		System.out.println("Length of Employee Object :" + objEmp.length);
		for (int i = 0; i < objEmp.length; i++) {
			System.out.println("Enter Employee Details :" + (i + 1));

			System.out.println("Employee Id :");
			int empId = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Employee Name :");
			String empName = sc.nextLine();

			System.out.println("Enter employee salary :");
			double empSal = sc.nextDouble();

			objEmp[i][0] = new Employee(empId, empName, empSal);
			System.out.println();
		}
		// display employee details
		for (int i = 0; i < objEmp.length; i++) {
			objEmp[i][0].displayEmployees();
		}

		for (Employee[] emp : objEmp) {
			for (Employee emp1 : emp) {
				emp1.displayEmployees();
			}
		}

	}

}
