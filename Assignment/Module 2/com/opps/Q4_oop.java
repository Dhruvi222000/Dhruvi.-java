package com.opps;
/*
    Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
    two methods to print the area and perimeter of the rectangle respectively. Its 
    constructor having parameters for length and breadth is used to initialize the length 
    and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
    constructor having a parameter for its side (suppose s) calling the constructor of its 
    parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
 */

class Rectangle1
{
	int length,breadth;
    public Rectangle1(int l,int b)
    {
    	length =l;
    	breadth =b;
    }
    public void calculateArea()
    {
    	int area=length*breadth;
    	System.out.println("area of rectangle:"+area);
    }
    public void calculatePerimeter()
    {
    	int perimeter=2*(length+breadth);
    	System.out.println("perimeter of Rectangle:"+perimeter);
    }
}
    	
    	class Square1 extends Rectangle1{
    		Square1(int s)
    		{
    			super(s,s);
    		}
    	}   

public class Q4_oop
{
	public static void main(String[] args)
	{
		  Rectangle1 rectangle = new Rectangle1(4,6);
		    rectangle.calculateArea();
		    rectangle.calculatePerimeter();
		    Square1 square = new Square1(5);
		    square.calculateArea();
		    square.calculatePerimeter();
	}
}


