package Vehicles;

import DrivingStrategies.NormalDrive;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(){
        super(new NormalDrive());
    }
}
