package com.bridgelab.programs;

import java.util.*;

import com.bridgelab.utility.Utility;
public class MergeSort {
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array length ");
		int n=scan.nextInt();
		int array[] = new int[n];

		System.out.println("enter array elements ");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}

		System.out.println("Given Array");
		Utility.printArray(array);

		Utility.sort(array, 0, array.length-1);

		System.out.println("\nSorted array");
		Utility.printArray(array);
	}
}

