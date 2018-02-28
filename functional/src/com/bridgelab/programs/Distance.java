package com.bridgelab.programs;
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



