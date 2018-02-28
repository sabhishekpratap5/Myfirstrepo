package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class Vendingmachine {
	
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter amount ");
		int value = scan.nextInt();
		
		 Utility.vendingMachine(value);
	}

}
