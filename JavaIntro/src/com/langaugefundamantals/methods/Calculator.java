package com.langaugefundamantals.methods;

import java.util.Scanner;

public class Calculator {
	void add(int firstNumber, int secondNumber) {
		int additionResullt = firstNumber + secondNumber;
		System.out.println("Addition = " + additionResullt);
	}

	void subtract(int fisrtNumber, int secondNumber) {
		System.out.println("Subtraction  =" + (fisrtNumber - secondNumber));
	}

	void multiply(int fisrtNumber, int secondNumber) {
		System.out.println("Multiplication =" + (fisrtNumber * secondNumber));
	}

	void divide(int fisrtNumber, int secondNumber) {
		System.out.println("Division =" + (fisrtNumber / secondNumber));
	}

	void main() {
		System.out.println("main method started");
		Calculator objCalculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number :");
		int fisrtNumber = sc.nextInt();
		System.out.println("Enter second number :");
		int secondNumber = sc.nextInt();
		objCalculator.add(fisrtNumber, secondNumber);
		objCalculator.subtract(fisrtNumber, secondNumber);
		objCalculator.multiply(fisrtNumber, secondNumber);
		objCalculator.divide(fisrtNumber, secondNumber);
		System.out.println("main method ended");
	}

}
