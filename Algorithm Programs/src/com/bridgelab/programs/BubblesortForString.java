package com.bridgelab.programs;
import java.util.*;

import com.bridgelab.utility.Utility;
public class BubblesortForString {
	
	public static void bubbolString()
    {
        Scanner scan = new Scanner(System.in);
        String tempStr;


        System.out.print("Enter the strings > ");
        String s1 = new String(scan.nextLine());
        String string1[]=Utility.bubbleSortString(s1);
        
        for(int i=0;i<string1.length;i++)
        {
            System.out.print(string1[i]+" ");
        }
        
    }

}
