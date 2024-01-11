package com.assignment1;

import java.util.Scanner;

/*
 
Write a Java program that reads a positive integer and count the number of digits the 
number. 

*/
public class Practical_8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer : ");
		int num=sc.nextInt();
		if(num>=0)
		{
			char[] a=String.valueOf(num).toCharArray();
			int count=a.length;
			System.out.println("Number of digit in the given value is "+count+".");
		}
		else
		{
			System.out.println("Please enter positive integer.");
		}
	}
}
