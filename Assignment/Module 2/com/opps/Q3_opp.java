package com.opps;
/*
  Create a class named 'Member' having the following members: 
1. Data members 
2. Name 
3. Age 
4. Phone number 
5. Address 
6. Salary 
It also has a method named 'printSalary' which prints the salary of the members.
 */
class member
{
	int age,salary,datamember;
	String name,address;
	long phonenumber;
	public void printsalary()
	{
		age=24;
		salary=20000;
	    phonenumber=6355108398L;
	    datamember=10;
	    name="Dhruvi";
	    address="ahmedabad";
	    
	    System.out.println("age is.........."+age);
	    System.out.println("salary is.........."+salary);
	    System.out.println("phonenumber is.........."+phonenumber);
	    System.out.println("datanumber is.........."+datamember);
	    System.out.println("name is.........."+name);
	    System.out.println("address is.........."+address);
	       
	    
	}
	
}
public class Q3_opp 
{
	public static void main(String[] args) 
	{
		member m1=new member();
		m1.printsalary();
	}
}
