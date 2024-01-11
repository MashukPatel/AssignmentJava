package com.assignment1;

import java.util.Scanner;

/*
Write a Java program to count the letters, spaces, numbers and other characters of 
an input string. 
*/

public class Practical_9 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		
		int letter=0;  //count letters
		int space=0; //count spaces
		int num=0; //count numbers
		int special=0; //count special characters
		
		for(int i=0;i<a.length;i++)
		{
			if(Character.isLetter(a[i]))
			{
				letter++;
			}
			else if(Character.isDigit(a[i]))
			{
				num++;
			}
			else if(Character.isSpace(a[i]))
			{
				space++;
			}
			else 
			{
				special++;
			}
		}
		
		System.out.println("No. of letters : "+letter);
		System.out.println("No. of digits : "+num);
		System.out.println("No. of spaces : "+space);
		System.out.println("No. of special character : "+special);
	}
}
