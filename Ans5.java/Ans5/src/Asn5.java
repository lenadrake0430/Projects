import java.util.ArrayList;
import java.util.Collections;

public class Asn5 {
    public static void main(String[] args) {
        // 1. Create 2 ArrayLists
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        // 2. Add 4 items to each ArrayList (Updated with your fruits!)
        fruits.add("peach");
        fruits.add("plum");
        fruits.add("strawberry");
        fruits.add("pineapple");

        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(99);

        // 3. Display the contents using different loop styles
        System.out.println("--- Initial String ArrayList (Enhanced For-Loop) ---");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        System.out.println("\n--- Initial Integer ArrayList (forEach method) ---");
        scores.forEach(score -> System.out.println("Score: " + score));

        // more operations
        // Removing the fruit at index 1 (plum)
        System.out.println("\nPerforming Operation: Removing item at index 1...");
        fruits.remove(1);

        // Checking if the list contains "strawberry"
        System.out.println("Performing Operation: Checking for 'strawberry'...");
        boolean hasStrawberry = fruits.contains("strawberry");
        System.out.println("Does the list have strawberry? " + hasStrawberry);

        //Display the ArrayLists to see changes
        System.out.println("\n--- Updated String ArrayList (Basic For-Loop) ---");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }

        System.out.println("\n--- Updated Integer ArrayList (forEach method) ---");
        // sort the scores before printing
        Collections.sort(scores);
        scores.forEach(score -> System.out.println("Sorted Score: " + score));
    }
}
