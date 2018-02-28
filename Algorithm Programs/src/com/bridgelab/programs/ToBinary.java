package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class ToBinary {
	public static void main(String[] args) {
		
		
		int num, array[]=new int[32] ;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the Number ");
		num =scanner.nextInt();
		int[] str=Utility.toBinary(num);
		array=str;

		System.out.println();
		
	}


}
