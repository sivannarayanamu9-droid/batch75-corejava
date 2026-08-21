package com.arrays;

public class TestJaggedArrayDemo {

	public static void main(String[] args) {
		//Jagged Array :Arrays of array
		int[][] arr=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		
		arr[0][0] = 101;
		arr[0][1] = 102;
		arr[0][2] = 103;
		
		arr[1][0] = 104;
		arr[1][1] = 105;
		arr[1][2] = 106;
		arr[1][3] = 107;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
