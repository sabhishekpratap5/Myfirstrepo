package com.bridgelab.AlgorithimsProgarm;
/**
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class Vendingmachine {
	
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter amount ");
		int value = scan.nextInt();
		
		 Utility.vendingMachine(value);
		 scan.close();
	}

}
