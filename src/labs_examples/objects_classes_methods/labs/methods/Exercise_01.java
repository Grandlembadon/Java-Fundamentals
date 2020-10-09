package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {


        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 5;
        int b = 20;
        int c = multiply(a,b);
        int d = divide(a,b);
        joke("Douche");
        int e = yearsToSeconds(50);
        int f = varArgs("Hello!", "Friends!");
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){

        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){

        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(String adjective){
        System.out.println("Donald Trump is a " + adjective);
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsToSeconds(int years){
        int secondsInMinute = 60;
        int minutesToHour = 60;
        int hourToDay = 24;
        int daysToYear = 365;
        int secondsInYear = secondsInMinute * minutesToHour * hourToDay * daysToYear;

        return secondsInYear * years;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varArgs(String... n){
        return n.length;

    }






}
