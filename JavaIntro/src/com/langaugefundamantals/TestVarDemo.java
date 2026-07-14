package com.langaugefundamantals;

public class TestVarDemo {
	static
	{
		var a=20;
		var b=5;
		var div=a/b;
		System.out.println("division of two numbers are :"+div);
	}
	{
		var a = 10;
		var b = 20;
		var diff = b - a;
		System.out.println("subtraction of two numbers are :" + diff);
	}

	void addition() {
		var a = 10;// var is a generic datatype to store any value inside the methods or blocks
		// var was inroduces in java 10 we can use var generic data type in methods or
		// blocks
		var b = 20;
		var sum = a + b;
		System.out.println("addition of two numbers are :" + sum);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestVarDemo objTestVarDemo = new TestVarDemo();
		objTestVarDemo.addition();
		System.out.println("main method ended");
	}

}
