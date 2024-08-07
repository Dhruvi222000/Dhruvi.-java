package com.opps;
/*
   Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
   $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are 
   subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
   method by creating an object of each of the three classes.....
 */
abstract class Bank
{
	abstract void getbalance();
}
class BankA extends Bank
{

	private String balance;
	@Override
	void getbalance() 
	{

		System.out.println("Balance in Bank A: $ "+balance);			
	}
}
class BankB extends Bank
{
		
		private int balance=150;

		@Override
		void getbalance()
		{
			System.out.println("Blance in Bank B: $"+balance);				
		}
		
}
class BankC extends Bank
{
	  private int balance =200;

	@Override
	void getbalance()
	{
		
		System.out.println("Blance in Bank C $"+balance);
	}
	  
}
public class Q8_oop
{
	public static void main(String[] args) 
	{
		BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        
        bankA.getbalance();
        bankB.getbalance();
        bankC.getbalance();
	}	 
}