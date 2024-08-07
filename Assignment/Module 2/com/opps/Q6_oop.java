package com.opps;
/*
    Print the sum, difference and product of two complex numbers by creating a class 
    named 'Complex' with separate methods for each operation whose real and 
    imaginary parts are entered by user.    
 */
import java.util.Scanner;

class Complex
{
    int real1, real2, imaginary1, imaginary2;

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number: ");
        real1 = sc.nextInt();
        System.out.println("Enter the imaginary part of the first complex number: ");
        imaginary1 = sc.nextInt();
        System.out.println("Enter the real part of the second complex number: ");
        real2 = sc.nextInt();
        System.out.println("Enter the imaginary part of the second complex number: ");
        imaginary2 = sc.nextInt();
    }

    public void sum()
    {
        System.out.println("Sum of the complex numbers: " + (real1 + real2) + " + " + (imaginary1 + imaginary2) + "i");
    }

    public void difference()
    {
        System.out.println("Difference of the complex numbers: " + (real1 - real2) + " + " + (imaginary1 - imaginary2) + "i");
    }

    public void product() 
    {
        int realPart = (real1 * real2) - (imaginary1 * imaginary2);
        int imaginaryPart = (real1 * imaginary2) + (real2 * imaginary1);
        System.out.println("Product of the complex numbers: " + realPart + " + " + imaginaryPart + "i");
    }
}

public class Q6_oop
{
	public static void main(String[] args) 
	{
		
		Complex complex = new Complex();
        complex.input();
        complex.sum();
        complex.difference();
        complex.product();
	}

}
