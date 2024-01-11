package com.assignment1;

import java.util.Scanner;

/*
Take two numbers from the user and perform the division operation and handle 
Arithmetic Exception. 
*/
public class Practical_37 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 1 :");
		int a=sc.nextInt();
		System.out.println("Enter value 2 :");
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("Division is : "+c);
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
}
