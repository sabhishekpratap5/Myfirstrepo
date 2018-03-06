/******************************************************************************
 *  Purpose: find out the windchill
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

public class WindChill {

	public static void main(String []args)
	{
		Utility utility = new Utility();

		System.out.println("Enter temperature ");
		double temperature =utility.inputDouble();

		System.out.println("Enter value of speed ");
		double value = utility.inputDouble();

		double windchill=Utility.windChill(temperature,value);

		if (windchill>0)
		{

			System.out.println("Windchill temperature is "+windchill);
		}
		else
		{
			System.out.println("invalid windchill ");
		}
	}


}
