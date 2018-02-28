package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class MonthelyPayment {
	
	public static void main(String[] args) {
		
		
		double principale,rate,year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the Amount :");
		principale=scanner.nextDouble();
		System.out.println("Please Enter the Rate :");
		rate=scanner.nextDouble();
		System.out.println("Please Enter the year :");
		year=scanner.nextDouble();
		Utility.monthlyPayment(year, principale, rate);
		
	}

}
