package com.assignment1;

import java.util.HashSet;
import java.util.Iterator;

/*
Write a Java program to iterate through all elements in a hash list. 
*/

public class Practical_59 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		h1.add('T');
		h1.add(108);
		h1.add("Mashuk");
		h1.add(23.56f);
		
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
