package com.assignment1;

import java.util.ArrayList;
import java.util.Iterator;

/*
Write a Java program to iterate through all elements in an array list. 
*/

public class Practical_49 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(123);
		a1.add("Mashuk");
		a1.add(345.67f);
		a1.add('M');
		a1.add("Patel");
		
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
