package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Generics<T> {
    private T val1;
    private T val2;

    public Generics(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                '}';
    }
}

class Driver {
    public static void main(String[] args) {
        Generics<String> obj = new Generics("Hello!","Goodbye!");
        Generics<Integer> ob2 = new Generics(7,8);
        Generics<Double> obj3 = new Generics(20.0, 1000.0);


        String s = obj.getVal1();
        int i = ob2.getVal1();
        double d = obj3.getVal1();

        System.out.println(obj.toString());
        System.out.println(ob2.toString());
        System.out.println(obj3.toString());
    }
}

