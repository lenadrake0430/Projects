import javax.swing.JOptionPane;
/**
 Exam class, which extends the Assessment class.
 **/

public class Runner {

        public static void main(String[] args){
        try {
            String input;     // To hold input
            int questions;    // Number of questions
            int missed;       // Number of questions missed

            // Get the number of questions on the exam
            input = JOptionPane.showInputDialog("How many questions are on the exam?");
            questions = Integer.parseInt(input);

            // Get the number of questions the student missed
            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            missed = Integer.parseInt(input);

            // Create an Exam object
            Exam exam = new Exam(questions, missed);

            // Display the test results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);

    } catch (NumberFormatException e) {
        // Handles cases where the user types a string of "four" instead of an integer 4
        JOptionPane.showMessageDialog(null, "Error: Please enter a whole number.");
    } catch (ArithmeticException e) {
        // Handles the division by zero error when questions = 0
        JOptionPane.showMessageDialog(null, "Error: Questions must be greater than zero.");
    }
            System.exit(0);
        }
    }


