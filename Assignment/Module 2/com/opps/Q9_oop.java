package com.opps;
/*
   We have to calculate the percentage of marks obtained in three subjects (each out of 
   100) by student A and in four subjects (each out of 100) by student B. Create an 
   abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
   other classes.....
   'A' and 'B' each having a method with the same name which returns the 
   percentage of the students. The constructor of student A takes the marks in three 
   subjects as its parameters and the marks in four subjects as its parameters for student 
   B. Create an object for each of the two classes and print the percentage of marks for 
   both the students. 
 */
abstract class Marks1
{
    abstract double getPercentage();
}

class Aa extends Marks1
{
    int sub1, sub2, sub3;

    Aa(int s1, int s2, int s3) 
    {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    @Override
    double getPercentage()
    {
        return (sub1 + sub2 + sub3) / 3.0;
    }
}

class Bb extends Marks1 
{
    int sub1, sub2, sub3, sub4;

    Bb(int s1, int s2, int s3, int s4)
    {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }

    @Override
    double getPercentage() 
    {
        return (sub1 + sub2 + sub3 + sub4) / 4.0;
    }
}


public class Q9_oop
{
	public static void main(String[] args)
	{
		 Aa studentA = new Aa(80, 85, 90);
	        Bb studentB = new Bb(75, 80, 85, 90);

	        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
	        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
	    }
		
	}


