package com.assignment1;

/*
Write a Java program to create a new array list, add some colors (string) and print out 
the collection. 
*/
import java.util.ArrayList;

public class Practical_48 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Red");
		a1.add("Blue");
		a1.add("Orange");
		a1.add("Purple");
		a1.add("White");
		
		System.out.println("Arraylist values are : "+a1);
	}
}
