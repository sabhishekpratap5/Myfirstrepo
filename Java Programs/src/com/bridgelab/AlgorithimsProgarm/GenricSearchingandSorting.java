package com.bridgelab.AlgorithimsProgarm;
/**
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class GenricSearchingandSorting {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter size of array ");
		int n = scan.nextInt();

		System.out.println("if you want sort the integer array using insertion sort then press 1");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want sort the string array using insertion sort then press 2");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want sort the integer array using bubbol sort then press 3");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want sort the string array using bubbol sort then press 4");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want search any integer key using binary search then press 5");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want searh any string key then press  6");
		System.out.println("--------------------------------------------------------------------");


		Integer array[];
		
		String stringArray[];
		String str[];

		System.out.println("enter choice ");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.println("enter integer element ");

			 array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			array= Utility.insertionSortString(array);
			Utility.print(array, array.length);
			break;

		case 2:
			System.out.println("enter String ");
			 stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = scan.next();
			}
			str = Utility.insertionSortString(stringArray);
			Utility.print(str, stringArray.length);

			break;
			
		case 3:
			System.out.println("enter integer element ");

			 array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			array = Utility.bubbleSortInt(array);
			Utility.print(array, array.length);
			break;

		case 4:
			System.out.println("enter String ");
			 stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = scan.next();
			}
			 str = Utility.bubbleSortInt(stringArray);
			 Utility.print(str, stringArray.length);

			break;
			
		case 5:
			System.out.println("enter integer element ");

			 array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			Utility.insertionSortString(array);
			System.out.println("enter key ");
			Integer key = scan.nextInt();
			array = Utility.binarySearchInt(array,key);
			Utility.print(array, array.length);
			break;

		case 6:
			System.out.println("enter String ");
			 stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = scan.next();
			}
			
			Utility.insertionSortString(stringArray);
			System.out.println("enter Stringkey ");
			String stringKey = scan.next();
			System.out.println();
			str = Utility.binarySearchInt(stringArray,stringKey);
			Utility.print(str, stringArray.length);

			break;
		default: System.out.println("program end");

		}
		scan.close();
	}

}
