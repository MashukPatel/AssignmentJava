package com.assignment1;

import java.util.Scanner;

/*
Print the sum, difference and product of two complex numbers by creating a class 
named 'Complex' with separate methods for each operation whose real and 
imaginary parts are entered by user. 
*/

class Complex
{
	public void sum(String i1, String i2, int r1, int r2)
	{
		int sum=r1+r2;
		int isum=0;
		String sep1=i1.substring(0, i1.length()-1);
		String sep2=i2.substring(0, i2.length()-1);
		isum=(Integer.parseInt(sep1)) + (Integer.parseInt(sep2));
		System.out.println("Sum of two complex number ("+r1+" + "+i1+") + ("+r2+" + "+i2+") = ("+sum+" + "+isum+"i).");
	}
	public void difference(String i1, String i2, int r1, int r2)
	{
		int diff=r1-r2;
		int idiff=0;
		String sep1=i1.substring(0, i1.length()-1);
		String sep2=i2.substring(0, i2.length()-1);
		idiff=(Integer.parseInt(sep1)) - (Integer.parseInt(sep2));
		System.out.println("Difference of two complex number ("+r1+" + "+i1+") - ("+r2+" + "+i2+") = ("+diff+" + "+idiff+"i).");
	}
	
	public void product(String i1, String i2, int r1, int r2)
	{
		int multi=r1*r2;
		int imulti=0;
		String sep1=i1.substring(0, i1.length()-1);
		String sep2=i2.substring(0, i2.length()-1);
		imulti=(Integer.parseInt(sep1)) * (Integer.parseInt(sep2));
		System.out.println("Product of two complex number ("+r1+" + "+i1+") * ("+r2+" + "+i2+") = ("+multi+" + "+imulti+"i).");
	}
}
	
public class Practical_28 
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Complex c1=new Complex();
		System.out.println("For complex Number 1");
		System.out.println("Enter real part: ");
		int r1=sc.nextInt();
		System.out.println("Enter imaginary part (example: 5i, 6i): ");
		String i1=sc1.nextLine();
		
		System.out.println("For complex Number 2");
		System.out.println("Enter real part: ");
		int r2=sc.nextInt();
		System.out.println("Enter imaginary part (example: 5i, 6i): ");
		String i2=sc1.nextLine();
		System.out.println();
		
		c1.sum(i1, i2, r1, r2);
		c1.difference(i1, i2, r1, r2);
		c1.product(i1, i2, r1, r2);
	}
}
