package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] irreg = {
                {1, 2},
                {3, 4, 5}
        };
        for (int i = 0; i < irreg.length; i++) {

            for (int j = 0; j < irreg[i].length; j++) {
                irreg[i][j] = i * j;
                System.out.println(irreg[i][j] + " - ");
            }
            System.out.println();
        }
    }

}
