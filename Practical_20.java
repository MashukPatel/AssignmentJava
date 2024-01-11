package com.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
W.A.J.P to find the second most frequent character in a given string. 
*/

class SecondMost
{
	public void findSecondFrequent(char a[])
	{
		HashMap<Character, Integer> hm1=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			hm1.put(a[i], hm1.getOrDefault(a[i], 0) + 1);
		}
		
		int first=0,sec=0;
		char key;
		int value=0;
		for(Map.Entry mapelements : hm1.entrySet())
		{
			key=(char) mapelements.getKey();
			value=(int) mapelements.getValue();
			if(value > first)
			{
				sec=first;
				first=value;
			}
			else if(value > sec && value < first)
			{
				sec=value;
			}
		}
		for(Map.Entry mapelements : hm1.entrySet())
		{
			key=(char) mapelements.getKey();
			value=(int) mapelements.getValue();
			if(value == sec)
			{
				System.out.println("Second most frequent character is : "+key);
			}
		}
	}
}

public class Practical_20 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		SecondMost sm=new SecondMost();
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		
		sm.findSecondFrequent(a);
		
	}
}
