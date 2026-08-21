package com.arrays;

import java.util.Arrays;

public class TestBubbleSortDemo1 {
	
	public static void main(String[] args) {
		//int[] arr= {81,71,90,50,76,75};
		int[] arr= {10,20,30,40,50,60};
		System.out.println("Before Sorting :");
		System.out.println(Arrays.toString(arr));
		int temp=0;
		int count=0;
		int count1=0;
		//number of rotations
		for(int i=0;i<arr.length-1;i++) {
			//arr.length-1-i -->i represents we no need to check last value of an array
			boolean flag=false;
			for(int j=0;j<arr.length-1-i;j++) {
				//Compare one element to another element Ex:0th index compared to 1st Index element if it is greater then swap
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;//swapping done tht's why flag becomes true
				}
				count1++;//number of comparisons
			}
			count++;
			//if swapping is not done then flag becomes false 
			if(!flag) {
				break;
			}
		}
		System.out.println("Number of Rotaions happened :"+count);
		System.out.println("Number of Comparisions done :"+count1);
		System.out.println("After sorting :");
		System.out.println(Arrays.toString(arr));
	}

}
