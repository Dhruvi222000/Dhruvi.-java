package com.module1;
import java.util.Scanner;

/*
 (Q-7) Write a Java program that reads a positive integer and count the number of digits the
       number.
  1. Input an integer number less than ten billion: 125463
  2. Number of digits in the number: 6

 */

public class M1_Q7
{
	 public static void main(String[] args) 
	  {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Input an integer number less than ten billion");
		 long number = sc.nextLong();
		 
		 int digits=0;
		 for(long r=number; r!=0; r/=10)
		 {
			 digits++;
		 }
		 System.out.println("Number of digits in the number: "+digits);
	  }

}