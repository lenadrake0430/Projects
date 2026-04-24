/**
 * The Exam class extends the Assessment class.
 * It calculates a numeric score based on the number of questions
 * and the number of questions missed.
 */
public class Exam extends Assessment {
    private int numQuestions;  // Number of questions
    private int numMissed;     // Number of questions missed
    private double pointsEach; // Points per question

    /**
     * The constructor sets the number of questions and number missed.
     * It then calculates the points per question and the final score.
     * @param questions The total number of questions.
     * @param missed The number of questions missed.
     */
    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;

        // Calculate how much each question is worth (out of 100 total points)
        this.pointsEach = 100.0 / questions;

        // Calculate the numeric score
        // Score = 100 - (missed questions * points per question)
        double numericScore = 100.0 - (missed * pointsEach);

        // Call the inherited setScore method from the Assessment class
        // We cast to (int) because the Assessment class expects an integer score.
        setScore((int) numericScore);
    }

    /**
     * The getPointsEach method returns the points per question.
     * @return The value in the pointsEach field.
     */
    public double getPointsEach() {
        return pointsEach;
    }
}
