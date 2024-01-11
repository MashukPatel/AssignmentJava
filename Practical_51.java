package com.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to retrieve an element (at a specified index) from a given array 
list. 
*/

public class Practical_51
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList a1=new ArrayList();
		a1.add("Mashuk");
		a1.add('P');
		a1.add(07);
		a1.add(81.67f);
		a1.add("Tops Technology");
		
		System.out.println("Enter index to get the value (from 0 to 4) :");
		int n=sc.nextInt();
		
		System.out.println("Value at index "+n+" is : "+a1.get(n));
	}
}
