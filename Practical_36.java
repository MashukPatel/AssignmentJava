package com.assignment1;

/*
W.A.J. P to demonstrate try catch block, 
*/
public class Practical_36 
{
	public static void main(String[] args) 
	{
		try 
		{
			int[] a= {10,20,30,40};
			System.out.println(a[4]);
		}
		catch (Exception e) 
		{
			System.out.println("Length of the array is 3.please enter between 0 to 3.");
			e.printStackTrace();
		}
		System.out.println("Text after catch block.");
	}
}
