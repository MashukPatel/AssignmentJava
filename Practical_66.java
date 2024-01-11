package com.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program of swap two elements in an array list.
*/

public class Practical_66 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(7);
		a1.add(15);
		a1.add(0);
		a1.add(23);
		System.out.println("Arraylist value are : "+a1);
		System.out.println("Enter index no1 for swapping :");
		int n1=sc.nextInt();
		System.out.println("Enter index no2 for swapping :");
		int n2=sc.nextInt();
		
		int temp=a1.get(n1);
		a1.set(n1, a1.get(n2));
		a1.set(n2, temp);
		System.out.println("Arraylist after swapping : "+a1);
		
	}
}
