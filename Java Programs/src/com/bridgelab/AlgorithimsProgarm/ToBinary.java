package com.bridgelab.AlgorithimsProgarm;
/**
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.util.*;

import com.bridgelab.utility.Utility;
public class ToBinary {
	public static void main(String[] args) {
		
		
		int num, array[]=new int[32] ;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number ");
		num =scan.nextInt();
		int[] str=Utility.toBinary(num);
		array=str;

		System.out.println();
		scan.close();
		
	}


}
