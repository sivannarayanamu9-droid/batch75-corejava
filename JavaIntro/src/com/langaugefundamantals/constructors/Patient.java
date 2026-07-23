package com.langaugefundamantals.constructors;

import java.util.Scanner;

public class Patient {
	String patientName;
	int patientAge;
	int roomChargePerDay;
	int numberOfDaysAdmitted;

	Patient(String patientName, int patientAge, int roomChargePerDay, int numberOfDaysAdmitted) {
		System.out.println("Parameterized constructor called");
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.roomChargePerDay = roomChargePerDay;
		this.numberOfDaysAdmitted = numberOfDaysAdmitted;

	}

	void displayHospitalBill() {
		double totalHospitalBill = roomChargePerDay * numberOfDaysAdmitted;
		System.out.println("Patient Name :" + patientName);
		System.out.println("Age			 :" + patientAge);
		System.out.println("Room charge Per Day:" + roomChargePerDay);
		System.out.println("Days Admitted :" + numberOfDaysAdmitted);
		System.out.println("Total Hospital Bill :" + totalHospitalBill);

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter patient Name :");
		String pname = sc.next();
		System.out.println("Enter age :");
		int age = sc.nextInt();
		System.out.println("Enter room charge per day :");
		int charge = sc.nextInt();
		System.out.println("Enter number of days admitted :");
		int admittedDays = sc.nextInt();
		Patient obj = new Patient(pname, age, charge, admittedDays);
		obj.displayHospitalBill();
		System.out.println();
		System.out.println("main method ended");

	}

}
