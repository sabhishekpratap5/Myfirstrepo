package com.bridgelab.AlgorithimsProgarm;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class BinarySearchWordfromWordList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string[]=Utility.readWordFromFile();
		Arrays.sort(string);
		System.out.println("enter String ");


		String key=scan.nextLine();
		Utility.binarySearchInt(string,key);
		Utility.print(string,string.length);
	}

}
