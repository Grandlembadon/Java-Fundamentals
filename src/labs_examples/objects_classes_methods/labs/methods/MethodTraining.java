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

        int l = largestOf4(1, 2, 4, 5);
        System.out.println(l);

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int passByValue(int i) {
        return i * 10;
    }

    public void passByReference(Car c) {
        c.color = "Red";
    }

    public static int largestOf4(int a, int b, int c, int d){
        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }
    public static String consonants(String a){
        for(int i =0; i<a.length(); i++) {
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'}


        }


    }
    public static class Car {
        String color;
    }

}







