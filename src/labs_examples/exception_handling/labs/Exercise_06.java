package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */
class Throwdown {
    public static void main(String[] args) {
        try{
            method();
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Exception caught from below...");
        }


    }
    public static void method() throws ArrayIndexOutOfBoundsException {
        int[] numz = {1,5,3,7};
        try{
            int x = numz[75];
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Exception caught!");
            System.out.println("Throwing exception to main method...");
            throw exc;

        }

    }

}
