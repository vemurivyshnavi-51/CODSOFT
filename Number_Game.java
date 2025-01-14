import java.util.Scanner;

public class numberguess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean playAgain;

        do {
            int number = (int) (Math.random() * 100) + 1;
            int attempts = 5;
            boolean guessedCorrectly = false;
            //System.out.println("Number is " +number);

            System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");
            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
                attempts--;
            }
            
            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + number);
            }

            System.out.print("Play again? (true/false): ");
            playAgain = scanner.nextBoolean();
        } while (playAgain);

        System.out.println("Your score: " + score);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}