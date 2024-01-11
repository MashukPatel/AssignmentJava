package com.assignment1;

import java.util.HashMap;

/*
• Write a Java program to check whether a map contains key-value mappings (empty) 
or not. 
*/

public class Practical_70
{
	public static void main(String[] args) 
	{
		HashMap hm1=new HashMap();
		hm1.put(1, "Mashuk");
		hm1.put(2, 19);
		hm1.put(3, "Patel");
		hm1.put(4, 19.67f);
		System.out.println("Hashmap values are : "+hm1);
		System.out.println("Hashmap is Empty : "+hm1.isEmpty());
		
	}
}
