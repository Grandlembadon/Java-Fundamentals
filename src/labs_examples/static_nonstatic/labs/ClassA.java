package labs_examples.static_nonstatic.labs;

public class ClassA {
    public static void methodStatic(){
        method2();

        ClassA obj = new ClassA();

        obj.method3();

        ClassB.methodBingo();

        ClassB obj2 = new ClassB();

        obj2.methodBongo();
    }
    public void methodNonStatic(){
        method3();

        ClassB obj3 = new ClassB();
        obj3.methodBongo();

        method2();

        obj3.methodBingo();
    }

    private static void method2() {
        System.out.println("This is method 2!!");
    }
    public void method3(){
        System.out.println("This is method 3!!");
    }
}
