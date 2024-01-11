package com.assignment1;

import java.util.ArrayList;

/*
Write a Java program to print all the elements of an Array List using the position of 
the elements.
*/

public class Practical_73 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Mashuk");
		a1.add(12);
		a1.add("Tops");
		a1.add(123.65f);
		a1.add("Patel");
		System.out.println("Printing arraylist elements by its index number.");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
	}
}
