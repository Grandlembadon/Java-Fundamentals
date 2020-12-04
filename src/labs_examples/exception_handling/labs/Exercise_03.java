package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class TryCatchFinal{
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        try{
            int x = nums[5];
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Exception was Caught!");
        } finally {
            System.out.println("The Program is finished!");
        }

    }
}