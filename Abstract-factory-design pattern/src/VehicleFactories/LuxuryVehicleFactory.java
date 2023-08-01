package VehicleFactories;

import Vehicles.*;

public class LuxuryVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String brandName) {
        switch(brandName){
            case "audi" :
                return new luxuryAudi();

            case "bmw" :
                return new luxuryBmw();

            default:
                return null;
        }
    }
}
