package com.assignment1;

/*
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 
5 units by creating a class named 'Triangle' without any parameter in its constructor. 
*/

class Triangle
{
	public Triangle() 
	{
		int b=3,h=4,l=5;
		System.out.println("Area of triangle is "+((b*h)/2));
		System.out.println("Perimeter of triangle is "+(b+h+l));
	}
}
public class Practical_27 
{
	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();
	}
}
