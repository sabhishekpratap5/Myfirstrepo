/******************************************************************************
 *  Purpose: for find out Binary number of the decimal number
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
public class ToBinary {
	public static void main(String[] args) {
		
		
		int num, array[]=new int[32] ;
		Utility utility = new Utility();
		System.out.println("Please Enter the Number ");
		num =utility.inputInteger();
		int[] str=Utility.toBinary(num);
		array=str;

		System.out.println();
		
	}


}
