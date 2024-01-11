package com.assignment1;

/*
• W.A.J.P to start the same Thread twice by calling start () method twice.
*/

class TestThreadTwice extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread : "+i);
		}
	}
}
public class Practical_46 
{
	public static void main(String[] args) 
	{
		TestThreadTwice t1=new TestThreadTwice();
		t1.start();
		t1.start();
	}
}
