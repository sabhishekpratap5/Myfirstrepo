package com.bridgelab.functionalPrograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class CoupnNumber {
	
	public static void main(String [] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the number of coupen ");
		int number=scan.nextInt();
		System.out.println("----------------------------------");
		Utility.random1(number);
		System.out.println();
		scan.close();
	}

}
