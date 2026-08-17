package com.langaugefundamantals.conditionalstatements;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		//Based on the i/p performing some operations
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b= sc.nextInt();
		System.out.println("Enter sybol to perform operation");
		String symbol=sc.next();
		switch(symbol)
		{
		case "+":
			System.out.println("Addition of two numbers are :"+(a+b));
			break;
		case "-":
			System.out.println("Addition of two numbers are :"+(a-b));
			break;
		case "*":
			System.out.println("Addition of two numbers are :"+(a*b));
			break;
		case "/":
			System.out.println("Addition of two numbers are :"+(a/b));
			break;
		case "%":
			System.out.println("Addition of two numbers are :"+(a%b));
			break;
		default :
			System.out.println("You entered a wrong symbol try again...");
			
		}

	}

}
