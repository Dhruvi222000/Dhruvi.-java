package com.array;
/*
 Q-5 Write a java program Find out length of string without using inbuilt function......
 */

public class Q5_Array
{
	public class StringLengthWithoutInbuiltFunction
	{
	    public static void main(String[] args)
	    {
	        String str = "Hello, World!";
	        int length = calculateLength(str);
	        System.out.println("Length of the string '" + str + "' is: " + length);
	    }

	    // Method to calculate length of string without using inbuilt functions
	    public static int calculateLength(String str)
	    {
	        int length = 0;
	        for(char c : str.toCharArray())
	        {
	            length++;
	        }
	        return length;
	    }
	}

}
