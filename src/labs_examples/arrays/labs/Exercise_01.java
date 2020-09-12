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

        int[] array = new int[10];
        int sum = 0;
        double avg;

        for (int i = 0; i < 10; i++){
            System.out.println("Please enter a number" + (i + 1) + ":");
            array[i] = numbers.nextInt();
            sum += array[i];
        }

        avg = (double) sum / 10;
        System.out.println("The sum is " + sum + "and the average is " + avg);

        System.out.println("Please enter ten numbers separated by commas ");
        String nums = numbers.next();
        String[] numsStr = nums.split(",");
        sum = 0;
        avg = 0;
        for (String s : numsStr){
            sum += Integer.parseInt(s);
        }
        avg = (double) sum / 10;
        System.out.println("The sum is " + sum + "and the average is " + avg);
    }

}