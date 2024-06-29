package com.module1;

// (Q-1)Write a Java program to Take three numbers from the user and print the greatest number......

import java.util.Scanner;
public class M1_Q1
{
	    public static void main(String[] args) 
	    {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Number One");
			int a=sc.nextInt();
			System.out.println("Enter The Number Two");
			int b=sc.nextInt();
			System.out.println("Enter The Number Three");
			int c=sc.nextInt();
			
			if(a>=b && a>=c)
			{
		       System.out.println("Number A is gretest number: " +a);
			}
			else if(b>=a && b>=c)
			{
				System.out.println("Number B is gretest number:" +b);
			}
			else
			{
				System.out.println("Number C is gretest number :"+c);
			}
	}

}
