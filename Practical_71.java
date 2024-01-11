package com.assignment1;

import java.util.ArrayList;

/*
Write a Java program to increase the size of an array list.
*/

public class Practical_71 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		System.out.println("Arraylist values are : "+a1);
		System.out.println("Arraylist size is : "+a1.size());
		System.out.println();
		System.out.println("Increasing size of arraylist.");
		a1.ensureCapacity(6);
		a1.add(5);
		a1.add(6);
		System.out.println("Now arraylist size is : "+a1.size());
	}
}
