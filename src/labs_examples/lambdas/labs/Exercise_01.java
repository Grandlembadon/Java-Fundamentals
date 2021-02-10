package labs_examples.lambdas.labs;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

@FunctionalInterface
interface Interface1 {

     void method();


}

class Test {
    public static void main(String[] args) {
        Interface1 obj = () -> System.out.println("Hello!");

        obj.method();

        Interface1 obj2 = new Interface1() {
            public void method() {
                System.out.println("Hi there!");

            }
        };
        obj2.method();

        Interface2 obj3 = (int x) -> x + 2;
        int a = obj3.method2(5);
        System.out.println(a);

        Interface2 obj4 = new Interface2() {
            public int method2(int x) {
                return x + 1;

            }
        };
        int addNumber = obj4.method2(5);
        System.out.println(addNumber);

        Interface3 obj5 = (int x, int y) -> ((x * 2) + (y * 2));
        int multiNum = obj5.method3(20,30);

        Interface3 obj6 = new Interface3() {
            @Override
            public int method3(int x, int y) {
                return x * y;
            }
        };
        int mult = obj6.method3(9,10);
        System.out.println(mult);

        Predicate<Integer> pred = x -> (x >= 10);
        System.out.println(pred.test(99));

        Supplier<String> supp = () -> "Hehe!";
        System.out.println(supp.get());



    }






}



@FunctionalInterface
interface Interface2 {

    int method2(int x);
}

@FunctionalInterface
interface Interface3 {
    int method3(int x, int y);
}
