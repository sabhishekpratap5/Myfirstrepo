package com.bridgelab.functionalPrograms;
/**
 * Purpose:for find out the Harmonic number 
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class Harmonic_Number {



	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number=scan.nextDouble();
		double result=Utility.harmonicValue(number);

		if(number>0)
		{
			System.out.println("The Harmonic Value for the number is: "+result);
		}
		else
		{
			System.out.println("The number should be greater than zero");
		}
	}
}


