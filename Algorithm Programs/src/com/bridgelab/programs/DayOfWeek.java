package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class DayOfWeek {
	public static void main(String[] args) {
		   System.out.println("Program Started");
		   
		   System.out.println("Day of Week is :");
		   Scanner scanner=new Scanner(System.in);
		   int day,month,year;
		   System.out.println("Enter the day ");
		   day=scanner.nextInt();
		   System.out.println("Enter the month");
		   month=scanner.nextInt();
		   System.out.println("Enter the year ");
		   year=scanner.nextInt();
		   System.out.print("Week of the day is ");
		   Utility.dayOfWeek(day,month,year);
		  
		}

}
