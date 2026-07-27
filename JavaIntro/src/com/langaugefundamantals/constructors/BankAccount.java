package com.langaugefundamantals.constructors;

public class BankAccount {
	String accountHolder;
	long accountNumber;
	double balance;

	BankAccount() {
		this("unknown");
		System.out.println("No arg constructor called");
	}

	BankAccount(String accountHolder) {
		this(accountHolder, 0);
		System.out.println("parameterized constructor called");
	}

	BankAccount(String accountHolder, long accountNumber) {
		this(accountHolder, accountNumber, 0.0);
		System.out.println("two argumen comstructor called");
	}

	BankAccount(String accountHolder, long accountNumber, double balance) {
		System.out.println("Three argument constructor called");
		this("shiva");
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	void displayAccountDetails() {
		System.out.println("Customer Account Details are :");
		System.out.println("Account Holder name :" + accountHolder);
		System.out.println("Account Number :" + accountNumber);
		System.out.println("Account Balance :" + balance);
		System.out.println("*********************************");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		BankAccount obj = new BankAccount();
		obj.displayAccountDetails();
		BankAccount obj1 = new BankAccount("krishna");
		obj1.displayAccountDetails();
		BankAccount obj2 = new BankAccount("krishna", 1234567890);
		obj2.displayAccountDetails();
		BankAccount obj3 = new BankAccount("krishna", 1234567890, 50000);
		obj3.displayAccountDetails();

	}

}
