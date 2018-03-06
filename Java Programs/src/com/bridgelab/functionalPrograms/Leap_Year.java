/******************************************************************************
 *  Purpose: for find out the leap year 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/


package com.bridgelab.functionalPrograms;
/**
 *  @author  Abhishek Pratap Singh
 *  @version 1.0
 *  @since   05-03-2018
 */
import com.bridgelab.utility.Utility;

public class Leap_Year {

	public static void main(String[] args)
	{	
		Utility utility = new Utility();
		System.out.println("Enter a leap year:");
		int year=utility.inputInteger();
		boolean result = Utility.leapYear(year);

		if(result)
		{
			System.out.println("Year=>"+ year + " is a leap year");
		}
		else
		{
			System.out.println("Year=>"+ year + " is not a leap year");


		}	
	}	


}
