package labs_examples.lambdas.labs;

import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.IntConsumer;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Test2 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> subTwo = (x,y) -> System.out.println(x - y);
        subTwo.accept(10,2);

        BooleanSupplier tf = () -> true;
        System.out.println(tf.getAsBoolean());

        IntConsumer con = ()

    }


}