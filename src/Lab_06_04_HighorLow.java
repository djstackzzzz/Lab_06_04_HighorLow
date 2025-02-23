import java.util.Scanner;
import java.util.Random;

public class Lab_06_04_HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int target = generator.nextInt(10) + 1; // Generates 1 to 10
        int guess = 0;
        boolean valid = false;

        // Prompt the user to guess the number.
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Your guess must be between 1 and 10.");
                    valid = false;
                } else {
                    valid = true;
                }
            } else {
                String trash = in.next();
                System.out.println("Invalid input: " + trash + ". Please enter an integer between 1 and 10.");
            }
            in.nextLine(); // clear the buffer
        } while (!valid);

        // Display the target and evaluation of the guess.
        System.out.println("Random number: " + target);
        if (guess < target) {
            System.out.println("Your guess was too low.");
        } else if (guess > target) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("On the money!");
        }
    }
}