package VehicleFactories;

import Vehicles.*;

public class OrdinaryVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String brandName) {
        switch(brandName){
            case "audi" :
                return new ordinaryAudi();

            case "bmw" :
                return new ordinaryBmw();

            default:
                return null;
        }
    }
}
