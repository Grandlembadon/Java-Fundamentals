package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    public static void main(String[] args) {
        int i = 4;
        MethodTraining obj = new MethodTraining();
        i = obj.passByValue(i);
        System.out.println(i);

        Car c = new Car();
        c.color = "Blue";
        System.out.println(c.color);
        obj.passByReference(c);
        System.out.println(c.color);

    }
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public int passByValue(int i){
        return i * 10;
    }

    public void passByReference(Car c){
        c.color = "Red";
    }
}

class Car{
    String color;
}

