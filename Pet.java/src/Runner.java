import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Object 1: Default constructor
        Pet p1 = new Pet();
        System.out.println(p1);
        System.out.println();

        // Object 2: Custom constructor
        Pet p2 = new Pet("Buster", "Dog", 11);
        System.out.println(p2);
        System.out.println();

        // Object 3: User input
        System.out.println("Enter animal type:");
        String userType = input.nextLine();

        System.out.println("Enter animal name:");
        String userName = input.nextLine();

        System.out.println("Enter animal age:");
        int userAge = input.nextInt();

        Pet p3 = new Pet(userName, userType, userAge);
        System.out.println(p3);

        input.close();
    }
}