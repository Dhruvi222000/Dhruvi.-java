package com.opps;
/*
   Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
   having a method with the same name 'message' that prints "This is first subclass" 
   and "This is second subclass" respectively. Call the methods 'message' by creating 
   an object for each subclass. 
 */

abstract class parent
{
    	abstract void message();
}
class FirstSubclass extends parent
{

	@Override
	void message()
	{
		System.out.println("This is First subclass...");
		
	}
	
}
//Secound subclass
class Secoundsubclass extends parent
{

	@Override
	void message()
	{
		System.out.println("This is Secound subclass..");
		
	}
	
}
public class Q7_oop 
{
	public static void main(String[] args) 
	{
		FirstSubclass first =new FirstSubclass();
		Secoundsubclass second = new Secoundsubclass();

        first.message();
        second.message();
	}

}
