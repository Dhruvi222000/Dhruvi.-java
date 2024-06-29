package com.module1;

/*
  (Q-5) Write a program in Java to display the pattern like right angle triangle with a number
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
 */

public class M1_Q5
{
	public static void main(String[] args)
    {
     int rows = 5;
     for (int i=1; i<=5; i++) 
     {
         
         for (int j =1; j<=i;j++)
         {
             System.out.print(j); 
         }
            System.out.println();             
        
     }
 }

}
