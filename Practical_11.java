package com.assignment1;

import java.util.Scanner;

/*
Write a Java program that accepts an integer (n) and computes the value of 
n+nn+nnn.
*/
public class Practical_11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer from 1 to 9 : ");
		int num=sc.nextInt();
		
		int sum=num;  //to store final result 
		int temp=num;;  // to make series nn,nnn
		
		for(int i=0;i<2;i++)
		{
			temp=(temp*10)+num;  
			sum=sum+temp;            
		}
		System.out.println("Result is "+sum);
	}
}
