package com.bridgelab.programs;

import com.bridgelab.utility.Utility;

public class Permutation
{

	public static void main(String[] args)
	{
		String string = "ABC";
		int n = string.length();
		Utility.permute(string, 0, n-1);
	}

}