package Collection;
	import java.util.ArrayList;
	import java.util.Collections;

	public class Q8_Col
	{
	    public static void main(String[] args) 
	    {
	        // Create a new ArrayList of strings
	        ArrayList<String> fruits = new ArrayList<>();

	        // Adding some fruits to the ArrayList
	        fruits.add("Orange");
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Pineapple");
	        fruits.add("Grapes");

	        // Print out the ArrayList before sorting
	        System.out.println("ArrayList before sorting:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // Sort the ArrayList
	        Collections.sort(fruits);

	        // Print out the sorted ArrayList
	        System.out.println("\nArrayList after sorting:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
}
}
}
