package com.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrPosNegWithoutSize {
	public static void main(String[] args) {
		System.out.println("main method started");

		int[] numbersData = { 10, 20, 30, 40, 50, -10, -20, -30, -40, -50, 0, 0 };
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		for (int i = 0; i < numbersData.length; i++) {
			if (numbersData[i] > 0) {
				positiveCount++;
			} else if (numbersData[i] < 0) {
				negativeCount++;
			} else {
				zeroCount++;
			}
		}
		int[] positiveData = new int[positiveCount];
		int[] negativeData = new int[negativeCount];
		int[] zeroData = new int[zeroCount];
		int positiveIndex = 0;
		int negativeIndex = 0;
		int zeroIndex = 0;
		for (int i = 0; i < numbersData.length; i++) {
			if (numbersData[i] > 0) {
				positiveData[positiveIndex] = numbersData[i];
				positiveIndex++;
			} else if (numbersData[i] < 0) {
				negativeData[negativeIndex] = numbersData[i];
				negativeIndex++;
			} else {
				zeroData[zeroIndex] = numbersData[i];
				zeroIndex++;
			}
		}
		System.out.println(Arrays.toString(positiveData));
		System.out.println("Length of the positive values :" + positiveData.length);
		System.out.println(Arrays.toString(negativeData));
		System.out.println("Length of the negative values :" + negativeData.length);
		System.out.println(Arrays.toString(zeroData));
		System.out.println("Length of the zero values :" + zeroData.length);

	}

}
