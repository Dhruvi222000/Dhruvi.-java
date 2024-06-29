package com.module1;
/*
 (Q-8)Write a Java program to count the letters, spaces, numbers and other characters of
      an input string.....

 */
import java.util.Scanner;
public class M1_Q8
{	
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();
	        
	        int letterCount = 0;
	        int spaceCount = 0;
	        int numberCount = 0;
	        int otherCount = 0;
	        
//character in the string
	        for (int i = 0; i < input.length(); i++)
	       {
	            char ch = input.charAt(i);
	            
	            if (Character.isLetter(ch))
	            {
	                letterCount++;
	            } 
	              else if (Character.isDigit(ch))
	            {
	                numberCount++;
	            }
	             else if (Character.isWhitespace(ch))
	            {
	                spaceCount++;
	            } 
	             else
	             {
	                otherCount++;
	             }
	        }
	        
 //Output the counts
	        System.out.println("Letter count: " + letterCount);
	        System.out.println("Number count: " + numberCount);
	        System.out.println("Space count: " + spaceCount);
	        System.out.println("Other characters count: " + otherCount);
	        
	        scanner.close();
	    }
	}
