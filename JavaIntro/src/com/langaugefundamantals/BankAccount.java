package com.langaugefundamantals;

public class BankAccount {
	long accountNumber=20142305670L;
	String accountHolderName="m sivanarayana";
	String accountType="savings";
	long balance=10000L;
	public void displayAccount()
	{
		System.out.println("Account Information");
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Holder Name :"+accountHolderName);
		System.out.println("Account Type :"+accountType);
		System.out.println("Available Balance :"+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method satrted");
		BankAccount objAccount=new BankAccount();
		objAccount.displayAccount();
		System.out.println("Main method end");

	}

}
