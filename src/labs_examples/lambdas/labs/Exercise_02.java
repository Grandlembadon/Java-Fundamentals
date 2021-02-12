package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Test2 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> subTwo = (x, y) -> System.out.println(x - y);
        subTwo.accept(10, 2);

        BooleanSupplier tf = () -> true;
        System.out.println(tf.getAsBoolean());

        IntConsumer con = (x) -> System.out.println(x + 50);
        con.accept(50);

        Function<Integer, Integer> func = x -> x * 2;
        Integer mult = func.apply(100);
        System.out.println(mult);

        IntFunction<Integer> iF = x -> x / 10;
        System.out.println(iF.apply(1000));

        IntPredicate iP = x -> x / 5 == 1;
        System.out.println(iP.test(5));

        BiPredicate<Integer, Integer> bP = (x, y) -> {
            if (x == y) {
                return true;
            } else {
                return false;
            }
        };
        bP.test(5, 4);

        int a = 5;
        IntSupplier iS = () -> a * 2;
        System.out.println("a multiplied by 2 is " + iS.getAsInt());

        Consumer<String> cons = str -> str.length();
        cons.accept("Hello!");

        List<Integer> arr = Arrays.asList(1, 2, 3, 4);
        ObjIntConsumer<List<Integer>> ObInCon = (list, numb) -> {
            list.stream().forEach(x -> System.out.println(x + numb));
        };
        ObInCon.accept(arr, 5);


    }
}













