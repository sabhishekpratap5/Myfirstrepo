package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class QuestionNumber {

	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int number = scan.nextInt();
		int power = (int) Math.pow(2, number)-1;
		int low=0;
		System.out.println("assume the number between "+low+" to "+power);
		

		int value=Utility.questionNumber(low,power);
		System.out.println("your asumed number is "+value);

	}

}
