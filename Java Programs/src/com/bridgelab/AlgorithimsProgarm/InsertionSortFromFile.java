package com.bridgelab.AlgorithimsProgarm;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class InsertionSortFromFile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str[]=Utility.insertionSortFromFile();
		
		Utility.insertionSortString(str);
		Utility.print(str,str.length);
	}


}
