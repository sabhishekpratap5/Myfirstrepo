package com.bridgelab.functionalPrograms;
/**
 * for find out the 2D matrix 
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import java.io.PrintWriter;
	import java.util.*;

public class Array2d {
	

	
		public static void main(String[] args)
		{
			Scanner scan= new Scanner(System.in);
			System.out.println("enter number of rows ");
			int m = scan.nextInt();
			System.out.println("enter number of columns ");
			int n = scan.nextInt(); 
			        
			
			int    a[][] =arrayInt(m,n);
			double b[][]   =arrayDouble(m,n);
			String c[][]  =arrayBoolean(m,n);
			        
			
			display(a,b,c,m,n);
			        
		}
		
			public static int[][] arrayInt(int m,int n)
			{
				int a[][]=new int[m][n];
				Scanner scan=new Scanner(System.in);    
				System.out.println();
				System.out.println("Integer Array");
		
				for(int i = 0; i<m; i++)
				{
					for (int j = 0; j<n; j++)
				    {
						a[i][j] = scan.nextInt();
				    }   
				}
				return a;
			}
			
			public static double[][] arrayDouble(int m,int n)
			{
				double b[][]=new double[m][n];
				Scanner scan=new Scanner(System.in);    
				System.out.println();
				System.out.println("Double Array");
		
				for(int i = 0; i<m; i++)
				{
					for (int j = 0; j<n; j++)
				    {
						b[i][j] = scan.nextDouble();
				    }   
				}
				return b;
			}
			
			public static String[][] arrayBoolean(int m,int n)
			{
			String c[][]=new String[m][n];
			Scanner scan=new Scanner(System.in);    
			System.out.println();
			System.out.println("Boolean Array");
		
				for(int i = 0; i<m; i++)
				{
					for (int j = 0; j<n; j++)
					{
						c[i][j] = scan.nextLine();
					}   
				}
			return c;
			}
		
			
			public static void display(int[][]a,double[][]b,String[][]c,int m,int n)
			{
			PrintWriter pw=new PrintWriter(System.out,true);
			
			
			System.out.println();
			pw.println("2D ARRAY INTEGER");
			
			for(int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
		        {
					pw.print("\t"+a[i][j]+" ");
		        } 
		     pw.println("\t");
		    }
			 
			 
			System.out.println();
			pw.println("2D ARRAY DOUBLE");
				
			for(int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
			    {
					pw.print("\t"+b[i][j]+" ");
			    } 
			pw.println("\t");
			}
				 
			//display boolean
			System.out.println();
			pw.println("2D ARRAY BOOLEAN");
					
			for(int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
				{
					pw.print("\t"+c[i][j]+" ");
				} 
			pw.println("\t");
			}
		}
	}


