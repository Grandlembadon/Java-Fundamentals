package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class TryCatch{
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        try {
            int z = x / y;

        } catch (ArithmeticException exc1){
            System.out.println("Arithmetic Exception Caught!");
            try {
                int i = x / y;
            } catch (ArithmeticException exc2){
                System.out.println("Inner Exception Caught!");
            }
        }
    }

}