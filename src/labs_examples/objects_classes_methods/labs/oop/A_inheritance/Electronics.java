package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Electronics {
    private boolean isWireless;
    private String brand;

    public Electronics() {
        isWireless = false;
        brand = "";
    }
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

    public boolean isWireless(boolean b) {
        return isWireless;
    }

    public String getBrand() {
        return brand;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
class VideoGameConsole extends Electronics {
    private int Memory;
    private String Color;

    public VideoGameConsole(){
        super();
        Memory = 0;
        Color = "";
    }
    public VideoGameConsole(boolean isWireless, String brand, int Memory, String Color){
        super(isWireless, brand);
        this.Memory = Memory;
        this.Color = Color;

    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}

class PlayStation4 extends VideoGameConsole {
    private boolean PlaysBluRay;
    private int StorageSize;

    public PlayStation4(){
        super();
        PlaysBluRay = true;
        StorageSize = 0;
    }
    public PlayStation4(boolean isWireless, String brand, int Memory, String Color, boolean PlaysBluRay, int StorageSize){
        super(isWireless, brand, Memory, Color);
        this.PlaysBluRay = PlaysBluRay;
        this.StorageSize = StorageSize;
    }

    public boolean isPlaysBluRay() {
        return PlaysBluRay;
    }

    public void setPlaysBluRay(boolean playsBluRay) {
        PlaysBluRay = playsBluRay;
    }

    public int getStorageSize() {
        return StorageSize;
    }

    public void setStorageSize(int storageSize) {
        StorageSize = storageSize;
    }

}
