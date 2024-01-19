import java.util.*;
public class NumberGameCODSOFT{
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");

        Scanner sc = new Scanner(System.in);

        while (true) {
            //random number between (1 to 100)
            int targetNumber = generateRandomNumber(1, 100);

            //maximum number of attempts
            int maxAttempts = 7;
            int attempts = 0;

            while (attempts < maxAttempts) {
                
               System.out.print("Guess the number (between 1 and 100): ");
                
               //to check user input to ensure it is an integer
               while (!sc.hasNextInt()) {
                  System.out.print("Invalid input. Enter a valid integer: ");
                  sc.next(); 
               }

               int userGuess = sc.nextInt();

               // Compare the user guess and provide feedback
               if (userGuess == targetNumber) {
                  System.out.println("Congratulations! You guessed the correct number!");
                  break;
               } else if (userGuess < targetNumber) {
                  System.out.println("Too low! Try again.");
               } else {
                  System.out.println("Too high! Try again.");
               }

               attempts++;
            }

            if (attempts == maxAttempts) {
               System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            // user input to ensures it is either 'yes' or 'no'
            while (!playAgain.equals("yes") && !playAgain.equals("no")) {
               System.out.print("Invalid input. Enter either 'yes' or 'no': ");
               playAgain = sc.next().toLowerCase();
            }

            if (playAgain.equals("no")) {
               break;
            }
        }
    }

   // Method to generate a number between 1 to 100
   public static int generateRandomNumber(int min, int max) {
      return (int) (Math.random() * (max - min + 1)) + min;
   }
}