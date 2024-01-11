package com.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to update specific array element by given element. 
*/

public class Practical_52 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Hello");
		a1.add("Patel");
		a1.add("How are");
		a1.add("Mashuk");
		System.out.println("Current Arraylist values are : "+a1);
		System.out.println();
		
		
		System.out.println("Enter value you want to update from given arraylist :");
		String str=sc.nextLine();
		System.out.println("Enter new value you want to update :");
		String newstr=sc.nextLine();
		int index=a1.indexOf(str);
		a1.set(index, newstr);
		
		System.out.println("Value updated successfully.");
		System.out.println("Updated arraylist values are : "+a1);
		
	}
}
