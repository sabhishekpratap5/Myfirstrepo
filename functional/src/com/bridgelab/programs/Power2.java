package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;

public class Power2 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scan.nextInt();

		Utility.power(number);
		System.out.println("Printing the all Power Value until "+number);


	}
}