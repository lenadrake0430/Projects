import java.util.Arrays;
import java.util.Random;

public class IntArray {
    // Data fields as specified
    private int length;
    private int myArray[];

    // Constructor to initialize array size
    public IntArray(int l) {
        this.length = l;
        this.myArray = new int[l];
    }

    // Fills array with random numbers (1-6)
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    // Accessor methods
    public int size() {
        return length;
    }

    public int get(int element) {
        return myArray[element];
    }

    // Mutator method to update a specific element
    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    // Resets all elements to zero
    public void clear() {
        for (int i = 0; i < length; i++) {
            myArray[i] = 0;
        }
    }

    // Utility methods for array state
    public boolean isEmpty() {
        return length == 0;
    }

    public void sort() {
        Arrays.sort(myArray);
    }

    // Overridden toString for easy printing in Runner
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}