package com.assignment1;

/*
W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
exception and another one is to handle 
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0; 
*/

public class Practical_38 
{
	public static void main(String[] args)
	{	
		int a=10,b=1,c;
		int[] arr= {10,20,30,40};
		try
		{
			System.out.println("Division is : "+(a/b));
			
			System.out.println(arr[4]);
			
			
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
