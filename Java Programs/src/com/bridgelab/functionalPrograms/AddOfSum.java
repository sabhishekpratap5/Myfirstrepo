package com.bridgelab.functionalPrograms;
/**
 * Purpose:for find out the triplets which sum have 0. 
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class AddOfSum {
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.print("enter size of array ");
		int size=scan.nextInt();
		int array[]=new int [size];
		for(int i=0;i<array.length;i++)
		{
			System.out.print("enter "+(i+1)+" value :");
			array[i]=scan.nextInt();
		}


		int sum=Utility.addOfSum(array,size);
		System.out.println("Number of tripltes :"+sum);

	}

}
