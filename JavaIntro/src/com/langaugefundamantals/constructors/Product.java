package com.langaugefundamantals.constructors;

import java.util.Scanner;

public class Product {
	String productName;
	double productPrice;
	double quantity;

	Product() {
		this("I phone");
		System.out.println("No arg constructor called");

	}

	Product(String productName) {
		this(productName, 1000);
		System.out.println("one arg constructor called");
	}

	Product(String productName, double productPrice) {
		this(productName, productPrice, 20);
		System.out.println("two arg constructor called");
	}

	Product(String productName, double productPrice, double quantity) {
		System.out.println("three arg constructor called");
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		System.out.println("**********************Product Details**********************");
		System.out.println("Enter product name :" + productName);
		System.out.println("price :" + productPrice);
		System.out.println("Quantity :" + quantity);
		System.out.println("Total cost of the product :" + (productPrice * quantity));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Product obj = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Name :");
		String productName = sc.nextLine();
		System.out.println("Enter Price of the product :");
		double productPrice = sc.nextDouble();
		System.out.println("Enter Quantity pf a product :");
		double quantity = sc.nextDouble();
		Product obj1 = new Product(productName, productPrice, quantity);

		System.out.println("main method ended");

	}

}
