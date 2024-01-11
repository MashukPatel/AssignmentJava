package com.assignment1;

import java.util.HashSet;

/*
Write a Java program to get the number of elements in a hash set. 
*/

public class Practical_60 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		System.out.println("Hashset values are : "+h1);
		System.out.println("Number of elements in hashset are : "+h1.size());
		
	}
}
