package com.assignment1;

/*
Create a class to print an integer and a character with two methods having the same 
name but different sequence of the integer and the character parameters. 
*/

class Demo
{
	public void printNumChar(int a, char c)
	{
		System.out.println("Integer valus is "+a);
		System.out.println("Character value is "+c);
	}
	public void printNumChar(char c, int a)
	{
		System.out.println("Integer value is "+a);
		System.out.println("Character value is "+c);
	}
}

public class Practical_22 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.printNumChar(19, 'M');
		System.out.println();
		d.printNumChar('P', 7);
	}
}
