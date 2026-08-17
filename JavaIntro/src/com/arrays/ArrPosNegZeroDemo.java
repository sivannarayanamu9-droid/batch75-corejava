package com.arrays;

import java.util.Arrays;

public class ArrPosNegZeroDemo {
	public static void main(String[] args) {
		System.out.println("main method started");
		int[] data = { 10, 20, 30, 40, 50, -10, -20, -30, -40, -50, 0, 0 };
		int[] posArray = new int[5];
		int[] negArray = new int[5];
		int[] zeroArr = new int[2];

		int posIndex = 0;
		int negIndex = 0;
		int zeroIndex = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > 0) {
				posArray[posIndex] = data[i];
				posIndex++;

			} else if (data[i] < 0) {
				negArray[negIndex] = data[i];
				negIndex++;
			} else {
				zeroArr[zeroIndex] = data[i];
				zeroIndex++;
			}
		}
		System.out.println("Actual Data :"+Arrays.toString(data));
		System.out.println("Positive values of given Data :\n"+Arrays.toString(posArray));
		System.out.println("Negative values of given Data :\n"+Arrays.toString(negArray));
		System.out.println("Zeros of given Data :\n"+Arrays.toString(zeroArr));

	}

}
