/******************************************************************************
 *  Purpose: for find out note of the given rupee . 
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

public class Vendingmachine {
	public static void main(String []args)
	{
		Utility utility = new Utility();

		System.out.println("enter amount ");
		int value =utility.inputInteger();

		Utility.vendingMachine(value);
	}

}
