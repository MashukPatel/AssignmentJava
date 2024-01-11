package com.assignment1;

import java.util.HashMap;

/*
Write a Java program to count the number of key-value (size) mappings in a map.
*/

public class Practical_62 
{
	public static void main(String[] args) 
	{
		HashMap hm1=new HashMap();
		hm1.put(1, "Hello");
		hm1.put(2, "Mashuk");
		hm1.put(3, 07);
		hm1.put(4, 23.45f);
		
		System.out.println("Hashmap values are : "+hm1);
		System.out.println("Size of hashmap is : "+hm1.size());
	}
}
