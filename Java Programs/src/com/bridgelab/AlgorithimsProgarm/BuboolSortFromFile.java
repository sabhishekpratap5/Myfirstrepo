package com.bridgelab.AlgorithimsProgarm;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class BuboolSortFromFile {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String str[]=Utility.insertionSortFromFile();
			
			Utility.bubbleSortInt(str);
			Utility.print(str,str.length);
		}


}
