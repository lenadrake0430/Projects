import java.util.Scanner;

public class Tests {
    // Private data fields
    private double ave;
    private int count;
    private int score;

    // Constructor
    public Tests() {
        this.ave = 0.0;
        this.count = 0;
        this.score = 0;
    }

    // Method to handle user input and calculations
    public void getAverage() {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        count = 0;

        System.out.println("Enter a test score (-1 to quit): ");
        score = input.nextInt(); // Prime the loop

        while (score != -1) {
            sum += score;
            count++;
            System.out.println("Enter a test score (-1 to quit): ");
            score = input.nextInt();
        }

        // Calculate average
        if (count != 0) {
            ave = sum / count;
        } else {
            // This allows the result to be NaN as per your requirement
            ave = 0.0 / 0;
        }
    }

    // Formatted output
    public String toString() {
        return String.format("The average of the %d scores entered is %.2f", count, ave);
    }

    // Required getter/setter methods
    public double getAve() { return ave; }
    public int getCount() { return count; }
    public int getScore() { return score; }
    public void setScore(int newScore) { this.score = newScore; }
}
