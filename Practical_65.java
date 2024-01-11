package com.assignment1;

import java.util.ArrayList;

/*
Write a Java program to compare two array lists. 
*/

public class Practical_65 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(8);
		a1.add(1);
		a1.add(5);
		a1.add(7);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(10);
		a2.add(8);
		a2.add(1);
		a2.add(5);
		a2.add(7);
		a2.add(0);
		
		System.out.println("Arraylist1 values are : "+a1);
		System.out.println("Arraylist2 values are : "+a2);
		
		if(a1.equals(a2))
		{
			System.out.println("Both the arraylist are same.");
		}
		else
		{
			System.out.println("Both the arraylist are different.");
		}
		
	}
}
