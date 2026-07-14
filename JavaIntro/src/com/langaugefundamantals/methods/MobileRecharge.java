package com.langaugefundamantals.methods;

public class MobileRecharge {
	long mobileNumber = 78937400140L;
	char rupeeSymbol = '\u20B9';

	// No return type and no arguments
	void showPlanDetails() {
		System.out.println(mobileNumber + "  Your eligible  plan is :");
		System.out.println("Current Recharge Plan");
		System.out.println("Plan Name : Unlimited    " + rupeeSymbol + " 299");
		System.out.println("Validity  : 28 Days");
		System.out.println("Data      : 1.5 GB/Day");
		System.out.println("Calls     : Unlimited");
	}

	void recharge(double amount) {
		System.out.println("Recharge successfully done");
		System.out.println("Recharge amount :" + rupeeSymbol + amount);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		MobileRecharge objMobileRecharge = new MobileRecharge();// creating an object when calling constructor
		objMobileRecharge.showPlanDetails();// calling the method using reference variable
		System.out.println("***************Mobile Recharge page*************************");
		objMobileRecharge.recharge(299);
		System.out.println("main method ended");

	}

}
