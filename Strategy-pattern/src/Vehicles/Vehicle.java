package Vehicles;

import DrivingStrategies.DriveStrategy;

public class Vehicle {
    public DriveStrategy driver;
    public Vehicle(DriveStrategy driver){
        this.driver = driver;
    }
    public void  drive(){
        driver.drive();
    }
}
