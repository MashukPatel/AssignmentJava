package com.assignment1;

/*
Write a Java program to Take three numbers from the user and print the greatest 
number.
*/

import java.util.Scanner;

public class Practical_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int a=sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int b=sc.nextInt();
		
		System.out.println("Enter Number 3: ");
		int c=sc.nextInt();
		
		if(a>=b && a>=c)
		{
			System.out.println(a+" is greatest number.");
		}
		else if(b>=a && b>=c)
		{
			System.out.println(b+" is greatest number.");
		}
		else
		{
			System.out.println(c+" is greatest number.");
		}
		
	}
}
