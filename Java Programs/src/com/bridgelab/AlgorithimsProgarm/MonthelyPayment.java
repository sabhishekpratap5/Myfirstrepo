package com.bridgelab.AlgorithimsProgarm;
/**
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class MonthelyPayment {
	
	public static void main(String[] args) {
		
		
		double principale,rate,year;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Amount :");
		principale=scan.nextDouble();
		System.out.println("Please Enter the Rate :");
		rate=scan.nextDouble();
		System.out.println("Please Enter the year :");
		year=scan.nextDouble();
		Utility.monthlyPayment(year, principale, rate);
		
		scan.close();
		
	}

}
