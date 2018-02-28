package com.bridgelab.utility;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {

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



	/**
	 * @param array
	 * @param low
	 * @param high
	 * @param key
	 * @return is key vlaue is true or false
	 */
	public static int binarySearch(int array[],int low,int high,int key)
	{
		int middel=(low+high)/2;


		if(high<low)
		{
			return -1;
		}
		if(key==array[middel])
		{
			return middel;
		}

		else if (key<array[middel])
		{
			return binarySearch(array,low, middel-1,key);
		}
		else
		{
			return binarySearch(array,middel+1,high,key);
		}

	}


	/**
	 * @param array
	 * @param low
	 * @param high
	 * @param key
	 * @return binary search method for string
	 */
	public static boolean binarySearchForString(char array[],int low,int high,char key)
	{
		int middel=(low+high)/2;


		if(high<low)
		{
			return false;
		}
		if(key==array[middel])
		{
			return true;
		}

		else if (key<array[middel])
		{
			return binarySearchForString(array,low, middel-1,key);
		}
		else
		{
			return binarySearchForString(array,middel+1,high,key);
		}

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




	//insertionsort for integer
	public static void insertionSort(int array[])
	{
		int i=1,key=0,j=0;
		for( i=1;i<array.length;i++)
		{

			key=array[i];
			j=i-1;

			while(j>=0 && array[j]>key)
			{
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;


		}


	}

	//Bubble Sort for Integer
	public static int[] bubbleSort(int numbers[])
	{
		int temp;
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 1; j < (numbers.length -i); j++)
			{
				//if numbers[j-1] > numbers[j], swap the elements
				if(numbers[j-1] > numbers[j])
				{
					temp = numbers[j-1];
					numbers[j-1]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		return numbers;
	}


	// bubbol sort for string

	/**
	 * @param string
	 * @return strin1 which is sorted string
	 */
	public static String[] bubbleSortString(String string)
	{
		String[] string1 = string.split(" ");

		for (int t = 0; t < string1.length - 1; t++) {
			for (int i= 0; i < string1.length - t -1; i++) {
				if(string1[i+1].compareTo(string1[i])<0) {
					String tempStr = string1[i];
					string1[i] = string1[i + 1];
					string1[i + 1] = tempStr;
				}
			}
		}
		return string1;
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
