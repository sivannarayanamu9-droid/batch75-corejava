package com.arrays;

import java.util.Arrays;

public class TestBubbleSortDemo {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 70, 80, 90, 30 };
		System.out.println("Before sorting ");
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;

				}
				count1++;

			}
			count++;
			if (!flag) {
				break;
			}
		}
		System.out.println("Count :" + count++);
		System.out.println("coount 1 :" + count1);
		System.out.println("After Sorting :");
		System.out.println(Arrays.toString(arr));
	}

}
