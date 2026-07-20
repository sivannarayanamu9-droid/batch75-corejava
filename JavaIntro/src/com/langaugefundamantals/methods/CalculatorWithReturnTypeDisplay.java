package com.langaugefundamantals.methods;

import java.util.Scanner;

public class CalculatorWithReturnTypeDisplay {
	int add(int fisrtNumber, int secondNumber) {
		return fisrtNumber + secondNumber;
	}

	double subtract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	double multiply(int firstNumeber, int secondNumber) {
		return firstNumeber * secondNumber;
	}

	double divide(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	void displayData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number:");
		int secondNumber = sc.nextInt();
		System.out.println("Addition =" + add(firstNumber, secondNumber));
		System.out.println("Subtraction =" + subtract(firstNumber, secondNumber));
		System.out.println("Multiplication =" + multiply(firstNumber, secondNumber));
		System.out.println("Division =" + divide(firstNumber, secondNumber));

	}

	void main() {
		System.out.println("main mehod started");
		displayData();
		System.out.println("main method ended");
	}

}
