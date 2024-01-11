package com.assignment1;

import java.util.HashSet;

/*
Write a Java program to append the specified element to the end of a hash set. 
*/

public class Practical_58 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		h1.add("Hello");
		h1.add("Mashuk");
		h1.add(07);
		h1.add('P');
		System.out.println("Hashset values are : "+h1);
	}
}
