package com.logicalstatements;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {
			System.out.println("Enter first number :");
			int firstNumber = sc.nextInt();
			System.out.println("Enter second number :");
			int secondNumber = sc.nextInt();
			System.out.println("Enter symbol to perform an operation ");
			String symbol = sc.next();

			switch (symbol) {
				case "+" -> System.out.println("Addition of two numbers are :" + (firstNumber + secondNumber));
				case "-" -> System.out.println("Subtraction of two numbers are :" + (firstNumber - secondNumber));
				case "*" -> System.out.println("Multiplication of two numbers are :" + (firstNumber * secondNumber));
				case "/" -> System.out.println("Division of two numbers are :" + (firstNumber / secondNumber));
				case "%" -> System.out.println("Mod of two numbers are :" + (firstNumber % secondNumber));
				default  -> System.out.println("Entered symbol is invalid please try again...");
			}
			System.out.println("Do you want to continue ? click yes or no");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("EXIT...!!!!!!");

	}

}
