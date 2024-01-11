package com.assignment1;

/*
W.A.J. P to create one thread by implementing Runnable interface in 
Class. 
*/

class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread created by implenting runnable "+i);
		}
			
	}
}

public class Practical_43 
{
	public static void main(String[] args)
	{
		A a1=new A();
		Thread t1=new Thread(a1);
		t1.start();
	}
}
