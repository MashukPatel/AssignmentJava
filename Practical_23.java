package com.assignment1;

import java.util.Scanner;

/*
Create a class to print the area of a square and a rectangle. The class has two methods 
with the same name but different number of parameters. The method for printing 
area of a rectangle has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side 
of square.
*/

class Findarea
{
	public void calArea(int l)
	{
		System.out.println("Area of Square : "+(l*l));
	}
	public void calArea(int l, int b)
	{
		System.out.println("Area of rectangle : "+(l*b));
	}
}

public class Practical_23 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Findarea fr=new Findarea();
		
		System.out.println("For Square...");
		System.out.println("Enter the length :");
		int ls=sc.nextInt();
		System.out.println("For Rectangle...");
		System.out.println("Enter the length :");
		int lr=sc.nextInt();
		System.out.println("Enter the breadth :");
		int b=sc.nextInt();
		
		fr.calArea(ls);
		fr.calArea(lr, b);
	}
}
