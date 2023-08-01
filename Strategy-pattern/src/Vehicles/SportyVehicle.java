package Vehicles;

import DrivingStrategies.*;

public class SportyVehicle extends Vehicle {
    public SportyVehicle(){
        super(new SpecialDrive());
    }
}
