package com.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to search an element in an array list. 
*/

public class Practical_54 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(15);
		a1.add(100);
		a1.add(75);
		a1.add(123);
		System.out.println("Arraylist values are : "+a1);
		
		System.out.println("Enter integer to search in arraylist : ");
		int n=sc.nextInt();
		int index=a1.indexOf(n);
		if(index==-1)
		{
			System.out.println("Element does not exist in arraylist.");
		}
		else
		{
			System.out.println("Value exist at index "+index+" in arraylist.");
		}
	}
}
