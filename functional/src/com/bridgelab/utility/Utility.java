package com.bridgelab.utility;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	
	/**
	 * @param string
	 * @param replace	  
	 * @return
	 */
	public static String replaceWithPattern(String string,String replace){

		Pattern pattern = Pattern.compile("<<UserName>>");
		Matcher match = pattern.matcher(string);



		return match.replaceAll(replace);
	}
	
	/**
	 * @param number
	 */
	public static void flipCoin(int number)
	{
		int head=0;int tell=0;
		for(int i=1;i<=number;i++)
		{
			double random=Math.random();

			if(random>0 && random<0.5)
			{
				tell++;
			}
			else if(random>0.5 && random<1)
			{
				head++;
			}
		}

		float h_pr = (head*100)/number;
		float t_pr = (tell*100)/number;
		System.out.println("Number of Head "+head);
		System.out.println("Total Precent of Head "+ h_pr+"%");
		System.out.println("Number of Tail "+tell);
		System.out.println("Total Precent of tail "+ t_pr+"%");
		
	}
	
	/**
	 * @param year
	 * @return
	 */
	public static boolean leapYear(int year)
	{
		if(year>1000)
		{
			if(((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0))
			{
				return true;
			}
		}
		return false;

	}

	
	/**
	 * @param number
	 * @return power of 2 until number
	 */
	public static double power(int number)
	{
		for(int i=1;i<=number;i++)
        {
        	double power=(Math.pow(2, i));
         	System.out.println("Power of 2^" +i +" is: "+power);	
        }
		return number;
		
	}
	
	
	/**
	 * @param number
	 * @return harmonic value until number
	 */
	public static double harmonicValue(double number)
	{
		
        double value = 0.0;

		for (int i = 1; i <= number; i++) 
		{
		
		value = value + (1.0/i);
		}
	return value;
	}
	
	
	/**
	 * @param stack
	 * @param goal
	 * @param NoOfTimes
	 * @return its return the percents of win && loss
	 */
	public static int GamblerGame(int stack,int goal,int NoOfTimes)
	{
		int loss = 0;        
		int wins = 0; 
		int cash=0;
		for (int i=0; i< NoOfTimes; i++) 
		{
			cash = stack;
	            
			while (cash > 0 && cash < goal)
			{
				loss++;
	        
				if (Math.random() < 0.5) 
					cash++;     
				else                     
					cash--;     
			}
	            if (cash == goal) 
	            	wins++;                   
		}

		
		System.out.println();
		System.out.println(wins + " wins of " + NoOfTimes);
		System.out.println("Percent of games won = " + 100 * wins / NoOfTimes);
		System.out.println("Percent of games loss = " + (100-(100*wins / NoOfTimes)));
		return cash;
		
	}



	
	/**
	 * @param array
	 * @param length
	 * @return its return the 
	 */
	public static int addOfSum(int array[],int length)
	{
		System.out.println();
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{

					if (array[i] + array[j] + array[k] == 0)
					{
						System.out.println(array[i] + " " + array[j] + " " + array[k]);
						count++;
					}
				}
			}
		}

		return count;
	}
	
	
	/**
	 * @param argument1
	 * @param argument2
	 * @return its return the distance between two arguments;
	 */
	public static double distanceOfTwoArguments(int argumentX,int argumentY)
	{
		double distance = Math.sqrt(argumentX*argumentX + argumentX*argumentY);
		System.out.println("distance from (" + argumentX + ", " + argumentY + ") to (0, 0) = " + distance);
		return distance;
	}
	
	
	
	/**
     * @param string
     * @param l
     * @param permute strings of the string
     */
    public static void permute(String string, int l, int r)
    {
        if (l == r)
            System.out.println(string);
        else
        {
            for (int i = l; i <= r; i++)
            {
                string = swap(string,l,i);
                permute(string, l+1, r);
                string = swap(string,l,i);
            }
        }
    }
 
    
    /**
     * @param a
     * @param i
     * @param j
     * @return swap of string
     */
    public static String swap(String a, int i, int j)
    {
        char tempreri;
        char[] charArray = a.toCharArray();
        tempreri = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = tempreri;
        return String.valueOf(charArray);
    }
    
    
    
    /**
	 * @param choice
	 * @return elapsed time
	 */
	public static long stopwatch(int choice)
	{
		long startTime = 0;
		long stopTime =0;
		Scanner scan = new Scanner(System.in);

		while(choice==1)
		{
			startTime=System.currentTimeMillis();
			System.out.println("start time : "+startTime);
			System.out.println("if you want stop the stopwatch then press 0 ");
			choice = scan.nextInt();
		}
		stopTime=System.currentTimeMillis();
		System.out.println("stop time : "+stopTime);
		long elapsed=(stopTime-startTime);
		return elapsed;

	}
	
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return delta
	 */
	public static double quadratic(double a,double b,double c)
	{
		double root1 = 0;
		double root2 = 0;

		double delta = b * b - 4 * a * c;

		if (delta > 0){

			
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("The equation has two real roots " + root1 + " and " + root2);
		}
		
		return delta;

	}
	
	
	/**
	 * @param temperature
	 * @param value
	 * @return windchill temprature
	 */
	public static double windChill(double temperature,double value)
	{
		double windchill=0.0;
		if (temperature>50 && (value>3 && value<120))
		{
			 windchill = (35.74 + (0.6215*temperature)+((0.4275*temperature)-35.75)*Math.pow(2, 0.16));
		}
		return windchill;



	}

}
