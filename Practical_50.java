package com.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to insert an element into the array list at the first position. 
*/

public class Practical_50 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		ArrayList a1=new ArrayList();
		a1.add(167);
		a1.add('M');
		a1.add("Mashuk");
		
		System.out.println("Current ArrayList values are : "+a1);
		System.out.println("Enter value to insert at first position :");
		String str=sc.nextLine();
		
		a1.addFirst(str);
		System.out.println("Now ArrayList values are : "+a1);
	}
}
