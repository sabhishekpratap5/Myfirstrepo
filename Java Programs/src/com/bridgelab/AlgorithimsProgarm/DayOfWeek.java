/******************************************************************************
 *  Purpose: for find day of week from given day,month & year
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/


package com.bridgelab.AlgorithimsProgarm;
/**
*  @version 1.0
*  @since   05-03-2018
*/

import com.bridgelab.utility.Utility;
public class DayOfWeek {
	public static void main(String[] args) {
		   System.out.println("Program Started");
		   
		   System.out.println("Day of Week is :");
		   Utility utility = new Utility();
		   int day,month,year;
		   System.out.println("Enter the day ");
		   day=utility.inputInteger();
		   System.out.println("Enter the month");
		   month=utility.inputInteger();
		   System.out.println("Enter the year ");
		   year=utility.inputInteger();
		   System.out.print("Week of the day is ");
		   Utility.dayOfWeek(day,month,year);
		   
		}

}
