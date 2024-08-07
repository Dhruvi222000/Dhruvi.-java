package String;
/*
  W.A.J.P to get the character at the given index within the String. Original String = 
  Tops Technologies! The character at position 0 is T, The character at position 10 is 
  o
 */

public class Q5_string
{
	public static void main(String[] args) 
	{
		 String originalString = "Tops Technologies!";
	        
	        // Array of indices to retrieve characters from
	        int[] indices = {0, 10};
	        
	        // Iterate through each index and print the character at that index
	        for (int index : indices) {
	            if (index >= 0 && index < originalString.length()) {
	                char character = originalString.charAt(index);
	                System.out.println("The character at position " + index + " is " + character);
}else
{
    System.out.println("Index " + index + " is out of bounds for string \"" + originalString + "\"");
}
}
}

	           
}

