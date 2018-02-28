package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class BinarySearch {
	
	public static void binarysearchInt()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("enter array length ");

		int n = scan.nextInt();
		int array[] = new int [n];
		int low=0,high=n;
		System.out.println("enter element in sorted order ");
		for(int i=0; i<n; i++)
		{
			array[i]=scan.nextInt();
		}

		System.out.println("enter key for serching ");
		int key = scan.nextInt();
		int a=	Utility.binarySearch(array,low, high, key);
		if (key==-1)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}

}
