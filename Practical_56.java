package com.assignment1;

import java.util.ArrayList;

/*
• Write a Java program to copy one array list into another. 
*/

public class Practical_56 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Hello");
		a1.add("Mashuk");
		a1.add("Rohit");
		a1.add("Parth");
		System.out.println("Arraylist1 value are : "+a1);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.addAll(a1);
		System.out.println("Arraylist2 values are : "+a2);
	}
}
