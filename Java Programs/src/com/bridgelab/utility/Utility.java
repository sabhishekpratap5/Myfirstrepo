package com.bridgelab.utility;

import java.io.BufferedReader;
import java.util.*;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
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

	//prime factor method

	public static void primeFactor(int number)
	{
		String s="";


		for(int i=2;i<=number;)
		{ 
			if(number%i==0)
			{
				number=number/i;
				s+=i+" ";

			}
			else
			{
				i++;

				if(number%i==0)
				{
					number=number/i;
					s+=i+" ";

				}
			}
		} 


		System.out.println("Prime factor is "+s);
	}
	
	
	/**
	 * @param number
	 */
	public static void random1(int number)
	{
		Random r=new Random();
		for(int i=0;i<number;i++)
		{
			System.out.print(" "+r.nextInt(9999)+" ");
		}
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

	//Algorithim program

	/**
	 * @param char1
	 * @param char2
	 * its return anagram string
	 */
	public static void anagram( char char1[],char char2[])
	{
		if(char1.length!=char2.length)
		{
			System.out.println("not anagram");
		}

		else
		{
			Arrays.sort(char1);

			Arrays.sort(char2);
			boolean flag=true;
			for(int i=0; i<char1.length;i++)
			{
				if(char1[i]==char2[i])
				{
					flag=true;
				}
				else
				{
					flag=false;
					System.out.println("String is not anagram");
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("String is anagram");
			}
		}
	}

	//prime number 0 to 1000
	/**
	 * @param low
	 * @param high
	 * @return all prime value from given range
	 */
	public static int primeNumInRange(int low,int high) {
		for(int i=2; i<high; ++i)
		{
			int flag=0;
			for(int j=2; j<=i/2; ++j)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print(i);
		}
		return 0;
	}





		//print method for array integers
		/**
		 * @param array
		 * it is work for print the array
		 */
		public static void printArray(int array[])
		{
			int n = array.length;
			for (int i=0; i<n; ++i)
				System.out.print(array[i] + " ");
			System.out.println();
		}






		//Question number program method
		/**
		 * @param low
		 * @param power
		 * @return the asumed number.
		 */
		public static int questionNumber(int low,int power)
		{
			Scanner scan=new Scanner(System.in);

			if (low>power)
			{
				return -1;

			}
			if(power==low)
			{
				return low;
			}


			int middle=(low+power)/2;
			System.out.println("your number in between "+low+" to "+middle);
			System.out.println("if yes then type true if no then type false ");
			boolean flag =true;

			if(flag!=scan.nextBoolean())
			{
				low=middle+1;
			}
			else {
				power=middle;
			}
			return questionNumber(low, power);
		}


		//merge sort method
		/**
		 * @param array
		 * @param low
		 * @param high
		 * it is work for sort the array.
		 */
		public static void sort(int array[], int low, int high)
		{
			if (low < high)
			{

				int middle = (low+high)/2;


				sort(array, low, middle);
				sort(array , middle+1, high);


				merge(array, low, middle, high);
			}
		}

		/**
		 * @param array
		 * @param low
		 * @param middle
		 * @param high
		 * it is work for merge array.
		 */
		public static void merge(int array[], int low, int middle, int high)
		{

			int n1 = middle - low + 1;
			int n2 = high - middle;


			int array1[] = new int [n1];
			int array2[] = new int [n2];


			for (int i=0; i<n1; ++i)
				array1[i] = array[low + i];
			for (int j=0; j<n2; ++j)
				array2[j] = array[middle + 1+ j];

			int i = 0, j = 0;


			int k = low;
			while (i < n1 && j < n2)
			{
				if (array1[i] <= array2[j])
				{
					array[k] = array1[i];
					i++;
				}
				else
				{
					array[k] = array2[j];
					j++;
				}
				k++;
			}


			while (i < n1)
			{
				array[k] = array1[i];
				i++;
				k++;
			}


			while (j < n2)
			{
				array[k] = array2[j];
				j++;
				k++;
			}
		}

		//mergesort for string

		/**
		 * @param array
		 * @param low
		 * @param high
		 * it is give the sorted chracter of string
		 */
		public static void stringSort(char array[], int low, int high)
		{
			if (low < high)
			{

				int middle = (low+high)/2;


				stringSort(array, low, middle);
				stringSort(array , middle+1, high);


				stringMerge(array, low, middle, high);
			}
		}





		/**
		 * @param array
		 * @return its a generic method for insertion sorting and it give the sorted array and sorted string
		 */
		public static <T extends Comparable<T>> T[] insertionSortString(T[] array) {
			for (int i = 1; i < array.length; i++) {
				for (int j = i; j > 0; j--) {
					if ((array[j - 1]).compareTo(array[j]) > 0) {
						T temp = array[j];
						array[j] = array[j - 1];
						array[j - 1] = temp;
					}
				}
			}
			return array;
		}

		/**
		 * @param array
		 * @return its a generic method for bubbol sorting and it give the sorted array and sorted string
		 */
		public static <T extends Comparable<T>> T[] bubbleSortInt(T[] array) {
			for (int i = 1; i < array.length; i++) {
				for (int j = 0; j < array.length - i; j++) {
					if (array[j].compareTo(array[j + 1]) > 0) {
						T temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			return array;

		}

		/**
		 * @param array
		 * @param num
		 * @return genric binary search
		 */
		public static <T extends Comparable<T>> T[] binarySearchInt(T[] array, T num){
			int size = array.length;

			int start,end,mid,count=0;

			start = 0;
			end  = size-1;

			while(start <= end){
				mid = (start+end)/2;
				if (num.compareTo(array[mid])==0){
					System.out.println("Search found at position :"+(mid+1));
					count++;
					break;
				}
				if(num.compareTo(array[mid])<0)
					end = mid-1;
				else
					start = mid+1;		
			}
			if(count == 0)
				System.out.println("Search not found");
			return array;	

		}

		public static <T>void print(T[] array ,int number)
		{
			for(int j=0;j<number;j++) 
			{
				System.out.print(array[j]+" ");
			}
		}


		//read data from file	
		/**
		 * @return
		 */
		public static String[] readWordFromFile() 
		{
			String string[]=null;	 
			try
			{
				FileReader fr=new FileReader("/home/bridgelab/test.text");
				BufferedReader br=new BufferedReader(fr);

				String string2="";

				while(true)
				{
					string2=br.readLine();
					if(string2==null)
						break;
					else
						string=string2.split(" ");
				}
				br.close();
			}
			catch (Exception e)
			{
				e.printStackTrace(); 
			}
			return string;


		}

		/**
		 * @return
		 */
		public static String[] insertionSortFromFile() 
		{
			String string[]=null;	 
			try
			{
				FileReader fr=new FileReader("/home/bridgelab/aps.text");
				BufferedReader br=new BufferedReader(fr);

				String string2="";

				while(true)
				{
					string2=br.readLine();
					if(string2==null)
						break;
					else
						string=string2.split(" ");
				}
				br.close();
			}
			catch (Exception e)
			{
				e.printStackTrace(); 
			}
			return string;


		}



		/**
		 * @param array
		 * @param low
		 * @param middle
		 * @param high
		 * it is work for merge array.
		 */
		public static void stringMerge(char array[], int low, int middle, int high)
		{

			int n1 = middle - low + 1;
			int n2 = high - middle;


			int array1[] = new int [n1];
			int array2[] = new int [n2];


			for (int i=0; i<n1; ++i)
				array1[i] = array[low + i];
			for (int j=0; j<n2; ++j)
				array2[j] = array[middle + 1+ j];

			int i = 0, j = 0;


			int k = low;
			while (i < n1 && j < n2)
			{
				if (array1[i] <= array2[j])
				{
					array[k] = (char) array1[i];
					i++;
				}
				else
				{
					array[k] = (char) array2[j];
					j++;
				}
				k++;
			}


			while (i < n1)
			{
				array[k] = (char) array1[i];
				i++;
				k++;
			}


			while (j < n2)
			{
				array[k] = (char) array2[j];
				j++;
				k++;
			}
		}

		//Vending Machine
		/**
		 * @param value
		 * its give the number of note.
		 */
		public static void vendingMachine(int value)
		{
			int count=0;
			if(value>0)
			{
				while(value>=1000)
				{  
					count ++;
					value=value-1000;
					System.out.print("1000 ");
				}
				while(value>=500)
				{
					count++;
					value =value-500;
					System.out.print("500 ");
				}
				while(value>=100)
				{
					count++;
					value=value-100;
					System.out.print("100 ");
				}
				while(value>=50)
				{
					count++;
					value=value-50;
					System.out.print("50 ");
				}
				while(value>=10)
				{  
					count ++;
					value=value-10;
					System.out.print("10 ");
				}
				while(value>=5)
				{  
					count ++;
					value=value-5;
					System.out.print("5 ");
				}
				while(value>=2)
				{  
					count ++;
					value=value-2;
					System.out.print("2 ");
				}
				while(value>=1)
				{  
					count ++;
					value=value-1;
					System.out.print("1 ");
				}
			}
			else
			{
				System.out.println("Please input right amount "+count);
			}
			System.out.println();
			if(count>0)
			{
				System.out.println("Number of note "+count);
			}

		}



		//TemperaturConversion method

		/**
		 * @param temperatuer
		 * @return this method is use for converting the temperature.
		 */
		public static int temperaturConversiontoFarenhit(int temperatuer)
		{

			int F=((temperatuer* 9/5) + 32);
			return F;  


		}

		public static int temperaturConversiontoCelcius(int temperatuer)
		{

			int C=((temperatuer - 32) * 5/9);
			return C; 



		}

		/**
		 * @param day
		 * @param month
		 * @param year
		 * this method is using for find the day of week
		 */
		public static void dayOfWeek(int day,int month,int year) 
		{
			int m,x,d,y;
			y=year-(14-month)/12;
			x=y+y/4-y/100+y/400;
			m = month + 12 *((14-month)/12)-2;
			d = (day+ x + (31*m) / 12)%7;
			switch(d)
			{
			case 0:
			{
				System.out.println("O");
				System.out.println(day+" /"+month+" /"+year+" /"+"sunday");
				break;
			}
			case 1:{
				System.out.println("1");
				System.out.println(day+" /"+month+" /"+year+" /"+"monday");
				break;
			}
			case 2:{
				System.out.println("2");
				System.out.println(day+" /"+month+" /"+year+" /"+"tuesday");
				break;
			}
			case 3:{
				System.out.println("3");
				System.out.println(day+" /"+month+" /"+year+" /"+"wensday");
				break;
			}
			case 4:{
				System.out.println("4");
				System.out.println(day+" /"+month+" /"+year+" /"+"thursday");
				break;
			}
			case 5:{
				System.out.println("5");
				System.out.println(day+" /"+month+" /"+year+" /"+"friday");
				break;
			}
			case 6:{
				System.out.println("6");
				System.out.println(day+" /"+month+" /"+year+" /"+"saturday");
				break;
			}
			}
		}


		/**
		 * @param year
		 * @param principal
		 * @param rate
		 * calculate intrest of monthly
		 */
		public static void monthlyPayment(double year,double principal, double rate )
		{
			double payment =0;
			double l=100*12;
			double n=12*year;
			payment=principal*(Math.pow((1+(rate/l)), n))-principal;
			System.out.println("Monthly amount is "+payment);
		}


		/**
		 * @param num
		 * conver the binary number
		 */
		public static int[] toBinary(int num) 
		{
			int array[] =new int[32];
			int index=0;

			while(num!=0) 
			{
				array[index++]=num%2;
				num=num/2;

			}

			for(int i=index-1;i>=0;i--) 
			{
				System.out.print(array[i]);
			}

			System.out.println();
			return array;

		}

		/**
		 * @param c
		 * for sqrure the value
		 */
		public static void sqrt(double c) 
		{   
			double t1= Math.sqrt(c);
			System.out.println(t1);
			double t=c;
			double epsilon=1e-15;
			while(Math.abs(t-(c/t))>epsilon*t); 
			{
				t=((c/t)+t)/2.0;
			}
			System.out.println(c+"Squre of Number is :"+t);
		}


	}
