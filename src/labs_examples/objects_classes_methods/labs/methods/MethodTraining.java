package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

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
        int s = consonants("kamehameha");
        System.out.println("The String has " + s + " consonants.");
        art();
        boolean bl = isPrime(5);
        System.out.println(bl);
        int[] array = {1, 2, 3, 4, 5};
        highLow(array);
        ArrayList<Integer> nums = arrayList(10, 2, 4);
        System.out.println(nums);
        int[] array3 = {1, 2, 3, 4, 5, 6};
        reverseArray(array3);


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

    public static int largestOf4(int a, int b, int c, int d) {
        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }

    public static int consonants(String a) {
        int c = 0;
        int v = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i'
                    || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                v++;
            } else if ((a.charAt(i) >= 'a') && a.charAt(i) <= 'z') {
                c++;

            }
        }

        return c;
    }

    public static void art() {
        System.out.println("      ())Crayola())>      ");
        System.out.println(" <('-'<) ^(^_^)^ (>'-')> ");
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void highLow(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        int[] array2 = {minValue, maxValue};
        System.out.println(array2);
    }

    public static ArrayList<Integer> arrayList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> nums = new ArrayList(maxNum);
        for (int i = 1; i < maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                nums.add(i);

            }
        }

        return nums;
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - 1 - i] = temp;

        }

        for (int i : array) {
            System.out.print(i + " ");

        }

    }
}













