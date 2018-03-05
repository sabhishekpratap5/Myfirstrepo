package com.bridgelab.functionalPrograms;
/**
 * Purpose:for find out the prime factor of this given number
 *  @author  AbhishekPratapSingh
 *  @version 1.0
 *  @since   05-03-2018
 */
import java.util.*;

import com.bridgelab.utility.Utility;
public class Prime_Factor {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number for findout the prime factor ");
		int number=scan.nextInt();

		String s="";
		Utility.primeFactor(number);


		

	}
}