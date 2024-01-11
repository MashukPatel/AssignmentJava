package com.assignment1;

/*
W.A.J. P to create one thread by extending Thread class in another Class.
*/

class Demo1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread "+i);
		}
	}
}

class Demo2 extends Demo1
{
	public void display()
	{
		System.out.println("This is another class and thread class is extended in this class.");
	}
}
public class Practical_44 
{
	public static void main(String[] args) 
	{
		Demo2 d2=new Demo2();
		d2.display();
		d2.start();
	}
}
