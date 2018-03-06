/******************************************************************************
 *  Purpose: for find out the monthly interest from payment. 
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
public class MonthelyPayment {

	public static void main(String[] args) {

		double principale,rate,year;
		Utility utility = new Utility();
		System.out.println("Please Enter the Amount :");
		principale=utility.inputDouble();
		System.out.println("Please Enter the Rate :");
		rate=utility.inputDouble();
		System.out.println("Please Enter the year :");
		year=utility.inputDouble();
		Utility.monthlyPayment(year, principale, rate);


	}

}
