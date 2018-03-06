/******************************************************************************
 *  Purpose: for find out the temperature conversion
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
public class TemperaturConversion {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("enter your choice ctf or ftc ");
		String choice = utility.inputString();

		if(choice.equals("ctf"))
		{
			System.out.println("Enter temperatue in Celcious");
			int temperatuer =utility.inputInteger();
			int f =Utility.temperaturConversiontoFarenhit(temperatuer);
			System.out.println("temperature in Farenhit  "+f);
		}
		else if (choice.equals("ftc"))
		{
			System.out.println("Enter temperatue in Fahrenheit");
			int temperatuer1 = utility.inputInteger();
			int c =Utility.temperaturConversiontoCelcius(temperatuer1);
			System.out.println("temperature in Celcious "+c);
		}
		else
		{
			System.out.println("enter corect choice ");
		}

	}

}
