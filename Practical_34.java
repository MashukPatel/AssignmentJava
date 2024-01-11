package com.assignment1;

/*
Write a program which will ask the user to enter his/her 
marks (out of 100). Define a method that will display grades according to the marks.
*/

public class Practical_34 
{
	public void gradeSystem(int marks)  //method 
	{
		System.out.println("Marks     Grade");
		System.out.println("---------------");
		if(marks>=90)
		{
			System.out.println(marks+"        A");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println(marks+"        B");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println(marks+"        C");
		}
		else if(marks>=55 && marks<70)
		{
			System.out.println(marks+"        D");
		}
		else if(marks>40 && marks<55)
		{
			System.out.println(marks+"        DD");
		}
		else 
		{
			System.out.println(marks+"        Fail");
		}
	}
	
	public static void main(String[] args) 
	{
		Practical_34 p1=new Practical_34();
		p1.gradeSystem(78);
	}
}
