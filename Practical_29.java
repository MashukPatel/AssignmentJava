package com.assignment1;

/*
Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
having a method with the same name 'message' that prints "This is first subclass" 
and "This is second subclass" respectively. Call the methods 'message' by creating 
an object for each subclass.
*/

abstract class Parent1
{
	public void show()
	{
		System.out.println("This is abstarct class.");
	}
}

class First extends Parent1 
{
	public void message()
	{
		System.out.println("This is first subclass.");
	}
}

class Second extends Parent1
{
	public void message()
	{
		System.out.println("This is second subclass.");
	}
}

public class Practical_29 
{
	public static void main(String[] args) 
	{
		First p1=new First();
		Second s1=new Second();
		p1.show();
		p1.message();
		s1.message();
	}
}
