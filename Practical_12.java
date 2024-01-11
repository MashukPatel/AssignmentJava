package com.assignment1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/*
Write a Java program to display the system time. 
*/

public class Practical_12 
{
	public static void main(String[] args) 
	{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		//System.out.println(java.time.LocalTime.now());
		System.out.println(dtf.format(now));
	}
}
