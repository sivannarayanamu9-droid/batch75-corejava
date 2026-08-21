package com.arrays;

public class TwoDimArrayDemo {
	public static void main(String[] args) {
		System.out.println("main method started");
		//Two dimensional Array :
		//Whenever we want to represent row and columns then we will go for two dimensional array
		//Array declaration and creation
		int[][] arr=new int[3][3];
		//Array initialization
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		
		System.out.println("number of rows in a array :"+arr.length);
		System.out.println("number of columns in an array :"+arr[0].length);
		
		//Accessing array of elements using inner loop
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Using for each loop");
		//using for each loop
		for(int[] a1 :arr) {
			for(int n:a1) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
	}

}
