package com.arrays;

import java.util.Scanner;

public class EmployeeDetailsArr {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows :");
		int numberOfRows=sc.nextInt();
		
		Object[][] emp = new Object[numberOfRows][3];
		int count = 0;
		String[] empColumns = { "Employee_Id", "Employee_Name", "Employee_Salary" };
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Enter employee details " + (i + 1));
			//sc.nextLine();

			System.out.println("Enter employee Id :");
			emp[i][0] = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Employee Name :");
			emp[i][1] = sc.nextLine();
			
			System.out.println("Enter department name");
			emp[i][2] = sc.nextLine();

//			System.out.println("Enter employee salary :");
//			emp[i][2] = sc.nextDouble();
		}

		// Displaying employee details
		System.out.println("Employee Details :");
		for (int i = 0; i < empColumns.length; i++) {
			System.out.print(empColumns[i] + "  | ");
		}
		System.out.println();
//		for(Object[] employee:emp) {
//			for(Object empData:employee) {				
//				System.out.print(empData+" | ");
//			}
//			System.out.println();
//			//System.out.println("********************");
//		}

		for (int i = 0; i < emp.length; i++) {
			System.out.print("Row " + i + "-->");
			for (int j = 0; j < emp[i].length; j++) {
				System.out.print(emp[i][j] + " | ");
			}
			System.out.println();
		}
		sc.close();
	}

}
