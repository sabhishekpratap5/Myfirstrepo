package com.bridgelab.programs;
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
