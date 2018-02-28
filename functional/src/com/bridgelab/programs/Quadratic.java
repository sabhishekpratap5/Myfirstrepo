package com.bridgelab.programs;
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
