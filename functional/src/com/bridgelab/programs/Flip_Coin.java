package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class Flip_Coin {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("how many time you want flip coin give the number ");
		int n=scan.nextInt();
		Utility.flipCoin(n);
	}

}
