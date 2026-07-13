package com.langaugefundamantals.methods;

public class TestMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		hello();// calling the method directly we can call static method directly
		TestMethodDemo objMethodDemo = new TestMethodDemo();
		objMethodDemo.show();// calling instance method by using reference variable
		System.out.println("main method ended");

	}

	void show() {
		System.out.println("show method is calling");
	}

	public static void hello() {
		System.out.println("hello,good evening");
	}

}
