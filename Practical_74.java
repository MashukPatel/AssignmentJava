package com.assignment1;

import java.util.HashSet;

/*
Write a Java program to compare two sets and retain elements which are same on 
both sets.
*/

public class Practical_74 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("Hello");
		h1.add("Tops");
		h1.add("Mashuk");
		h1.add("Rohit");
		h1.add("Metro");
		System.out.println("Hashset1 values are : "+h1);
		
		HashSet<String> h2=new HashSet<String>();
		h2.add("Hii");
		h2.add("Technology");
		h2.add("Mashuk");
		h2.add("patel");
		h2.add("Metro");
		System.out.println("Hashset1 values are : "+h2);
		
		String[] a1=h1.toArray(new String[h1.size()]);
		String[] a2=h2.toArray(new String[h2.size()]);
		
		System.out.println("Same values in both hashset are :");
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					System.out.println(a1[j]);
				}
			}
		}
	}
}
