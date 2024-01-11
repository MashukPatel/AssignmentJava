package com.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Write a Java program to sort a given array list. 
*/

public class Practical_55 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("How many values you want to enter in arraylist :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.err.println("Enter value "+i+" : ");
			int temp=sc.nextInt();
			a1.add(temp);
		}
		System.out.println("Arraylist values are : "+a1);
		System.out.println();
		
		Collections.sort(a1);
		System.out.println("Ascending order :");
		System.out.println(a1);
		System.out.println();
		
		Collections.sort(a1,Collections.reverseOrder());;
		System.out.println("Descending order :");
		System.out.println(a1);
	}
}
