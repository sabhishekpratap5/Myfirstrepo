package com.bridgelab.programs;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class BubblesortForInt {
	
		
		public static void bubbolsortInt()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter array length ");
			int n = scan.nextInt();
			int array[]=new int[n];
			System.out.println("enter elements");

			for(int i=0;i<n;i++)
			{
				array[i]= scan.nextInt();
			}
			
			System.out.println("Given Array");
			Utility.printArray(array);
			     
			 Utility.bubbleSort(array);
			 System.out.println("\nSorted array");
	         
			 Utility.printArray(array);
			

		}

	}


