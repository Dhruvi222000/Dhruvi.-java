package String;
/*
   Write a Java program to count the letters, spaces, numbers and other characters of 
   an input string. 
 */
import java.util.Scanner;
public class Q1_string 
{
  public static void main(String[] args) 
  {
	          Scanner scanner = new Scanner(System.in);
	          System.out.println("Enter a string:");
	          String input = scanner.nextLine();

	          // Initialize counters
	          int letters = 0, spaces = 0, numbers = 0, others = 0;

	   	          for (int i = 0; i < input.length(); i++)
	   	          {
	              char ch = input.charAt(i);

	              if (Character.isLetter(ch))
	              {
	                  letters++;
	              } else if (Character.isDigit(ch)) 
	              {
	                  numbers++;
	              } else if (Character.isWhitespace(ch)) 
	              {
	                  spaces++;
	              } else 
	              {
	                  others++;
	              }
	   	          }
		   	          System.out.println("Letters: " + letters);
			          System.out.println("Spaces: " + spaces);
			          System.out.println("Numbers: " + numbers);
			          System.out.println("Other characters: " + others);
			          
 scanner.close();
} 
		  
}


