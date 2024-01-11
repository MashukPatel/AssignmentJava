package com.assignment1;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to extract a portion of an array list.
*/

public class Practical_64 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Mashuk");
		a1.add("Patel");
		a1.add("Tops");
		a1.add("Rohit");
		System.out.println("Arraylist values are : "+a1);
		
		List<String> l1=a1.subList(0, 3);
		System.out.println("After extraction of first three element : "+l1);
	}
}
