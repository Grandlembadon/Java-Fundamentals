package labs_examples.exception_handling.labs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class tryCatch2 {
    public static void main(String[] args) {
        int[] y = {5,4,3,2};

        try {
            int x = 5/0;
            int b = y[50];
        } catch (ArithmeticException exc){
            System.out.println("Arithmetic Exception caught!");
        } catch (ArrayIndexOutOfBoundsException exc2){
            System.out.println("ArrayIndexOutOfBounds Exception caught!");
        }

    }

}
