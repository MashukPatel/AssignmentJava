package com.assignment1;

import java.util.Scanner;

/*
W.A.J.P to create the validate method that takes integer value as a parameter. If the 
age is less than 18, then throw an Arithmetic Exception otherwise print a message 
welcome to vote. 
*/

public class Practical_40 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		validateAge(age);
	}
	
	public static void validateAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("You are not eligible for voting.");
		}
		else
		{
			System.out.println("You are eligible for voting.");
		}
	}
}
