package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class BinarysearchForString {

	public static void binarysearchString()

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enters tring ");
		String string1 = scan.next();
		char string[]=string1.toCharArray();
		int low =0,high=string.length;
		System.out.println("enter key for serching ");
		char key = scan.next().charAt(0);

		boolean a= Utility.binarySearchForString(string,low,high,key);
		if (a)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
