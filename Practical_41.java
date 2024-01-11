package com.assignment1;

import java.util.Scanner;

/*
W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
than account balance then program will show custom exception otherwise amount 
will deduct from account balance.
*/

class InvalidAmount extends Exception
{
	int required;
	public InvalidAmount(int required) 
	{
		this.required=required;
	}
}

class ATM
{
	int balance;
	
	public void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println(amount+" Rs deposited successfully.");
		System.out.println("Available balance : "+balance);
	}
	
	public void withdraw(int amount) throws InvalidAmount
	{
		if(amount<=balance)
		{
			System.out.println(amount+" Rs withdraw successfully.");
			System.out.println("Available balance : "+(balance-amount));
		}
		else
		{
			int need=amount-balance;
			throw new InvalidAmount(need);
		}
	}
}

public class Practical_41 
{
	public static void main(String[] args) 
	{
		ATM a1=new ATM();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to deposit :");
		int amount=sc.nextInt();
		a1.deposit(amount);
		
		System.out.println("Enter amount to withdraw :");
		int value=sc.nextInt();
		
		try {
			a1.withdraw(value);
		} catch (InvalidAmount e) 
		{
			System.out.println("Sorry! insufficient balance, you need more "+e.required+"rs to perform this transaction.");
		}
	}
}
