package com.assignment1;

import java.util.ArrayList;

/*
Write a Java program to join two array lists.
*/

public class Practical_67 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add("Hello");
		a1.add(12.34f);
		System.out.println("Arraylist1 value are : "+a1);
		
		ArrayList a2=new ArrayList();
		a2.add("two");
		a2.add('M');
		a2.add(12);
		System.out.println("Arraylist2 value are : "+a2);
		
		a1.addAll(a2);
		System.out.println("After joining : "+a1);
	}
}
