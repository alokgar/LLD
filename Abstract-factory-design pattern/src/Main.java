import VehicleAbstractFactory.AbstractVehicleFactory;
import VehicleFactories.VehicleFactory;
import Vehicles.*;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = AbstractVehicleFactory.getVehicleFactory("ordinary");
        Vehicle vehicle = factory.getVehicle("audi");
        vehicle.getName();
    }
}