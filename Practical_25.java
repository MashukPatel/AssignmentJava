package com.assignment1;

/*
Create a class named 'Member' having the following members: 
1. Data members 
2. Name 
3. Age 
4. Phone number 
5. Address 
6. Salary 
It also has a method named 'printSalary' which prints the salary of the members.
*/

class Member
{
	String name,address,mobile;
	int age,salary;
	public void assignValue()
	{
		name="Mashuk";
		age=23;
		mobile="9662321093";
		address="Himatnagar";
		salary=2345;
	}
	public void printSalary()
	{
		System.out.println("Name      Age      Mobile No.      Address       Salary");
		System.out.println("-------------------------------------------------------");
		System.out.println(name+"    "+age+"       "+mobile+"      "+address+"    "+salary);
	}
}

public class Practical_25 
{
	public static void main(String[] args) 
	{
		Member m1=new Member();
		m1.assignValue();
		m1.printSalary();
	}
}
