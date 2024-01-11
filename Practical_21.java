package com.assignment1;

/*
Create a class named 'Print Number' to print various numbers of different data types 
by creating different methods with the same name 'printn' having a parameter for 
each data type.
*/

class PrintNumber
{
	public void printn(boolean a)
	{
		System.out.println("Boolean value is "+a);
	}
	public void printn(char a)
	{
		System.out.println("Character value is "+a);
	}
	public void printn(int a)
	{
		System.out.println("Integer value is "+a);
	}
	public void printn(short a)
	{
		System.out.println("Short value is "+a);
	}
	public void printn(float a)
	{
		System.out.println("Float value is "+a);
	}
	public void printn(double a)
	{
		System.out.println("Double value is "+a);
	}
}

public class Practical_21 
{
	public static void main(String[] args) 
	{
		PrintNumber pn=new PrintNumber();
		pn.printn(true);
		pn.printn('M');
		pn.printn(19);
		pn.printn(7);
		pn.printn(19.31f);
		pn.printn(1930.173);
	}
}
