package com.langaugefundamantals;

public class TestnewDemo {
	static {
		System.out.println("static block is calling while class loading....");
	}
	{
		System.out.println("instance block is calling when we  calling constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestnewDemo objTestnewDemo = new TestnewDemo();
		System.out.println("main method ended");

	}

}
