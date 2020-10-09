package labs_examples.objects_classes_methods.labs.objects;

import org.omg.IOP.MultipleComponentProfileHelper;

import javax.xml.bind.SchemaOutputResolver;

public class Exercise_01 {
    public static void main(String[] args) {

        AirLine myAirline = new AirLine("Delta");

        Passengers myPassengers = new Passengers(500);

        Speed mySpeed = new Speed(345);

        Model myModel = new Model("Boeing");

        FuelCapacity myCapacity = new FuelCapacity(59651);

        CurrentFuelLevel myFuel = new CurrentFuelLevel(50000);

        Airplane myAirplane = new Airplane(myAirline, myPassengers, myModel, mySpeed, myCapacity, myFuel);

        System.out.println(myAirline.toString());
        System.out.println(myPassengers.toString());
        System.out.println(mySpeed.toString());
        System.out.println(myModel.toString());
        System.out.println(myCapacity.toString());
        System.out.println(myFuel.toString());
        System.out.println(myAirplane.toString());

        mySpeed.setMPH(250);
        double speed = mySpeed.getMPH();

    }
}
class AirLine {

    private String name;

    public AirLine(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Passengers{

    private int PassCount;

    public Passengers(int PassCount){

        this.PassCount = PassCount;

    }

    public int getPassCount() {
        return PassCount;
    }

    public void setPassCount(int passCount) {
        PassCount = passCount;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "PassCount=" + PassCount +
                '}';
    }
}

class Speed {

    private double MPH;

    public Speed(double MPH){

        this.MPH = MPH;
    }

    public double getMPH() {
        return MPH;
    }

    public void setMPH(double MPH) {
        this.MPH = MPH;
    }

    @Override
    public String toString() {
        return "Speed{" +
                "MPH=" + MPH +
                '}';
    }
}

class Model {

    private String ModelName;

    public Model(String ModelName){

        this.ModelName = ModelName;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    @Override
    public String toString() {
        return "Model{" +
                "ModelName='" + ModelName + '\'' +
                '}';
    }
}

class FuelCapacity {

    private double FuelCap;

    public FuelCapacity(double FuelCap){

        this.FuelCap = FuelCap;
    }

    public double getFuelCap() {
        return FuelCap;
    }

    public void setFuelCap(double fuelCap) {
        FuelCap = fuelCap;
    }

    @Override
    public String toString() {
        return "FuelCapacity{" +
                "FuelCap=" + FuelCap +
                '}';
    }
}

class CurrentFuelLevel {

    private double CurrentFuel;

    public CurrentFuelLevel(double CurrentFuel){

        this.CurrentFuel = CurrentFuel;
    }

    public double getCurrentFuel() {
        return CurrentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        CurrentFuel = currentFuel;
    }

    @Override
    public String toString() {
        return "CurrentFuelLevel{" +
                "CurrentFuel=" + CurrentFuel +
                '}';
    }
}

class Airplane {

    AirLine airline;

    Passengers passengers;

    Model model;

    Speed speed;

    FuelCapacity fuelCapacity;

    CurrentFuelLevel currentfuellevel;

    public Airplane(AirLine airline, Passengers passengers, Model model, Speed speed, FuelCapacity fuelCapacity, CurrentFuelLevel currentfuellevel){

        this.airline = airline;

        this.passengers = passengers;

        this.model = model;

        this.speed = speed;

        this.fuelCapacity = fuelCapacity;

        this.currentfuellevel = currentfuellevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "airline=" + airline +
                ", passengers=" + passengers +
                ", model=" + model +
                ", speed=" + speed +
                ", fuelCapacity=" + fuelCapacity +
                ", currentfuellevel=" + currentfuellevel +
                '}';
    }
}

