package com.assignment1;

import java.util.Scanner;

/*
Write a program in Java to input 5 numbers from keyboard and find their sum and 
average using for loop. 
*/
public class Practical_5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		float ave;
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter number "+i);
			int a=sc.nextInt();
			sum=sum+a;
		}
		ave=(sum/5);
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+ave);
		 
	}
}
