package com.assignment1;

/*
W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set 
Daemon () method of Thread class and check whether the thread is set daemon or 
not by using is Daemon () method. 
TestDaemonThread2 t1=new TestDaemonThread2(); 
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start(); 
t1.setDaemon(true);//will throw exception here t2.start()
*/

class DaemonThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("First Thread : "+i);
		}
	}
}

class Daemon2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Second Thread : "+i);
		}
	}
}
public class Practical_47 
{
	public static void main(String[] args) 
	{
		DaemonThread d1=new DaemonThread();
		Daemon2 d2=new Daemon2();
		d1.start();
		d2.start();
		d1.setDaemon(true);
		
	}
}
