package com.assignment1;

import java.util.ArrayList;

/*
Write a Java program to remove the third element from an array list. 
*/

public class Practical_53 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Tops");
		a1.add(34);
		a1.add('A');
		a1.add(78.98f);
		System.out.println("Arraylist values are : "+a1);
		
		a1.remove(2);
		System.out.println("After removing third element its value are : "+a1);
	}
}
