package com.bridgelab.programs;
import java.util.*;
public class SearchingAndSorting {
	public static void main(String[]args)
	{

		BubblesortForString bs = new BubblesortForString();

		Insertionsort in = new Insertionsort();

		BubblesortForInt bi = new BubblesortForInt();

		BinarySearch bsi = new BinarySearch();

		BinarysearchForString bss=new BinarysearchForString();

		Scanner scan = new Scanner(System.in);

		System.out.println("if you want bubbol sort for string then press 1 ");
		System.out.println("------------------------------------------------------------------------ ");
		System.out.println("if you want insertion sort for integer then press 2 ");
		System.out.println("------------------------------------------------------------------------ ");
		System.out.println("if you want bubbol sort for integer then press 3 ");
		System.out.println("------------------------------------------------------------------------ ");
		System.out.println("if you want use binary search  for integer then press 4 ");
		System.out.println("------------------------------------------------------------------------ ");
		System.out.println("if you want use binary search  for String then press 5 ");
		System.out.println("------------------------------------------------------------------------ ");
		System.out.println("for exit press any key ");
		System.out.println("------------------------------------------------------------------------ ");
		System.out.println("enter your choice ");


		int choice = scan.nextInt();

		switch(choice)
		{
		case 1:bs.bubbolString();
		break;

		case 2:in.insertionInt();
		break;
		case 3:bi.bubbolsortInt();
		break;

		case 4:bsi.binarysearchInt();
		break;

		case 5:bss.binarysearchString();
		break;

		default :System.out.println("program exit ");;
		}


	}

}
