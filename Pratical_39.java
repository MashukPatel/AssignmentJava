package com.assignment1;

/*
W.A.J. P to implement the above program using nesting of try-catch 
block.
*/
public class Pratical_39 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=10,b=5,c;
			int[] arr= {10,20,30,40};
			System.out.println("Division is : "+(a/b));
			
			try
			{
				System.out.println("Value at index is :"+arr[4]);
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
			}
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
		}
	}
}
