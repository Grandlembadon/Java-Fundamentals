package labs_examples.conditions_loops.labs;


import java.util.Scanner;


/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7");
        int i = scan.nextInt();
        if (i == 1)
            System.out.println("Monday");
        if (i == 2)
            System.out.println("Tuesday");
        if (i == 3)
            System.out.println("Wednesday");
        if (i == 4)
            System.out.println("Thursday");
        if (i == 5)
            System.out.println("Friday");
        if (i == 6)
            System.out.println("Saturday");
        if (i == 7)
            System.out.println("Sunday");
        if (i > 7)
            System.out.println("other");


    }
}
