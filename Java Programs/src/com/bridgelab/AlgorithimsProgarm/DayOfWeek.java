package com.bridgelab.AlgorithimsProgarm;
/**
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class DayOfWeek {
	public static void main(String[] args) {
		   System.out.println("Program Started");
		   
		   System.out.println("Day of Week is :");
		   Scanner scan=new Scanner(System.in);
		   int day,month,year;
		   System.out.println("Enter the day ");
		   day=scan.nextInt();
		   System.out.println("Enter the month");
		   month=scan.nextInt();
		   System.out.println("Enter the year ");
		   year=scan.nextInt();
		   System.out.print("Week of the day is ");
		   Utility.dayOfWeek(day,month,year);
		   
		   scan.close();
		}

}
