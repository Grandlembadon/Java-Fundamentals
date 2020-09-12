package labs_examples.arrays.labs;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */
import java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Please enter ten numbers: ");
        int[] array = {numbers.nextInt()};
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);

        }


    }

}