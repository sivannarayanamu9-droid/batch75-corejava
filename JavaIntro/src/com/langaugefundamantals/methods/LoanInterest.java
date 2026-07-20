package com.langaugefundamantals.methods;

import java.util.Scanner;

public class LoanInterest {
	static Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);

	float calculateInterest(double principal, double rate, int time) {
		double simpleInerest = (principal * rate * time) / 100;
		return (float) simpleInerest;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		// Scanner sc = new Scanner(System.in);
		LoanInterest objInterest = new LoanInterest();
		System.out.println("Enter principalAmount");
		double principalAmount = objInterest.sc1.nextDouble();
		System.out.println("Enter rateOfInterest");
		double rateOfInterest = sc.nextDouble();
		System.out.println("Enter duration");
		int duration = sc.nextInt();
		double interestAmount = objInterest.calculateInterest(principalAmount, rateOfInterest, duration);
		System.out.println("Interest Amount :" + interestAmount);
		System.out.println("main method endedd");

	}

}
