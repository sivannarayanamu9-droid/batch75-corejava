package com.logicalstatements;
import java.awt.Choice;
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
	void depositService()
	{
		System.out.println("Enter amount to deposit");
		double depositedAmount=sc.nextDouble();
		if(depositedAmount>=0) {
			balance += depositedAmount;
			System.out.println("Deposited Amount :"+depositedAmount);
		}else {
			System.out.println("Entered amount is invalid");
		}
	}
	void withdrawlService()
	{
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
	void transferMoneyService() {
		String transferChoice="";
		int transferOption=0;
		double transferAmount=0;
		System.out.println("Enter amount to be transfered :");
		transferAmount=sc.nextDouble();
		if(transferAmount>=500000) {
			
		}
		System.out.println("1.RTGS");
		System.out.println("2.NEFT");
		
	}
	void loginService()
	{
		String onlineChoice="";
		int onlineOption=0;
		do {		
		
			System.out.println("***************Online Banking***************");
			System.out.println("1.Transfer Money");
			System.out.println("2.Mini Statement");
			System.out.println("3.Change ATM PIN");
			System.out.println("4.Change Password");
			System.out.println("5.Mobile Recharge");
			System.out.println("6.Electricity Bill Payment");
			System.out.println("7.View Profile");
			System.out.println("8.Logout");
			System.out.println("Enter your choice :");
			onlineOption = sc.nextInt();
			switch(onlineOption)
			{
				case 1->{
					
				}
			}
		}while(onlineChoice.equalsIgnoreCase(onlineChoice));
		/*
		 *  4. Transfer Money
			5. Mini Statement
			6. Change ATM PIN
			7. Change Password
			8. Mobile Recharge
			9. Electricity Bill Payment
			10. View Profile
			11. Logout
		 */
//		do {
//			
//		
//		System.out.println("Enter user name :");
//		userName=sc.next();
//		System.out.println("Enter password :");
//		userPassword=sc.next();
//		System.out.println("Re type password :");
//		String retypePassword=sc.next();
//		if(userPassword.equals(retypePassword)) {
//			System.out.println("Entered password matched");
//			System.out.println("welcome to online banking");
//			System.out.println("1.login");
//			onlineOption=sc.nextInt();
//			switch(onlineOption)
//			{
//				case 1->{
//					System.out.println("Enter Username ");
//					String inputUserName=sc.next();
//					System.out.println("Enter Password ");
//					String inputPassword=sc.next();
//					if(inputUserName !=null && inputPassword != null) {
//						if(userName.equals(inputUserName) && userPassword.equals(inputPassword)) {
//							System.out.println("Welcome to online banking "+userName);
//						}
//						else {
//							System.out.println("Invalid credentials Please try again");
//						}
//					}
//					
//				}
//			}
//			
//		}else {
//			System.out.println("Entered Password is In correct ");
//		}
//		System.out.println("DO you want to continue yes or no?");
//		onlineChoice=sc.next();
//	}while(onlineChoice.equalsIgnoreCase(onlineChoice));
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
				depositService();
//				System.out.println("Enter amount to deposit");
//				double depositedAmount=sc.nextDouble();
//				balance += depositedAmount;
//				System.out.println("Deposited Amount :"+depositedAmount);
			}
			case 4->{
				withdrawlService();
//				System.out.println("Enter Withdraw amount ");
//				double withdrawlAmount=sc.nextDouble();
//				if(balance>withdrawlAmount && withdrawlAmount !=0)
//				{
//					balance -= withdrawlAmount;
//					System.out.println("Withdrawal Amount "+withdrawlAmount);
//				}else {
//					System.out.println("Insufficient Balance please try again...!!!!");
//				}
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
									loginService();
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
