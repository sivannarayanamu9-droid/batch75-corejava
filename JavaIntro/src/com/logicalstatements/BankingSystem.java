package com.logicalstatements;

import java.util.Scanner;

public class BankingSystem {
	/*
	 	1. Check Balance
		2. Deposit Money
		3. Withdraw Money
		4. Exit
	  
	 */
	public static void main(String[] args)
	{
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		double balance=0;
		String choice;
		System.out.println("**********welcome to Cheated Bank***********");
		do {
			System.out.println("*************Bank Menu*********");
			System.out.println("1. Check Balance");
	        System.out.println("2. Deposit Money");
	        System.out.println("3. Withdraw Money");
	        System.out.println("4. Exit");			
			System.out.println("Enter your option :");
			int option = sc.nextInt();
			switch(option)
			{
			case 1->System.out.println("Available Balance is :"+balance);
			case 2->{
				System.out.println("Enter deposit amount :");
				double depositAmount = sc.nextDouble();
				if(depositAmount>0) {
					balance+=depositAmount;
					System.out.println("Deposited amount :"+depositAmount);
				}else
				{
					System.out.println("Entered amount is not valid");
				}
			}
			case 3->{
				System.out.println("Please enter withdraw amount :");
				double withdrawAmount=sc.nextDouble();
				if(balance>withdrawAmount) {
					balance -= withdrawAmount;
					System.out.println("Withdrwal amount :"+withdrawAmount);					
				}
				else {
					System.out.println("Insufficient fund please maintain  minimum balance");
				}
			}
			case 4->{
				System.out.println("Thank you for banking with us ");
				break;
			}
			}
			System.out.println("Do you want to continue yes or no....");
			choice=sc.next();
			
		}while(choice.equalsIgnoreCase("y"));
		System.out.println("Thank you visit again");
		sc.close();
		
		
	}

}
