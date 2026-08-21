package com.arrays;

import java.util.Scanner;

public class StudentrrayDetails {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int numberOfRows=sc.nextInt();
		System.out.println("Enter number of columns");
		int numberOfColumns=sc.nextInt();
		//Array declaration and creation
		int[][] arr=new int[numberOfRows][numberOfColumns];
		System.out.println("Number of rows is :"+arr.length);
		System.out.println("Number of Columns are :"+arr[0].length);		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.print("Enter values of "+i+" "+j+" --> ");
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	

}
