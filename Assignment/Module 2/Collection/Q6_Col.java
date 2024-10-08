package Collection;
/*
 
 */
import java.util.ArrayList;

public class Q6_Col {
    public static void main(String[] args) {
        // Create a new ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding some fruits to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        // Print out the ArrayList before removal
        System.out.println("ArrayList before removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove the third element (index 2)
        int indexToRemove = 2;
        fruits.remove(indexToRemove);

        // Print out the ArrayList after removal
        System.out.println("\nArrayList after removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
}
}
}

