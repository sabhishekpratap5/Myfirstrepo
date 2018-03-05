package com.bridgelab.functionalPrograms;
/**
*Purpose:Replace Username with a proper name 
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.regex.*;

import com.bridgelab.utility.Utility;

import java.util.*;
public class User_Name 
{ 

	public static void main(String []args){
		Scanner scan = new Scanner (System.in);
		String string = "Hello <<UserName>>, How are you?";

		System.out.println("enter username ");
		String username =scan.next();
		int n=username.length();
		if(n<3)
		{
			System.out.println("Username not valid");

		}
		else
		{
			System.out.println(Utility.replaceWithPattern(string, username));
		}



	}
}

