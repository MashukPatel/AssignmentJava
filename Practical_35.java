package com.assignment1;

/*
Create a class named 'Shape' with a method to print "This is this is shape". Then 
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
having a method to print "This is rectangular shape" and "This is circular shape" 
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
object of 'Square' class.
*/

class Shape1
{
	public void show()
	{
		System.out.println("This is shape class.");
	}
}

class Rectangle extends Shape1
{
	public void printRect()
	{
		System.out.println("This is rectangular shape.");
	}
}

class Circle extends Rectangle
{
	public void print()
	{
		System.out.println("This is circular shape.");
	}
}

class Square extends Rectangle
{
	public void print()
	{
		System.out.println("Square is a rectangle.");
	}
}

public class Practical_35 
{
	public static void main(String[] args) 
	{
		Square s1=new Square();
		s1.show();
		s1.printRect();
	}
}
