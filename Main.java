import java.util.Scanner;
import java.util.Random;

/**
 *This is a guessing game with while loops
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
    Scanner input = new Scanner(System.in);
    // create a random number generator
    Random rand = new Random();

    // get the random number to guess
    int randInt = rand.nextInt(100) + 1;

    // declare the guess variable
    int guess;

    // create a loop to keep guessing
    do {
      // get the user's guess
      System.out.println("Please enter your guess between 1 and 100");
      guess = input.nextInt();

      // check to see how the guess compares to the random integer
      if ( guess == randInt){
      System.out.println("You are correct! Good job!");
      } else if ( guess > randInt){
      System.out.println("You are too high. Try again.!");
      } else {
      System.out.println("You are too low. Try again!");
    }
  }while (guess != randInt);
    
  } 
}
