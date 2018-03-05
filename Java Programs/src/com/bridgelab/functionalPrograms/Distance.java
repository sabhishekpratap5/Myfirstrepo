package com.bridgelab.functionalPrograms;
/**
 * Purpose:for find out the distance between x and y arguments
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class Distance {
	
	
	public static void main(String[] args) {

        
		Scanner scan = new Scanner (System.in);
		System.out.println("enter first number ");
        int argumentX = scan.nextInt();
        System.out.println("enter second number ");
        int argumentY = scan.nextInt();

        
        Utility.distanceOfTwoArguments(argumentX, argumentY);
 
        
        
    }   
}



