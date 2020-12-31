package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class MyArra {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Please enter a number between 1-10.");
        int n = num.nextInt();
        System.out.println("The index of your number is" + " " + array[n]);

    }






}


