package com.logicalstatements;

import java.util.Scanner;

public class TrafficSignals {
	static String getSignalsData(int signalId)
	{
		int trafficSignalId=signalId;
		String signal="";
		return switch(trafficSignalId)
		{
		case 1->{
			yield "Red means stop";
		}
		case 2->{
			yield "Yellow means ready start";
		}
		case 3->{
			yield "Green means Go";
		}
		default->{
			yield "You enterd wrong signal";
		}
		};
		//return signal;
	}
	public static void main(String[] args)
	{
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		String choice;
		int inputSignalId=0;
		do {
			System.out.println("*************Welcome to Traffic signal Awairness*************");
			System.out.println("1.RED → STOP");
			System.out.println("2.YELLOW → READY");
			System.out.println("3.GREEN → GO");
			System.out.println("Enter signal :");
			inputSignalId=sc.nextInt();
			String outputSignalValue=getSignalsData(inputSignalId);
			System.out.println("You entered signal is :"+outputSignalValue);
			System.out.println("Do you want to continue yes or no :");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("y"));
		System.out.println("Thank you for your time .......follow traffic rules have a safe ride ");		
		System.out.println("main method ended");
		sc.close();
	}

}
