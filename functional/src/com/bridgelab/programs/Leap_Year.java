package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class Leap_Year {

	public static void main(String[] args)
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a leap year:");
		int year=scan.nextInt();
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
