/******************************************************************************
 *  Purpose:count the elapsed time from a stopwatch
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
public class StopWatch {

	public static void main(String [] args)
	{
		Utility utility = new Utility();
		System.out.println("if you want start the stopwatch then press 1 ");

		int choice = utility.inputInteger();

		long elapsed=Utility.stopwatch(choice);

		System.out.println(elapsed);
	}

}
