package labs_examples.generics.labs;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.Skill;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.Weapon;

public class GenericsExample<T, V> {
    private T val;
    private V val2;

    public GenericsExample(T val, V val2) {
        this.val = val;
        this.val2 = val2;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public V getVal2() {
        return val2;
    }

    public void setVal2(V val2) {
        this.val2 = val2;
    }

}

class GenericController {
    public static void main(String[] args) {
        GenericsExample<String, Integer> obj = new GenericsExample("Hello!", 5);
        GenericsExample<Weapon, Skill> obj2 = new GenericsExample(new Weapon(),new Skill());

    }

    public static < X extends Number, Y extends Number > double genericSum(X num1, Y num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    public static <T> void test(T val){
        System.out.println(val);
    }
}
