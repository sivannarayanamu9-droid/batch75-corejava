package com.langaugefundamantals.factorymethods;

public class BankAccount {
	long accountNumber;
	String customerName;
	double balance;
	String branch;

	static BankAccount setBankDetails() {
		BankAccount objBankAccount = new BankAccount();
		objBankAccount.accountNumber = 20142308880L;
		objBankAccount.customerName = "murapala sivannaryana";
		objBankAccount.balance = 20000;
		objBankAccount.branch = "Hyderabad";
		return objBankAccount;

	}

	static void getBankDetails() {
		BankAccount objBankAccount = setBankDetails();
		System.out.println("Account Number :" + objBankAccount.accountNumber);
		System.out.println("Customer name :" + objBankAccount.customerName);
		System.out.println("Balance :" + objBankAccount.balance);
		System.out.println("Branch :" + objBankAccount.branch);
	}

	void main() {
		System.out.println("main method started");
		getBankDetails();
		System.out.println("main method ended");

	}

}
