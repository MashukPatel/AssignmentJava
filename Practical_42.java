package com.assignment1;

/*
W.A.J.P to create a class Student with attributes roll no, name, age and course. 
Initialize values through parameterized constructor. If age of student is not in 
between 15 and 21 then generate user defined exception 
"AgeNotWithinRangeException". If name contains numbers or special symbols 
raise exception "NameNotValidException". Define the two exception classes.
*/

class AgeNotWithinRangeException extends Exception
{
	public AgeNotWithinRangeException(String str) 
	{
		System.out.println(str);
	}
}

class NameNotValidException extends Exception
{
	public NameNotValidException(String str)
	{
		System.out.println(str);
	}
}

class Student
{
	int roll,age;
	String name,course;
	
	public Student(int roll, String name, int age, String course) 
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	public void check() throws AgeNotWithinRangeException, NameNotValidException
	{
		char[] a=name.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(!(Character.isLetter(a[i]) || Character.isWhitespace(a[i])))
			{
				System.out.println();
				throw new NameNotValidException("Exception! Name contain numbers or special character.");
			}
		}
		if(age>15 && age<21)
		{
			System.out.println();
			throw new AgeNotWithinRangeException("Exception! Age is between 15 and 21.");
		}
			
		
	}
	public void display()
	{
		System.out.println("Roll no. "+roll);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Course : "+course);
	}
}

public class Practical_42 
{
	public static void main(String[] args)
	{	
		Student s1=new Student(1,"Mashuk patel", 18, "Computer Engineering");
		s1.display();
		try 
		{
			s1.check();
		} catch (AgeNotWithinRangeException e) 
		{
			e.printStackTrace();
		} catch (NameNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
