/******************************************************************************
 *  Purpose: for find out the sorted array from a file using insertionsort. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/


package com.bridgelab.AlgorithimsProgarm;

import java.util.Arrays;


import com.bridgelab.utility.Utility;

public class InsertionSortFromFile {
	public static void main(String[] args) {
		String str[]=Utility.insertionSortFromFile();
		
		Utility.insertionSortString(str);
		Utility.print(str,str.length);
	}


}
