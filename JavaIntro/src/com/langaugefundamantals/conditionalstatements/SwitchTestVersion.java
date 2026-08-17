package com.langaugefundamantals.conditionalstatements;

import java.util.Scanner;

public class SwitchTestVersion {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number");
		int secondNumber = sc.nextInt();
		System.out.println("Enter symbol you want to perform certain operation");
		String symbol = sc.next();
		
		switch (symbol) {
			case "+" -> System.out.println("Addition of two numbers are :" + (firstNumber + secondNumber));
			case "-" -> System.out.println("subtraction of two numbers are :" + (firstNumber - secondNumber));
			case "*" -> System.out.println("Multiplicarion of two numbers are :" + (firstNumber * secondNumber));
			case "/" -> System.out.println("Division of two numbers are :" + (firstNumber / secondNumber));
			case "%" -> System.out.println("MOd of two numbers are :" + (firstNumber % secondNumber));
			default -> System.out.println("Invalid symbol try again..");
		}
	}

}
