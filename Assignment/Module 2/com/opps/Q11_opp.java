package com.opps;
/*
   We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
   class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
   parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
   parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
   side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
   all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
   area of rectangle, square and circle respectively. Create an object of class 'Area' and 
   call all the three methods...
 */

abstract class Marks
{
	abstract double
	getPercentage();
}
class A extends Marks
{
	int sub1, sub2, sub3;
	A(int s1, int s2 ,int s3)
	{
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}
	
	double getPercentage()
	{
		return(sub1 + sub2 + sub3)/3.0;
	}
}

class B extends Marks
{
	int sub1,sub2,sub3,sub4;
	
	B(int s1, int s2, int s3, int s4)
	{
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
	}
	
	double getPercentage()
	{
		return(sub1 + sub2 + sub3 +sub4)/4.0;
	}
}
public class Q11_opp
{
	public static void main(String[] args)
	{

		A studentA =new A(80,85,90);
		B studentB = new B(75,80,85,90);
		
		System.out.println("percentage of Student A:"+studentA.getPercentage()+"%");
		System.out.println("Percentage of student B:"+studentB.getPercentage()+"%");
	}
}
	
		
	


