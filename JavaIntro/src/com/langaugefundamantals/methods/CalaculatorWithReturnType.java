package com.langaugefundamantals.methods;

import java.util.Scanner;

public class CalaculatorWithReturnType {
	float add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	double subtract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	double multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	double divide(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	void main() {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter SEcond number");
		int secondNumber = sc.nextInt();
		System.out.println("Addition =" + add(firstNumber, secondNumber));
		System.out.println("Subtraction =" + subtract(firstNumber, secondNumber));
		System.out.println("Multiplication =" + multiply(firstNumber, secondNumber));
		System.out.println("Division =" + divide(firstNumber, secondNumber));
		System.out.println("main method ended");
	}

}
