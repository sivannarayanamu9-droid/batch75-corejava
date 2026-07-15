package com.langaugefundamantals.methods;

public class TestMethodWithArguments {
	{
		System.out.println("instance block calling");
	}

	void show() {
		System.out.println("Good morning students");
	}

	void show(String name) {
		System.out.println("Hi Good mornign " + name);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestMethodWithArguments objMethodWithArguments = new TestMethodWithArguments();
		objMethodWithArguments.show();
		objMethodWithArguments.show("chandrika");
		System.out.println("main method ended");

	}

}
