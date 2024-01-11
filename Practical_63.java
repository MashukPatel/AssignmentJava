package com.assignment1;

import java.util.ArrayList;
import java.util.Collections;

/*
Write a Java program to reverse elements in an array list. 
*/

public class Practical_63 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		System.out.println("Arraylist values are : "+a1);
		Collections.reverse(a1);
		System.out.println("Reversed arraylist : "+a1);
	}
}
