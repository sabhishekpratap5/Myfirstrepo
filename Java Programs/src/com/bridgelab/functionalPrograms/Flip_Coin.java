package com.bridgelab.functionalPrograms;
/**
 * Purpose:FlipCoin program
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class Flip_Coin {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("how many time you want flip coin give the number ");
		int n=scan.nextInt();
		Utility.flipCoin(n);
	}

}
