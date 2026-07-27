package com.langaugefundamantals.constructors;

public class Quiz {
	String subject;
	int totalQuestions;
	String timeLimit;

	public Quiz() {
		this("java");
		System.out.println("No arg constructor called");
	}

	public Quiz(String subject) {
		this(subject, 10);
		System.out.println("one arg constructor called");
	}

	public Quiz(String subject, int totalQuestions) {
		this(subject, totalQuestions, "60s");
		System.out.println("Two arg constructor called");
	}

	public Quiz(String subject, int totalQuestions, String timeLimit) {

		System.out.println("Three arg constructor called");
		this.subject = subject;
		this.totalQuestions = totalQuestions;
		this.timeLimit = timeLimit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main mrthod started");
		Quiz obj = new Quiz();
		System.out.println("main method ended");

	}

}
