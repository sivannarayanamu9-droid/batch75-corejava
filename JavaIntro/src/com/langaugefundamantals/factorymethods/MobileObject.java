package com.langaugefundamantals.factorymethods;

public class MobileObject {
	String brand;
	String model;
	double price;
	String ram;
	MobileObject getMobileData()
	{
		MobileObject objMobile=new MobileObject();
		objMobile.brand="Samsung";
		objMobile.model="S25";
		objMobile.price=70000;
		objMobile.ram="12GB";
		return objMobile;
	}
	void displayMobileInformation()
	{
		MobileObject objMobile=getMobileData();
		System.out.println("Brand :"+objMobile.brand);
		System.out.println("Model :"+objMobile.model);
		System.out.println("Price :"+objMobile.price);
		System.out.println("RAM :"+objMobile.ram);
	}
	
	void main()
	{
		System.out.println("main method started");
		displayMobileInformation();
		System.out.println("main method ended");
	}

}
