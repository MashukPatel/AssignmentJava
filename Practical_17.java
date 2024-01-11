package com.assignment1;

import java.util.Scanner;

/*
W.A.J.P to check whether a given string ends with the contents of another string. 
Example :
string : Java Exercises
Ends with : se
False 
*/

public class Practical_17 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		System.out.println("Enter last two ending character to check :");
		String check=sc.nextLine();
		String lasttwo="";
		lasttwo=str.substring(str.length()-2, str.length());
		
		if(check.equals(lasttwo))
		{
			System.out.println("String '"+str+"' ends with "+check+".");
		}
		else
		{
			System.out.println("String '"+str+"' do not ends with "+check+".");
		}
		
	}
}
