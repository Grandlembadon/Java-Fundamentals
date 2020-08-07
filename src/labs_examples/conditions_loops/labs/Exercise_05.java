package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        int total = 7;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a lower bound");
        int i = scan.nextInt();
        System.out.println("Please enter a upper bound");
        int i2 = scan.nextInt();
        for(int c = i; c <= i2; c++){
            sum += c;
            average = sum / total;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }



}
