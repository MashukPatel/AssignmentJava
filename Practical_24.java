package com.assignment1;

/*
Create a class with a method that prints "This is a parent class" and its subclass with 
another method that prints "This is child class". Now, create an object for each of 
the class and call 1 - method of parent class by object of parent class 2 - method of 
child class by object of child class 3 - method of parent class by object of child class
*/

class Parent 
{
	public void display()
	{
		System.out.println("This is a parent class.");
	}
}

class Child extends Parent
{
	public void show()
	{
		System.out.println("This is a child class.");
	}
}

public class Practical_24 
{
	public static void main(String[] args) 
	{
		Parent p1=new Parent();
		p1.display();
		
		Child c1=new Child();
		c1.show();
		c1.display();
	}
}
