package com.assignment1;

/*
Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
and by both.
*/

public class Practical_13 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Numbers divisible by 3 from 1 to 100 is given below:");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+", ");
			}
		}
	}
}
