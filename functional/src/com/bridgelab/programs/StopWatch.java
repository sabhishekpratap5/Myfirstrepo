package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class StopWatch {

	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("if you want start the stopwatch then press 1 ");

		int choice = scan.nextInt();

		long elapsed=Utility.stopwatch(choice);

		System.out.println(elapsed);
	}

}
