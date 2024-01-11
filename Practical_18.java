package com.assignment1;

import java.util.Scanner;

/*
W.A.J.P to check whether a given string starts with the contents of another string. 
Example:
string: Red is favorite color. 
Starts with: Red
True
*/

public class Practical_18 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		String[] seprate=str.split(" ");
		System.out.println("Starts with :");
		String check=sc.nextLine();
		if(check.equals(seprate[0]))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
