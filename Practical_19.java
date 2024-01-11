package com.assignment1;

import java.util.Scanner;

/*
W.A.J.P to find all interleaving of given strings. 
The given strings are: WX YZ 
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ ...
*/

public class Practical_19 
{	
	public static void findInterleaving(String str1, int a, String str2, int b, String space)
	{
		if(a==str1.length() && b==str2.length())
		{
			System.out.println(space);
		}
		if(a < str1.length())
		{
			findInterleaving(str1, a+1, str2, b, space+str1.charAt(a));
		}
		if(b < str2.length())
		{
			findInterleaving(str1, a, str2, b+1, space+str2.charAt(b));
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string 1 :");
		String str1=sc.nextLine();
		System.out.println("Enter a string 2 :");
		String str2=sc.nextLine();
		System.out.println("Interleaving strings are as follow :");
		findInterleaving(str1, 0, str2, 0, " ");
		
			
	}
}
