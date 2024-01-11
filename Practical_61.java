package com.assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Write a Java program to associate the specified value with the specified key in a 
Hash Map.
*/

public class Practical_61 
{
	public static void main(String[] args) 
	{
		HashMap hm1=new HashMap();
		hm1.put(1, "Mashuk");
		hm1.put(2, 102);
		hm1.put(3, 'T');
		hm1.put(4, 46.78f);
		
		System.out.println("Key      Value");
		System.out.println();
		Set s=hm1.entrySet();
		Iterator i1=s.iterator();
		while(i1.hasNext())
		{
			Map.Entry me=(Map.Entry)i1.next();
			System.out.print(me.getKey()+"        "+me.getValue());
			System.out.println();
		}
	}
}
