package com.assignment1;

import java.util.Scanner;

/*
• W.A.J.P to compare a given string to the specified character sequence. 
Example: 
given string : topsint.com
comparing string : topsint.com 
Both the string matched. 
*/

public class Practical_16 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String given=sc.nextLine();
		System.out.println("Enter a string to compare :");
		String compare=sc.nextLine();
		if(given.equals(compare))
		{
			System.out.println("Both the string matched.");
		}
		else
		{
			System.out.println("Both the string do not matched.");
		}
	}
}
