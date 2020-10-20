package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Electronics {
    boolean isWireless;
    String brand;

    public Electronics(boolean isWireless, String brand){
        this.isWireless = isWireless;
        this.brand = brand;

    }
    public static int Multiply(int a, int b){
        return a * b;
    }
    public static double Multiply(double a, double b){
        return a * b;
    }
    public static int Multiply(int a, int b, int c){
        return a * b * c;
    }
    public static int Divide(int a, int b){
        return a / b;
    }
    public static double Divide(double a, double b){
        return a / b;

    }
    public static int Add(int a, int b){
        return a + b;
    }
    public static int Add(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public static double Add(double a, double b){
        return a + b;
    }

}
class VideoGameConsole extends Electronics {
    int Memory;
    String Color;

    public Vi.deoGameConsole(int Memory, String Color){
        this.Memory = Memory;
        this.Color = Color;

    }



    public VideoGameConsole(boolean isWireless, String brand) {
        super(isWireless, brand);
    }
}

class PlayStation4 extends VideoGameConsole {



    public PlayStation4(boolean isWireless, String brand) {
        super(isWireless, brand);
    }
}
