//Number Guessing Game By Using Java
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalAttempts = 0;
        int roundsWon = 0;
        
        String playAgain = "yes";
        
        while (playAgain.equalsIgnoreCase("yes")) {
            System.out.println("Welcome to the Number Guessing Game!");
            int lowerRange = 1;
            int upperRange = 100;
            int numberToGuess = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
            int attempts = 0;
            
            int maxAttempts = 5;
            
            while (attempts < maxAttempts) {
                try {
                    System.out.printf("Guess the number between %d and %d: ", lowerRange, upperRange);
                    int guess = scanner.nextInt();
                    
                    if (guess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > numberToGuess) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.printf("Congratulations! You guessed the number %d in %d attempts!%n",
                                numberToGuess, attempts + 1);
                        totalAttempts += attempts + 1;
                        roundsWon++;
                        break;
                    }
                    
                    attempts++;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                    scanner.nextLine(); // Clear the input buffer
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.printf("Sorry, you've reached the maximum number of attempts. The number was %d.%n",
                        numberToGuess);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        }
        
        System.out.printf("Game Over! Total rounds won: %d, Total attempts: %d%n", roundsWon, totalAttempts);
        scanner.close();
    }
}
