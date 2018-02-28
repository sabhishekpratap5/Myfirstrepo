package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class WindChill {

	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter temperature ");
		double temperature = scan.nextDouble();

		System.out.println("Enter value of speed ");
		double value = scan.nextDouble();

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
