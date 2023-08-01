package VehicleFactories;

import Vehicles.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String brandName);
}
