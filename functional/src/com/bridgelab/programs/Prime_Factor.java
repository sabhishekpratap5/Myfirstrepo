package com.bridgelab.programs;
import java.util.*;
public class Prime_Factor {
	
	 public static void main(String args[])
	 {
	  Scanner sc=new Scanner(System.in);
	  int number=sc.nextInt();
	  
	  String s="";


	  for(int i=2;i<=number;)
	  { 
	   if(number%i==0)
	   {
	    number=number/i;
	    s+=i+" ";
	        
	   }
	   else
	   {
	    i++;
	     
	    if(number%i==0)
	    {
	     number=number/i;
	     s+=i+" ";
	       
	    }
	   }
	  } 

	 
	  System.out.println("Prime factor is "+s);
	   
	 }
	}