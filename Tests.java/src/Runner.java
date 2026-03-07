public class Runner {
    public static void main(String[] args) {
        // Instantiate the object of class Tests
        Tests myTests = new Tests();

        // Call the public class method getAverage()
        // This will prompt the user for input
        myTests.getAverage();

        // Call the class's public toString() method to view the result
        System.out.println(myTests.toString());
    }
}