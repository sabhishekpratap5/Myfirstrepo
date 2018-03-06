/******************************************************************************
 *  Purpose: for find out the Harmonic number 
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

public class Harmonic_Number {

	{
		Utility utility = new Utility();
		System.out.println("Enter a number: ");
		double number=utility.inputDouble();
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


