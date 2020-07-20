package variables;

public class Variables {
    //global variable
    //field
    static double val = 123.45;

    public static void main(String[] args) {

        Person myPerson = new Person("Ryan", 36);
        myPerson.age = 37;
        Person yourPerson = new Person("SomeCoolName", 30);
        Person einstein = new Person("Einstein", 110);
        Person ellen = new Person("Ellen", 50);

        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(einstein.toString());
        System.out.println(ellen.toString());

        double x = multiply(val,val * 2);
    }
    public static double multiply(double a, double b){

        double result = a * b;
        printNum(result);
        return result;
    }
    public static void printNum(double numToPrint){
        System.out.println(numToPrint);
    }


}
