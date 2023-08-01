package VehicleAbstractFactory;

import VehicleFactories.*;

public class AbstractVehicleFactory {
    public static VehicleFactory getVehicleFactory(String vehicleType){
        switch (vehicleType){
            case "luxury":
                return new LuxuryVehicleFactory();

            case "ordinary":
                return new OrdinaryVehicleFactory();

            default:
                return null;
        }

    }
}
