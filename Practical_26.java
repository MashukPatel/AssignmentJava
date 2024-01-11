package com.assignment1;

/*
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. Its 
constructor having parameters for length and breadth is used to initialize the length 
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
constructor having a parameter for its side (suppose s) calling the constructor of its 
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
*/

class Rectangle1
{
	int length,breadth;
	
	public Rectangle1(int length, int breadth) 
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public void findArea()
	{
		System.out.println("Area of rectangle is : "+(length*breadth));
	}
	
	public void findPerimeter()
	{
		System.out.println("Perimeter of rectangle is : "+((length + breadth)*2));
	}
}

class Square1 extends Rectangle1
{

	public Square1(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}
	
}

public class Practical_26 
{
	public static void main(String[] args) 
	{
		Square1 s1=new Square1(12,12);
		s1.findArea();
		s1.findPerimeter();
	}
}
