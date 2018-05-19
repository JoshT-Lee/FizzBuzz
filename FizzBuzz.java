import java.util.Scanner;
/**
 * Implements the FizzBuzz counting game
 * Counts all the integers in the inputted range and replaces any multiples of 3 with "Fizz", any
 * multiples of 5 with "Buzz", and any multiples of both 3 and 5 with "FizzBuzz". Otherwise, the 
 * number is printed normally.
 * 
 * @author Joshua Lee
 */
public class FizzBuzz
{
    // Holds the user entered lower and upper bounds to count
    private static int lower;
    private static int higher;
    // Holds the string to print 
    private static String F = "Fizz";
    private static String B = "Buzz";
    private static String FB = "FizzBuzz";

    /** Main method to take user input for the range of numbers to print and print the FizzBuzz 
     * representation of the range
     */
    public static void main() {
      // Read the user input for the counting bounds
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter an integer to start counting at");
      lower = sc.nextInt();
      System.out.println("Please enter an integer to end the counting at");
      higher = sc.nextInt();
      System.out.println("Playing FizzBuzz from " + lower + " to " + higher);
      
      // Iterate through the requested range
      for(int i = lower; i <= higher; i++) {
        if(i % 15 == 0) {
          // Print every 15 numbers to maintain readability
          System.out.println(FB + " ");
        }
        else if(i % 3 == 0) {
          System.out.print(F + " ");
        }
        else if(i % 5 == 0) {
          System.out.print(B + " ");
        }
        else {
          System.out.print(i + " ");
        }
      }
   }
}