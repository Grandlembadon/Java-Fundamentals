package labs_examples.objects_classes_methods.labs.objects;

import org.omg.IOP.MultipleComponentProfileHelper;

public class Exercise_01 {
    public static void main(String[] args) {

        AirLine myAirline = new AirLine("Delta");

        Passengers myPassengers = new Passengers(500);

        Speed MySpeed = new Speed(345);

        Model MyModel = new Model("Boeing");

    }
}
class AirLine {

    String name;

    public AirLine(String name){

        this.name = name;
    }

}

class Passengers{

    int PassCount;

    public Passengers(int PassCount){

        this.PassCount = PassCount;

    }
}

class Speed {

    double MPH;

    public Speed(double MPH){

        this.MPH = MPH;
    }
}

class Model {

    String ModelName;

    public Model(String ModelName){

        this.ModelName = ModelName;
    }

}

class FuelCapacity {

    double FuelCap;

    public FuelCapacity(double FuelCap){

        this.FuelCap = FuelCap;
    }

}

class CurrentFuelLevel {

    double CurrentFuel;

    public CurrentFuelLevel(double CurrentFuel){

        this.CurrentFuel = CurrentFuel;
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
}
