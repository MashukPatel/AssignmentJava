package com.assignment1;

import java.util.HashMap;

/*
Write a Java program to get a collection view of the values contained in this map. 
*/

public class Practical_75 
{
	public static void main(String[] args) 
	{
		HashMap hm1=new HashMap();
		hm1.put(1, "Mashuk");
		hm1.put(2, 07);
		hm1.put(3, "Patel");
		hm1.put(4,"78.67f");
		hm1.put(5, 'M');
		System.out.println("Hashmap values are : "+hm1);
		System.out.println();
		System.out.println("collection view is : "+hm1.values());
	}
}
