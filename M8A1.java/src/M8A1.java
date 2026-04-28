import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;

// Module 8 Assignment 1 - File I/O
//compute pay rate compute the weekly pay, including overtime pay from a CSV file
//(pay rate is 1.5 times the regular pay rate for all hours worked over 40)data
//calculates weekly pay ,then writes the results to an output.csv file.


public class M8A1 {

    public static void main(String[] args) {
        // Define the input and output file names
        String inputFile = "pay.csv";
        String outputFile = "output.csv";
        String line;

        // try - to open the files safely
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(outputFile)) {

            // Handle the column headings
            // Read and discard the first line of pay.csv (the headers)
            String header = reader.readLine();
            // Write the new headers into output.csv
            writer.println("EmpID,Rate,Hours,Weekly Pay");

            // Process the data from pay.csv line by line
            while ((line = reader.readLine()) != null) {
                // Split the comma-separated line into parts
                String[] data = line.split(",");

                String empID = data[0];
                // Use the Double wrapper class to parse strings into numbers 
                double payRate = Double.parseDouble(data[1]);
                double hoursWorked = Double.parseDouble(data[2]);
                double weeklyPay;

                //Compute weekly pay, including overtime (1.5x for hours > 40)
                if (hoursWorked > 40) {
                    double regularPay = 40 * payRate;
                    double overtimeHours = hoursWorked - 40;
                    double overtimePay = overtimeHours * (payRate * 1.5);
                    weeklyPay = regularPay + overtimePay;
                } else {
                    weeklyPay = hoursWorked * payRate;
                }

                // Format the weekly pay to correct currency and write to output.csv
                String formattedPay = String.format("$%.2f", weeklyPay);

                // Headers EmpID, Rate, Hours, and the formatted String pay
                writer.println(empID + "," + payRate + "," + hoursWorked + "," + formattedPay);
            }

            System.out.println("File processing complete. Results saved to output.csv.");

        } catch (IOException e) {
            // error handling for file access issues
            System.out.println("Error reading or writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Error handling if parsing non-numeric data
            System.out.println("Error: One of the data values is not a valid number.");
        }
    }
}