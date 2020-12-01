package labs_examples.static_nonstatic.labs;

public class ClassController {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        ClassB obj2 = new ClassB();

        obj.methodStatic();
        obj.methodNonStatic();
    }
}
