import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 0 and 15
        int secretNumber = rand.nextInt(16);
        int attempts = 3;
        boolean guessed = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the secret number between 0 and 15. You have 3 attempts.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == secretNumber) {
                System.out.println("🎉 Congratulations! You found the number in " + i + " attempts");
                guessed = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low! Try again.");
            } else {
                System.out.println("Your guess is too high! Try again.");
            }
        }

        if (!guessed) {
            System.out.println("Game over! The secret number was " + secretNumber + ".");
        }

        sc.close();
    }
}
