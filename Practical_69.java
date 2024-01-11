package com.assignment1;

import java.util.ArrayList;
import java.util.HashSet;

/*
Write a Java program to convert a hash set to a List/Array List.
*/

public class Practical_69 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("Mashuk");
		h1.add("Patel");
		h1.add("Rohit");
		h1.add("Roy");
		System.out.println("Hashset values are : "+h1);
		
		ArrayList<String> a1=new ArrayList<String>(h1);
		System.out.println("Arraylist values are : "+a1);
	}
}
