import java.util.Random;
import java.util.Scanner;

public class Level1_Task2_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; 
        int attempts = 5;
        boolean guessedCorrectly = false;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); 
                i--;
                continue;
            }

            int guess = sc.nextInt();

            if (guess == numberToGuess) {
                System.out.println("🎉 Correct! You guessed the number in " + i + " attempts.");
                guessedCorrectly = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Out of attempts! The correct number was: " + numberToGuess);
        }

        sc.close();
    }
}
