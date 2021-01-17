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

    public void start(){
        System.out.println("Starting Electronics...");
    }
}
class VideoGameConsole extends Electronics {
    private int memory;
    private String color;
    private double price;

    public VideoGameConsole(double price){
        super();
        this.price = price;
        memory = 0;
        color = "";
    }
    public VideoGameConsole(boolean isWireless, String brand, int memory, String color, double price){
        super(isWireless, brand);
        this.memory = memory;
        this.color = color;

        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start(){
        System.out.println("Starting VideoGameConsole...");
    }
}

class PlayStation4 extends VideoGameConsole {
    private static final double price = 0;
    private boolean playsBluRay;
    private int storageSize;

    public PlayStation4(double price) {
        super(price);
        playsBluRay = true;
        storageSize = 0;
    }

    public PlayStation4(boolean isWireless, int Memory, boolean playsBluRay, int storageSize) {
        super(isWireless, "Sony", Memory, "Black", price);
        this.playsBluRay = playsBluRay;
        this.storageSize = storageSize;
    }

    public void startPS4 () {
        System.out.println("Starting PS4...");
    }

    public boolean isPlaysBluRay() {
        return playsBluRay;
    }

    public void setPlaysBluRay(boolean playsBluRay) {
        this.playsBluRay = playsBluRay;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public void start(){
        System.out.println("Starting Playstation 4...");
    }

}
