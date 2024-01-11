package com.assignment1;

import java.util.Scanner;

/*
W.A.J.P to get the character at the given index within the String. 
Example:
string= Tops Technologies! 
The character at position 0 is T 
The character at position 10 is o 
*/

public class Practical_14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		System.out.println("Enter a number to find character at that posotion (start from 0) :");
		int n=sc.nextInt();
		System.out.println("The character at position "+n+" is "+str.charAt(n)+".");
	}
}
