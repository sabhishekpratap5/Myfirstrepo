package com.bridgelab.AlgorithimsProgarm;
/**
 * for find out the anagarm of the String
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelab.utility.Utility;
public class Anagram {

	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String ");
		String s1=scan.next();
		System.out.println("Enter second string ");

		String s2=scan.next();

		String string1=s1.toLowerCase();
		String string2=s2.toLowerCase();

		int length1=string1.length();
		int length2=string2.length();
		char char1[]=string1.toCharArray();
		char char2[]=string2.toCharArray();

		Utility.anagram(char1,char2);
		scan.close();

	}

}
