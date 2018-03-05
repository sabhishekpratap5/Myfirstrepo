package com.bridgelab.functionalPrograms;
/**
 * Purpose:Quadratic distance find out
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class Quadratic {


	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the values of a, b and c");

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		double delta=Utility.quadratic( a, b, c);

	}	

}
