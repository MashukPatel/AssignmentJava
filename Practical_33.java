package com.assignment1;

/*
We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and 
call all the three methods.
*/

abstract class Shape
{
	public abstract void rectangleArea(int l, int b);
	public abstract void squareArea(int l);
	public abstract void circleArea(int r);
}

class Area extends Shape
{

	@Override
	public void rectangleArea(int l, int b) 
	{
		System.out.println("Area of rectangle is "+(l*b));
	}

	@Override
	public void squareArea(int l) 
	{
		System.out.println("Area of square is "+(l*l));
	}

	@Override
	public void circleArea(int r) 
	{
		System.out.println("Area of circle is "+(float)((3.14*r*r)));
	}
	
}

public class Practical_33 
{
	public static void main(String[] args) 
	{
		Area a1=new Area();
		a1.rectangleArea(10, 7);
		a1.squareArea(14);
		a1.circleArea(5);
	}
}
