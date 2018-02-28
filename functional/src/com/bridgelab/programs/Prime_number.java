package com.bridgelab.programs;
import java.util.*;
public class Prime_number {
	/**
	 * @param low
	 * @param high
	 * @return all prime value from given range
	 */
	public static int primeNumInRange(int low,int high) {
		for(int i=2; i<high; ++i)
		   {
		     int flag=0;
		      for(int j=2; j<=i/2; ++j)
		      {
		         if(i%j==0)
		         {
		            flag=1;
		            break;
		         }
		      }
		      if(flag==0)
		    	  System.out.println(i);
		   }
		return 0;
		  
	}
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter starting value range ");
		int low =scan.nextInt();
		System.out.println("enter last value of range ");
		int high = scan.nextInt();
		
		primeNumInRange(low , high);
	}
}

