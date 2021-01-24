package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class BabySupplies {
}
class Diapers extends BabySupplies {
    public Diapers(int totalDumpCapacity, String name, double price) {
        this.totalDumpCapacity = totalDumpCapacity;
        this.name = name;
        this.price = price;
    }

    int totalDumpCapacity;
    String name;
    double price;

}
class Pampers extends Diapers {


    public Pampers(int totalDumpCapacity, String name, double price) {
        super(totalDumpCapacity, name, price);
    }
    public void diaperCounter(){

    }
    public void diaperChanger() {

    }
    public void diaperSwitch() {

    }
}
