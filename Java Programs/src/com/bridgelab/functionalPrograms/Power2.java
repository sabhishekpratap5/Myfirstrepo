package com.bridgelab.functionalPrograms;
/**
 * Purpose:for find out the power of 2 given number
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
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