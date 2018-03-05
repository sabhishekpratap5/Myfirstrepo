package com.bridgelab.AlgorithimsProgarm;
/**
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class TemperaturConversion {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("enter your choice ctf or ftc ");
		String choice = scan.next();

		if(choice.equals("ctf"))
		{
			System.out.println("Enter temperatue in Celcious");
			int temperatuer = scan.nextInt();
			int f =Utility.temperaturConversiontoFarenhit(temperatuer);
			System.out.println("temperature in Farenhit  "+f);
		}
		else if (choice.equals("ftc"))
		{
			System.out.println("Enter temperatue in Fahrenheit");
			int temperatuer1 = scan.nextInt();
			int c =Utility.temperaturConversiontoCelcius(temperatuer1);
			System.out.println("temperature in Celcious "+c);
		}
		else
		{
			System.out.println("enter corect choice ");
		}
		scan.close();

	}

}
