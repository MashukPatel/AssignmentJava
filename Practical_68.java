package com.assignment1;

import java.util.HashSet;

/*
Write a Java program to convert a hash set to an array. 
*/

public class Practical_68 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(1);
		h1.add(100);
		h1.add(0);
		h1.add(40);
		h1.add(20);
		System.out.println("Hashset values are : "+h1);
		
		Object[] arr=h1.toArray();
		System.out.println("Array values are as follow :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
