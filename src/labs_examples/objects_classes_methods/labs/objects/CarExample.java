package labs_examples.objects_classes_methods.labs.objects;

/**
 * Created by ryandesmond - https://codingnomads.co
 * /
 * */

class Example {

    public static void main(String[] args){

        Engine myEngine = new Engine(400);

        Stereo myStereo = new Stereo ("Panasonic");

        Car myCar = new Car(myEngine, myStereo, "XTerra", "Blue");

        System.out.println("I drive a " + myCar.color + " " + myCar.model + " with a "

                + myCar.stereo.brand + " stereo, and a " + myCar.engine.horsePower + " engine");

        // OR

        System.out.println(myCar.toString());

    }

}

class Engine {

    double horsePower;

    public Engine(double horsePower){

        this.horsePower = horsePower;

    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
    public void checkEngine() {

    }
}

class Stereo {

    String brand;

    public Stereo(String brand){

        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Stereo{" +
                "brand='" + brand + '\'' +
                '}';
    }
    public void playRadio() {
        System.out.println("Playing Radio...");

    }
    public void changeDiscs() {
        System.out.println("Changing Discs...");

    }
    public void shuffleDiscs() {
        System.out.println("Shuffling Discs...");

    }
}

class Car {

    Engine engine;

    Stereo stereo;

    String model;

    String color;

    public Car(Engine engine, Stereo stereo, String model, String color){

        this.engine = engine;

        this.stereo = stereo;

        this.model = model;

        this.color = color;

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine.toString() +
                ",\n stereo=" + stereo.toString() +
                ",\n model='" + model + '\'' +
                ",\n color='" + color + '\'' +
                '}';
    }
    public void startCar() {
        System.out.println("Starting Car...");

    }
    public void driveCar() {
        System.out.println("Driving Car...");

    }
    public void stopCar() {
        System.out.println("Stopping Car..");
    }
    public void accelerate() {
        System.out.println("Accelerating Car...");
    }
}

