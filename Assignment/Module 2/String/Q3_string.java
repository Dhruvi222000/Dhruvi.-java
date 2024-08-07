package String;

import java.util.Scanner;

/*
   Write a Java program that accepts an integer (n) and computes the value of 
   n+nn+nnn. Input number: 5 
   5 + 55 + 555
 */

public class Q3_string 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number(n)");
		  int n = scanner.nextInt();
	        
	        // Calculate nn and nnn
	        int nn = n * 10 + n;      // once
	        int nnn = n * 100 + nn;   // twice        																		
	        int sum = n + nn + nnn;
	        System.out.println("n + nn + nnn = " + n + " + " + nn + " + " + nnn + " = " + sum);
	        
	        scanner.close();
}
	        
			
}


