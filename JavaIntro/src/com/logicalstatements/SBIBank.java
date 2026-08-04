package com.logicalstatements;

import java.util.Scanner;

public class SBIBank {
	/*	
	  	CustomerDetails
	  	OnlineBanking
	 	1.Deposit
		2.Withdraw
		3.Balance
		4.Change PIN
		5.Exit
	 */
	String customerName;
	long phoneNumber;
	String panCardNumber;
	long aadharCardNumber;
	double balance;
	String userName;
	String userPassword;
	static Scanner sc = new Scanner(System.in);
	public SBIBank() {
		System.out.println("***************Welcome to SBI Bank**************");
	}
	SBIBank(String customerName,long phoneNumber,String panCardNumber,long aadharCardNumber,double balance)
	{
		this.customerName=customerName;
		this.aadharCardNumber=aadharCardNumber;
		this.panCardNumber=panCardNumber;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
	}
	void displayCustomerDetails()
	{
		System.out.println("**********Customer Details**********");
		System.out.println("Customer Name :"+customerName);
		System.out.println("Customer Aadhar number :"+aadharCardNumber);
		System.out.println("Customer Pan Number :"+panCardNumber);
		System.out.println("Customer Phone Number :"+phoneNumber);
		System.out.println("Balance Amount :"+balance);
		System.out.println("***********Account created successfully**************");
	}
//	void inputCustomerDetails()
//	{
//		System.out.println("Enter Customer Name :");
//		customerName=sc.nextLine();
//		System.out.println("Enter customer Adhar number :");
//		aadharCardNumber=sc.nextLong();
//		System.out.println("Enter Pan number :");
//		panCardNumber=sc.next();
//		System.out.println("Enter phone number :");
//		phoneNumber=sc.nextLong();
//		System.out.println("Enter Amount to open the account");
//		balance=sc.nextDouble();
//		SBIBank objShiva=new SBIBank(customerName, phoneNumber, panCardNumber, aadharCardNumber, balance);
//	}
	void displaySevicesProvidedBySBI()
	{
		/*	
	  	CustomerDetails
	  	OnlineBanking
	 	1.Deposit
		2.Withdraw
		3.Balance
		4.Change PIN
		5.Exit
	 */
		int option=0;
		String choice="";
		do {
			
		
		System.out.println("**********Services Provided By SBI****************");
		System.out.println("1.Customer Details ");
		System.out.println("2.Check Balance ");
		System.out.println("3.Deposit ");
		System.out.println("4.Withdraw ");
		System.out.println("5.Online Baning");
		System.out.println("6.Login ");
		System.out.println("Choose your service you want");
		option = sc.nextInt();
		switch(option)
		{
			case 1->{
				displayCustomerDetails();
			}
			case 2->{
				System.out.println("Available Balance :"+balance);
			}
			case 3->{
				System.out.println("Enter amount to deposit");
				double depositedAmount=sc.nextDouble();
				balance += depositedAmount;
				System.out.println("Deposited Amount :"+depositedAmount);
			}
			case 4->{
				System.out.println("Enter Withdrawl amount ");
				double withdrawlAmount=sc.nextDouble();
				if(balance>withdrawlAmount && withdrawlAmount !=0)
				{
					balance -= withdrawlAmount;
					System.out.println("Withdrawal Amoiunt "+withdrawlAmount);
				}else {
					System.out.println("Insufficient Balance please try again...!!!!");
				}
			}
			case 5->{		
				String onlineChoice="";
				int onlineOption=0;
				System.out.println("Enter user name :");
				userName=sc.next();
				System.out.println("Enter password :");
				userPassword=sc.next();
				System.out.println("Re type password :");
				String retypePassword=sc.next();
				if(userPassword.equals(retypePassword)) {
					System.out.println("Entered password matched");
					System.out.println("welcome to online banking");
					System.out.println("1.login");
					onlineOption=sc.nextInt();
					switch(onlineOption)
					{
						case 1->{
							System.out.println("Enter Username ");
							String inputUserName=sc.next();
							System.out.println("Enter Password ");
							String inputPassword=sc.next();
							if(inputUserName !=null && inputPassword != null) {
								if(userName.equals(inputUserName) && userPassword.equals(inputPassword)) {
									System.out.println("Welcome to online banking "+userName);
								}
								else {
									System.out.println("Invalid credentials Please try again");
								}
							}
							
						}
					}
					
				}else {
					System.out.println("Entered Password is In correct ");
				}
				
			}
			case 6->{
				System.out.println("Enter Username ");
				String inputUserName=sc.next();
				System.out.println("Enter Password ");
				String inputPassword=sc.next();
				if(inputUserName !=null && inputPassword != null) {
					if(userName.equals(inputUserName) && userPassword.equals(inputPassword)) {
						System.out.println("Welcome to online banking "+userName);
					}
					else {
						System.out.println("Invalid credentials Please try again");
					}
				}
				
			}
		}
		System.out.println("Do you want to continue yes or no");
		choice=sc.next();
		}while(choice.equalsIgnoreCase("y"));
		System.out.println("Thank you for banking with us ");
		
	}

	public static void main(String[] args)
	{
		System.out.println("main method started");
		//SBIBank obj=new SBIBank();
		//obj.displayCustomerDetails();
		
		System.out.println("Enter Customer Name :");
		String customerName=sc.nextLine();
		System.out.println("Enter customer Adhar number :");
		long aadharCardNumber=sc.nextLong();
		System.out.println("Enter Pan number :");
		String panCardNumber=sc.next();
		System.out.println("Enter phone number :");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter Amount to open the account");
		double balance=sc.nextDouble();
		SBIBank objShiva=new SBIBank(customerName, phoneNumber, panCardNumber, aadharCardNumber, balance);
		objShiva.displayCustomerDetails();
		objShiva.displaySevicesProvidedBySBI();
		
		//SBIBank customerShiva=new SBIBank(null, 0, null, 0, 0)
		
		System.out.println("main method ended");
		sc.close();
		
		
	}

}
