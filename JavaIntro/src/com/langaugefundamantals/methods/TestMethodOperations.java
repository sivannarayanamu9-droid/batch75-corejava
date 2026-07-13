package com.langaugefundamantals.methods;

public class TestMethodOperations {
	public static void main(String[] args)
	{
		System.out.println("main method started");
		difference();
		TestMethodOperations objMethodOperations=new TestMethodOperations();
		objMethodOperations.addition();
		System.out.println("main method is ended");
		
	}
	void addition()
	{
		int a =10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition of two numbers are :"+sum);
	}
	public static void difference()
	{
		int a=20;
		int b=10;
		int diff=a-b;
		System.out.println("Subtraction of two numbers are :"+diff);
	}

}
