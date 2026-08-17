package com.arrays;

import java.util.Arrays;

public class ArrDemo {
	public static void main(String[] args)
	{
		int[] a1= {1,2,3};
		int[] a2= {4,5,6};
		int[] a3=new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					a3[i]=a1[i]+a2[j];
					
					
				}
			}
			
		}
		System.out.println(Arrays.toString(a3));
	}

}
