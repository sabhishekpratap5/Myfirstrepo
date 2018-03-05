package com.bridgelab.AlgorithimsProgarm;
/**
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class MergesortforString {
	
	public static void printArray(char array[])
	{
		int n = array.length;
		for (int i=0; i<n; ++i)
			System.out.print(array[i]);
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String str=scan.next();
		char array[]=str.toCharArray();
		
		Utility.stringSort(array,0,array.length-1);
		printArray(array);
		
		scan.close();
	}


}
