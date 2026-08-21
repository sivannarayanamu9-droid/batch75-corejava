package com.arrays;

import java.util.Scanner;

public class ArrayEmployeeDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Object[][] emp = new Object[2][3];

		// Employee 1
		System.out.println("Enter Employee 1 details:");

		System.out.print("Enter Employee ID: ");
		emp[0][0] = sc.nextInt();

		sc.nextLine(); // consume Enter

		System.out.print("Enter Employee Name: ");
		emp[0][1] = sc.nextLine();

		System.out.print("Enter Salary: ");
		emp[0][2] = sc.nextDouble();

		// Employee 2
		System.out.println("\nEnter Employee 2 details:");

		System.out.print("Enter Employee ID: ");
		emp[1][0] = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter Employee Name: ");
		emp[1][1] = sc.nextLine();

		System.out.print("Enter Salary: ");
		emp[1][2] = sc.nextDouble();

		// Display employee details
		System.out.println("\nEmployee Details:");

		for (int i = 0; i < emp.length; i++) {
			// for(int j=0;j<emp[i].length;j++) {
			System.out.println("Employee ID: " + emp[i][0]);
			System.out.println("Employee Name: " + emp[i][1]);
			System.out.println("Salary: " + emp[i][2]);
			System.out.println("-------------------");

			// }
		}

		sc.close();

	}

}
