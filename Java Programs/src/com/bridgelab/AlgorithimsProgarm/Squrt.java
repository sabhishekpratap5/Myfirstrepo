package com.bridgelab.AlgorithimsProgarm;
/**
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class Squrt {
	public static void main(String[] args) {
		 
 		System.out.println("Please Enter the number ");
 		Scanner scan=new Scanner(System.in);
 		double num=scan.nextInt();
 		Utility.sqrt(num);
 		
 		scan.close();
	}

}
