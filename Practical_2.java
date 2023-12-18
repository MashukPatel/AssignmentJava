package com.assignment1;

import java.util.Scanner;

/*
Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message. 
*/

public class Practical_2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character from A-Z :");
		char c=sc.next().charAt(0);
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{
				System.out.println(c+" is a vowel.");
			}
			else
			{
				System.out.println(c+" is a consonant.");
			}
		}
		else
		{
			System.out.println("Invalid Character.");
			System.out.println("Please enter a character between a to z.");
		}
		
		
	}
}
