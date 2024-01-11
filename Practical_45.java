package com.assignment1;

/*
W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
2000ms and check the execution. 
*/

class DisplayThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("1) Thread :- "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Practical_45 
{
	public static void main(String[] args) throws InterruptedException 
	{
		DisplayThread d1=new DisplayThread();
		d1.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("2) Thread :"+i);
			Thread.sleep(2000);
		}
	}
}
