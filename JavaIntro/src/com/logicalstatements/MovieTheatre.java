package com.logicalstatements;

import java.util.Scanner;

public class MovieTheatre {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		String choice = null;
		char rupeeSymbol = '\u20B9';
		int silver = 200;
		int gold = 300;
		int platinum = 500;
		int discount = 0;
		int age = 0;
		do {
			System.out.println("Welcome to VCUBE Theatre online booking ");
			System.out.println("1 → Silver " + rupeeSymbol + 200);
			System.out.println("2 → Gold " + rupeeSymbol + 300);
			System.out.println("3 → Platinum " + rupeeSymbol + 500);
			System.out.println("4 → Exit");
			System.out.println("Enter your option :");
			int option = sc.nextInt();
			if(option != 4)
			{
				System.out.println("Enter your age :");
				age = sc.nextInt();
			}
			
			switch (option) {

			case 1 -> {

				if (age >= 60) {
					discount = silver / 10;
					silver -= discount;
					System.out.println("Silver ticket price :" + rupeeSymbol + silver);
				} else {
					System.out.println("silver ticket price :" + rupeeSymbol + silver);
				}
			}
			case 2 -> {
				if (age >= 60) {
					discount = gold / 10;
					gold -= discount;
					System.out.println("Gold ticket amount :" + rupeeSymbol + gold);
				} else {
					System.out.println("Gold ticket amount :" + rupeeSymbol + gold);
				}
			}
			case 3 -> {
				if (age >= 60) {
					discount = platinum / 10;
					platinum -= discount;
					System.out.println("platinum ticket amount :" + rupeeSymbol + platinum);
				} else {
					System.out.println("platinum ticket amount :" + rupeeSymbol + platinum);
				}

			}
			case 4 -> {
				System.out.println("Thank you visit Again");
				//break;
			}
			default->{
				System.out.println("You entered wrong option");
			}

			}
			System.out.println("Do you want to continue yes or no....");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("y"));
		System.out.println("Thank you for visiting our site ");
		sc.close();
	}

}
