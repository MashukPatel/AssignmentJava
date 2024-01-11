package com.assignment1;

import java.util.Scanner;

/*
Write a Java program to print the ASCII value of a given character.
*/

public class Practical_10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character to find it's ascii value : ");
		char c=sc.next().charAt(0);
		int value=c; //convert char to int to find it's ascii value
		
		System.out.println("Ascii value of "+c+" is "+value+".");
	}
}
