package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int i = scan.nextInt();
        for(int c = 0; i < 100; i++){
            System.out.println(i);
            if (i == 50)
                break;
        }
    }
}
