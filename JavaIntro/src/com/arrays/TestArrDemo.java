package com.arrays;

public class TestArrDemo {
	
	public static void main(String[] args) {
		//int[][] arr= {{}};
		//System.out.println(arr);//[[I@2b2fa4f7 address
		int[][] arr= {{1,2,3,4},{5,6,7},{8,9},{10}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//for each
		for(int[] row:arr) {
			for(int element:row) {
				System.out.print(element+" ");
			}
			System.out.println();
		}

	}

}
