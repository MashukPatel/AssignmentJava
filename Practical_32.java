package com.assignment1;

import java.util.Scanner;

/*
Write a program to print the factorial of a number by defining a method named 
'Factorial'. Factorial of any number n is represented by n! 
*/

class Calculation
{
	public void factorial(int n)
	{
		int fact=1;
		if(n==0)
		{
			System.out.println("Factorial is 0.");
		}
		else if(n<0)
		{
			System.out.println("Please enter a positive integer.");
		}
		else
		{
			for(int i=n;i>=1;i--)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+" is "+fact);
		}
		
	}
}

public class Practical_32 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Calculation c1=new Calculation();
		
		System.out.println("Enter a number to find it's factorial :");
		int n=sc.nextInt();
		
		c1.factorial(n);
	}
}
