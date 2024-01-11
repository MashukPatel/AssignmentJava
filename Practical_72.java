package com.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to replace the second element of an Array List with the 
specified element.
*/

public class Practical_72 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("Arraylist values are : "+a1);
		System.out.println("Enter value to repalce second element : ");
		int n=sc.nextInt();
		
		a1.set(1, n);
		System.out.println("After updating arraylist : "+a1);
	}
}
