package com.assignment1;

import java.util.ArrayList;
import java.util.Collections;

/*
Write a Java program to shuffle elements in an array list. 
*/

public class Practical_57 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(101);
		a1.add('M');
		a1.add("Tops Technology");
		a1.add(34.67f);
		a1.add("Mashuk");
		System.out.println("Arraylist values are : "+a1);
		
		Collections.shuffle(a1);
		System.out.println("After shuffled values are : "+a1);
	}
}
