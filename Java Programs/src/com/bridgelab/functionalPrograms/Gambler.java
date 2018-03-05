package com.bridgelab.functionalPrograms;
/**
 * Purpose:for find out the Gambler game 
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;

public class Gambler 
{

	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter stack value: ");
		int stack=scan.nextInt();
		System.out.println("Enter goal value: ");
		int goal=scan.nextInt();
		System.out.println("Enter number of times for play: ");
		int NoOfTimes=scan.nextInt();

		Utility.GamblerGame(stack,goal,NoOfTimes);  

	}
}