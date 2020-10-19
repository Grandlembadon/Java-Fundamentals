package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Electronics {
    boolean isWireless;
    String brand;

    public Electronics(boolean isWireless, String brand){
        this.isWireless = isWireless;
        this.brand = brand;

    }

}
class VideoGameConsole extends Electronics {
    int Memory;


    public VideoGameConsole(boolean isWireless, String brand) {
        super(isWireless, brand);
    }
}

class PlayStation4 extends VideoGameConsole {

    public PlayStation4(boolean isWireless, String brand) {
        super(isWireless, brand);
    }
}