package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
class tryCatch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        try{
            int x = nums[7];
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Error caught!");
        }
    }
}

