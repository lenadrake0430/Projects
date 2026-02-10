import java.text.DecimalFormat;

public class Tests {
    public static void main(String[]args)
    {//declaring 3 test scores as a decimal
        double score1 = 90.5;
        double score2 = 88.2;
        double score3 = 70.9;

        //calculating the average of the 3 test scores
        double average = (score1 + score2 + score3) / 3.0;

        //average with 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        //average score results
        System.out.println("Test score 1: " + score1);
        System.out.println("Test score 2: " + score2);
        System.out.println("Test score 3: " + score3);
        System.out.println("The average of 3 tests scores is: " + df.format(average));

    }


}
