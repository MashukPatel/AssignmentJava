package com.assignment1;

/*
Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' 
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
method by creating an object of each of the three classes.
*/

abstract class Bank
{
	public abstract void getBalance();
}

class BankA extends Bank
{
	int a=100;
	@Override
	public void getBalance() 
	{
		System.out.println(a+"$ deposited to bankA successfully.");
	}
	
}

class BankB extends Bank
{
	int a=200;
	@Override
	public void getBalance() 
	{
		System.out.println(a+"$ deposited to bankB successfully.");
	}
	
}

class BankC extends Bank
{
	int a=300;
	@Override
	public void getBalance() 
	{
		System.out.println(a+"$ deposited to bankC successfully.");
	}
	
}
public class Practical_30 
{
	public static void main(String[] args) 
	{
		BankA b1=new BankA();
		b1.getBalance();
		
		BankB b2=new BankB();
		b2.getBalance();
		
		BankC b3=new BankC();
		b3.getBalance();
	}
}
