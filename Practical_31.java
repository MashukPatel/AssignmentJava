package com.assignment1;

/*
We have to calculate the percentage of marks obtained in three subjects (each out of 
100) by student A and in four subjects (each out of 100) by student B. Create an 
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name which returns the 
percentage of the students. The constructor of student A takes the marks in three 
subjects as its parameters and the marks in four subjects as its parameters for student 
B. Create an object for each of the two classes and print the percentage of marks for 
both the students.
*/

abstract class Marks
{
	public abstract void getPercentage();
}

class StudentA extends Marks
{
	int s1,s2,s3;
	public StudentA(int s1, int s2, int s3) 
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	@Override
	public void getPercentage() 
	{
		System.out.println("Percentage of studentA is "+((float)((s1+s2+s3))/3)+"%.");
	}
	
}

class StudentB extends Marks
{
	int s1,s2,s3,s4;
	public StudentB(int s1, int s2, int s3, int s4)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
	}

	@Override
	public void getPercentage() 
	{
		System.out.println("Percentage of studentB is "+((float)((s1+s2+s3+s4))/4)+"%.");
	}
	
}
public class Practical_31 
{
	public static void main(String[] args) 
	{	
		StudentA s1=new StudentA(85, 65, 78);
		s1.getPercentage();
		
		StudentB s2=new StudentB(90, 87, 81, 75);
		s2.getPercentage();
	}
}
